package me.devsaki.hentoid.activities;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.DocumentsContract;
import android.view.View;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.documentfile.provider.DocumentFile;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.lmntrx.android.library.livin.missme.ProgressDialog;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import me.devsaki.hentoid.HentoidApp;
import me.devsaki.hentoid.R;
import me.devsaki.hentoid.activities.bundles.ImportActivityBundle;
import me.devsaki.hentoid.database.ObjectBoxDB;
import me.devsaki.hentoid.enums.Site;
import me.devsaki.hentoid.events.ProcessEvent;
import me.devsaki.hentoid.notification.import_.ImportNotificationChannel;
import me.devsaki.hentoid.services.ImportService;
import me.devsaki.hentoid.util.Consts;
import me.devsaki.hentoid.util.ConstsImport;
import me.devsaki.hentoid.util.ContentHelper;
import me.devsaki.hentoid.util.FileHelper;
import me.devsaki.hentoid.util.Preferences;
import me.devsaki.hentoid.util.ThemeHelper;
import timber.log.Timber;

import static android.os.Build.VERSION_CODES.O;
import static android.provider.DocumentsContract.EXTRA_INITIAL_URI;

/**
 * Created by avluis on 04/02/2016.
 * Library Directory selection and Import Activity
 * <p>
 * NB : This activity is transparent and not lockable; it should _not_ be a child of BaseActivity
 */
public class ImportActivity extends AppCompatActivity {

    // Instance state keys
    private static final String CURRENT_DIR = "currentDir";
    private static final String PREV_DIR = "prevDir";
    private static final String CALLED_BY_PREFS = "calledByPrefs";
    private static final String REFRESH_OPTIONS = "refreshOptions";


    private DocumentFile currentRootDir;
    private DocumentFile prevRootDir;
    private OnBackPressedCallback callback;
    private boolean calledByPrefs = false;              // True if activity has been called by PrefsActivity
    private boolean isRefresh = false;                  // True if user has asked for a collection refresh
    private boolean isRename = false;                   // True if user has asked for a collection renaming
    private boolean isCleanAbsent = false;              // True if user has asked for the cleanup of folders with no JSONs
    private boolean isCleanNoImages = false;            // True if user has asked for the cleanup of folders with no images
    private boolean isCleanUnreadable = false;          // True if user has asked for the cleanup of folders with unreadable JSONs

    private ProgressDialog progressDialog;


    private final static FileHelper.NameFilter hentoidFolderNames = displayName -> displayName.equalsIgnoreCase(Consts.DEFAULT_LOCAL_DIRECTORY)
            || displayName.equalsIgnoreCase(Consts.DEFAULT_LOCAL_DIRECTORY_OLD);


    // TODO try once more to use the refresh options without selecting anything in the SAF dialog

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View contentView = new View(this, null);
        setContentView(contentView);

        callback = new OnBackPressedCallback(false) {
            @Override
            public void handleOnBackPressed() {
                customBackPress();
            }
        };
        getOnBackPressedDispatcher().addCallback(this, callback);

        Intent intent = getIntent();
        if (intent != null) {
            if (intent.getAction() != null) {
                switch (intent.getAction()) {
                    case Intent.ACTION_APPLICATION_PREFERENCES:
                        Timber.d("Running from prefs screen.");
                        calledByPrefs = true;
                        break;
                    default:
                        Timber.d("Intent: %s Action: %s", intent, intent.getAction());
                        break;
                }
            }

            if (intent.getExtras() != null) {
                ImportActivityBundle.Parser parser = new ImportActivityBundle.Parser(intent.getExtras());
                isRefresh = parser.getRefresh();
                isRename = parser.getRefreshRename();
                isCleanAbsent = parser.getRefreshCleanAbsent();
                isCleanNoImages = parser.getRefreshCleanNoImages();
                isCleanUnreadable = parser.getRefreshCleanUnreadable();
            }
        }

        EventBus.getDefault().register(this);
        prepImport(savedInstanceState);
    }

    public void customBackPress() {
        exit(RESULT_CANCELED, ConstsImport.RESULT_CANCELED);
    }

    @Override
    protected void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    private void prepImport(Bundle savedState) {
        if (savedState != null) {
            if (savedState.containsKey(CURRENT_DIR))
                currentRootDir = DocumentFile.fromTreeUri(this, Uri.parse(savedState.getString(CURRENT_DIR)));
            if (savedState.containsKey(PREV_DIR))
                prevRootDir = DocumentFile.fromTreeUri(this, Uri.parse(savedState.getString(PREV_DIR)));
            calledByPrefs = savedState.getBoolean(CALLED_BY_PREFS);

            Bundle bundle = savedState.getBundle(REFRESH_OPTIONS);
            if (bundle != null) {
                ImportActivityBundle.Parser parser = new ImportActivityBundle.Parser(bundle);
                isRefresh = parser.getRefresh();
                isRename = parser.getRefreshRename();
                isCleanAbsent = parser.getRefreshCleanAbsent();
                isCleanNoImages = parser.getRefreshCleanNoImages();
                isCleanUnreadable = parser.getRefreshCleanUnreadable();
            }
        }

        String downloadFolderUriStr = Preferences.getStorageUri();
        Timber.d("downloadFolderUriStr %s", downloadFolderUriStr);

        if (!downloadFolderUriStr.isEmpty()) {
            DocumentFile downloadFolder = DocumentFile.fromTreeUri(this, Uri.parse(downloadFolderUriStr));
            if (downloadFolder != null && downloadFolder.exists()) currentRootDir = downloadFolder;
        }
        openFolderPicker();
    }

    // Try and detect any ".Hentoid" or "Hentoid" folder inside the selected folder
    private DocumentFile getExistingHentoidDirFrom(@NonNull DocumentFile root) {
        if (!root.exists() || !root.isDirectory() || null == root.getName()) return root;

        // Selected folder _is_ the Hentoid folder
        if (hentoidFolderNames.accept(root.getName())) return root;

        // If not, look for it in its children
        List<DocumentFile> hentoidDirs = FileHelper.listFolders(this, root, hentoidFolderNames);
        if (!hentoidDirs.isEmpty()) return hentoidDirs.get(0);
        else return root;
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        if (currentRootDir != null)
            outState.putString(CURRENT_DIR, currentRootDir.getUri().toString());
        if (prevRootDir != null) outState.putString(PREV_DIR, prevRootDir.getUri().toString());
        outState.putBoolean(CALLED_BY_PREFS, calledByPrefs);

        ImportActivityBundle.Builder builder = new ImportActivityBundle.Builder();

        builder.setRefresh(isRefresh);
        builder.setRefreshRename(isRename);
        builder.setRefreshCleanAbsent(isCleanAbsent);
        builder.setRefreshCleanNoImages(isCleanNoImages);
        builder.setRefreshCleanUnreadable(isCleanUnreadable);

        outState.putBundle(REFRESH_OPTIONS, builder.getBundle());

        super.onSaveInstanceState(outState);
    }

    // Callback after user has granted I/O permissions
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == ConstsImport.RQST_STORAGE_PERMISSION) {
            if (grantResults.length > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permissions granted
                exit(RESULT_OK, ConstsImport.PERMISSION_GRANTED);
            } else {
                // Permissions denied
                if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                    exit(RESULT_CANCELED, ConstsImport.PERMISSION_DENIED);
                } else {
                    exit(RESULT_CANCELED, ConstsImport.PERMISSION_DENIED_FORCED);
                }
            }
        }
    }

    // TODO to use when processing known folder without selecting it (again) with SAF picker
    private void initImport() {
        importFolder(getExistingHentoidDirFrom(currentRootDir));
    }

    private void openFolderPicker() {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            intent.putExtra(DocumentsContract.EXTRA_PROMPT, "Allow Write Permission");
        }
        // http://stackoverflow.com/a/31334967/1615876
        intent.putExtra("android.content.extra.SHOW_ADVANCED", true);

        // Start the SAF at the specified location
        if (Build.VERSION.SDK_INT >= O && !Preferences.getStorageUri().isEmpty()) {
            DocumentFile file = DocumentFile.fromTreeUri(this, Uri.parse(Preferences.getStorageUri()));
            if (file != null)
                intent.putExtra(EXTRA_INITIAL_URI, file.getUri());
        }

        HentoidApp.LifeCycleListener.disable(); // Prevents the app from displaying the PIN lock when returning from the SAF dialog

        startActivityForResult(intent, ConstsImport.RQST_STORAGE_PERMISSION);
    }

    // Return from SAF picker
    // TODO - check if the processing can be done on a separate thread to avoid freezing while displaying the SAF dialog
    // TODO - just after a successful import, when the SAF dialog is reopened and another folder is chosen, that method is never called <-- fixed recently ?
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        HentoidApp.LifeCycleListener.enable(); // Restores autolock on app going to background

        // Return from the SAF picker
        if (requestCode == ConstsImport.RQST_STORAGE_PERMISSION && resultCode == RESULT_OK) {
            // Get Uri from Storage Access Framework
            Uri treeUri = data.getData();
            if (treeUri != null) onSelectSAFRootFolder(treeUri);
        } else if (resultCode == RESULT_CANCELED) {
            exit(RESULT_CANCELED, ConstsImport.RESULT_CANCELED);
        }
    }

    // Return from SAF picker
    public void onSelectSAFRootFolder(@NonNull final Uri treeUri) {

        // Release previous access permissions, if different than the new one
        FileHelper.revokePreviousPermissions(this, treeUri);

        // Persist new access permission
        getContentResolver().takePersistableUriPermission(treeUri,
                Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);


        /*
        String treePath = treeUri.getPath();

        if (null == treePath || !treePath.contains(":")) {
            Timber.w("Invalid treePath : '%s'", treePath);
            return;
        }

        int treePathSeparator = treePath.indexOf(':');
        String folderName = treePath.substring(treePathSeparator + 1);

        // Determine whether the designated file is
        // - on a removable media (e.g. SD card, OTG)
        // or
        // - on the internal phone memory

        File selectedFolder = null;
        String[] removableMediaFolderRoots = FileHelper.getExtSdCardPaths();
        /* First test is to compare root names with known roots of removable media

         In many cases, the SD card root name is shared between pre-SAF (File) and SAF (DocumentFile) frameworks
         (e.g. /storage/3437-3934 vs. /tree/3437-3934)

         This is what the following block is trying to do
         */
        /*
        for (String s : removableMediaFolderRoots) {
            String sRoot = s.substring(s.lastIndexOf(File.separatorChar));
            String treeRoot = treePath.substring(0, treePathSeparator);
            treeRoot = treeRoot.substring(treeRoot.lastIndexOf(File.separatorChar));
            if (sRoot.equalsIgnoreCase(treeRoot)) {
                // Persist selected folder URI in shared preferences
                // NB : calling saveUri populates the preference used by FileHelper.isSAF, which indicates the library storage is on an SD card / an external USB storage device
                FileHelper.saveUri(treeUri);
                selectedFolder = new File(s + File.separatorChar + folderName);
                break;
            }
        }
*/
        /* In some other cases, there is no common name (e.g. /storage/sdcard1 vs. /tree/3437-3934)

            We can use a slower method to translate the Uri obtained with SAF into a pre-SAF path
            and compare it to the known removable media volume names */
        /*
        if (null == selectedFolder) {
            for (String s : removableMediaFolderRoots) {
                String treeRoot = FileHelper.getFullPathFromTreeUri(treeUri, this);
                if (treeRoot != null && treeRoot.startsWith(s)) {
                    // Persist selected folder URI in shared preferences
                    FileHelper.saveUri(treeUri);
                    selectedFolder = new File(treeRoot);
                    break;
                }
            }
        }

        // Finally, try with (or fall back to) phone memory
        if (null == selectedFolder) {
            FileHelper.clearUri();
            selectedFolder = new File(Environment.getExternalStorageDirectory(), folderName);
        }
         */

        // Is this even possible, knowing that we just c
        DocumentFile docFile = DocumentFile.fromTreeUri(this, treeUri);
        if (null == docFile || !docFile.exists()) {
            // Is that even possible, knowing that we just come from the SAF picker ?
            String message = String.format("Could not find the selected file %s", treeUri.toString());
            Timber.e(message);
            exit(RESULT_CANCELED, message);
            return;
        }

        importFolder(docFile);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onImportEventProgress(ProcessEvent event) {
        if (ProcessEvent.EventType.PROGRESS == event.eventType) {
            progressDialog.setMax(event.elementsTotal);
            progressDialog.setProgress(event.elementsOK + event.elementsKO);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onImportEventComplete(ProcessEvent event) {
        if (ProcessEvent.EventType.COMPLETE == event.eventType) {
            if (progressDialog != null) progressDialog.dismiss();
            exit(RESULT_OK, (event.elementsOK > 0) ? ConstsImport.EXISTING_LIBRARY_IMPORTED : ConstsImport.NEW_LIBRARY_CREATED);
        }
    }

    // Count the elements inside each site's download folder (but not its subfolders)
    //
    // NB : this method works approximately because it doesn't try to count JSON files
    // However, findFilesRecursively -the method used by ImportService- is too slow on certain phones
    // and might cause freezes -> we stick to that approximate method for ImportActivity
    private boolean hasBooks() {
        List<DocumentFile> downloadDirs = new ArrayList<>();
        for (Site s : Site.values())
            downloadDirs.add(ContentHelper.getOrCreateSiteDownloadDir(this, s));

        for (DocumentFile downloadDir : downloadDirs) {
            List<DocumentFile> contentFiles = FileHelper.listFolders(this, downloadDir);
            if (!contentFiles.isEmpty()) return true;
        }

        return false;
    }

    private void importFolder(@NonNull final DocumentFile targetFolder) {
        // TODO re-create "addHentoidDir" because getExistingHentoidDirFrom doesn't add any directory when none found
        DocumentFile hentoidFolder = getExistingHentoidDirFrom(targetFolder);
        if (!FileHelper.checkAndSetRootFolder(this, hentoidFolder, true)) {
            prepImport(null);
            return;
        }

        if (hasBooks()) {
            if (isRefresh)
                runImport(); // Do not ask if the user wants to import if he has asked for a refresh
            else
                new MaterialAlertDialogBuilder(this, ThemeHelper.getIdForCurrentTheme(this, R.style.Theme_Light_Dialog))
                        .setIcon(R.drawable.ic_warning)
                        .setCancelable(false)
                        .setTitle(R.string.app_name)
                        .setMessage(R.string.contents_detected)
                        .setPositiveButton(android.R.string.yes,
                                (dialog1, which) -> {
                                    dialog1.dismiss();
                                    runImport();
                                })
                        .setNegativeButton(android.R.string.no,
                                (dialog12, which) -> {
                                    dialog12.dismiss();
                                    // Prior Library found, but user chose to cancel
                                    if (prevRootDir != null) currentRootDir = prevRootDir;
                                    if (currentRootDir != null)
                                        FileHelper.checkAndSetRootFolder(this, currentRootDir, false);
                                    exit(RESULT_CANCELED, ConstsImport.EXISTING_LIBRARY_FOUND);
                                })
                        .create()
                        .show();
        } else {
            // New library created - drop and recreate db (in case user is re-importing)
            cleanUpDB();

            new Handler().postDelayed(() -> exit(RESULT_OK, ConstsImport.NEW_LIBRARY_CREATED), 100);
        }
    }

    private void runImport() {
        // Prior Library found, drop and recreate db
        cleanUpDB();
        // Send results to scan
        // TODO investigate if spawning a dialog in an invisible-themed activity such as this one can generate an invisible dialog on some devices
        progressDialog = new ProgressDialog(this);
        progressDialog.setIndeterminate(false);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setMax(0);
        progressDialog.setCancelable(false);
        progressDialog.setColor(ThemeHelper.getColor(this, R.color.secondary_light));
        progressDialog.setTextColor(R.color.white_opacity_87);
        progressDialog.setMessage(this.getString(R.string.importing_please_wait));
        progressDialog.show();

        ImportNotificationChannel.init(this);
        Intent intent = ImportService.makeIntent(this);

        ImportActivityBundle.Builder builder = new ImportActivityBundle.Builder();
        builder.setRefresh(isRefresh);
        builder.setRefreshRename(isRename);
        builder.setRefreshCleanAbsent(isCleanAbsent);
        builder.setRefreshCleanNoImages(isCleanNoImages);
        builder.setRefreshCleanUnreadable(isCleanUnreadable);
        intent.putExtras(builder.getBundle());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
    }

    private void cleanUpDB() {
        Timber.d("Cleaning up DB.");
        Context context = HentoidApp.getInstance();
        ObjectBoxDB db = ObjectBoxDB.getInstance(context);
        db.deleteAllBooks();
    }

    private void exit(int resultCode, String data) {
        Timber.d("Import activity exit - Data : %s", data);

        callback.remove();
        Intent returnIntent = new Intent();
        returnIntent.putExtra(ConstsImport.RESULT_KEY, data);
        setResult(resultCode, returnIntent);
        finish();
    }
}