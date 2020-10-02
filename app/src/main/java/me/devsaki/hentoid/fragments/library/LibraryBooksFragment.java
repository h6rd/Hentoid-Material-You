package me.devsaki.hentoid.fragments.library;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.documentfile.provider.DocumentFile;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.annimon.stream.Stream;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;
import com.mikepenz.fastadapter.drag.ItemTouchCallback;
import com.mikepenz.fastadapter.drag.SimpleDragCallback;
import com.mikepenz.fastadapter.extensions.ExtensionsFactories;
import com.mikepenz.fastadapter.listeners.ClickEventHook;
import com.mikepenz.fastadapter.paged.PagedModelAdapter;
import com.mikepenz.fastadapter.select.SelectExtension;
import com.mikepenz.fastadapter.select.SelectExtensionFactory;
import com.mikepenz.fastadapter.swipe.SimpleSwipeCallback;
import com.mikepenz.fastadapter.swipe_drag.SimpleSwipeDragCallback;
import com.mikepenz.fastadapter.utils.DragDropUtil;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import me.devsaki.hentoid.BuildConfig;
import me.devsaki.hentoid.R;
import me.devsaki.hentoid.activities.LibraryActivity;
import me.devsaki.hentoid.activities.QueueActivity;
import me.devsaki.hentoid.activities.SearchActivity;
import me.devsaki.hentoid.activities.bundles.ContentItemBundle;
import me.devsaki.hentoid.activities.bundles.SearchActivityBundle;
import me.devsaki.hentoid.database.domains.Attribute;
import me.devsaki.hentoid.database.domains.Content;
import me.devsaki.hentoid.database.domains.Group;
import me.devsaki.hentoid.enums.Grouping;
import me.devsaki.hentoid.enums.Site;
import me.devsaki.hentoid.enums.StatusContent;
import me.devsaki.hentoid.events.AppUpdatedEvent;
import me.devsaki.hentoid.services.ContentQueueManager;
import me.devsaki.hentoid.util.ContentHelper;
import me.devsaki.hentoid.util.Debouncer;
import me.devsaki.hentoid.util.FileHelper;
import me.devsaki.hentoid.util.Helper;
import me.devsaki.hentoid.util.Preferences;
import me.devsaki.hentoid.util.RandomSeedSingleton;
import me.devsaki.hentoid.util.ThemeHelper;
import me.devsaki.hentoid.util.ToastUtil;
import me.devsaki.hentoid.viewholders.ContentItem;
import me.devsaki.hentoid.viewholders.IDraggableViewHolder;
import me.devsaki.hentoid.viewmodels.LibraryViewModel;
import me.devsaki.hentoid.viewmodels.ViewModelFactory;
import me.devsaki.hentoid.widget.LibraryPager;
import me.zhanghai.android.fastscroll.FastScrollerBuilder;
import timber.log.Timber;

import static androidx.core.view.ViewCompat.requireViewById;
import static com.annimon.stream.Collectors.toCollection;

public class LibraryBooksFragment extends Fragment implements ErrorsDialogFragment.Parent, ItemTouchCallback, SimpleSwipeCallback.ItemSwipeCallback {

    private static final String KEY_LAST_LIST_POSITION = "last_list_position";


    // ======== COMMUNICATION
    private OnBackPressedCallback callback;
    // Viewmodel
    private LibraryViewModel viewModel;
    // Settings listener
    private final SharedPreferences.OnSharedPreferenceChangeListener prefsListener = (p, k) -> onSharedPreferenceChanged(k);


    // ======== UI
    // Wrapper for the bottom pager
    private final LibraryPager pager = new LibraryPager(this::handleNewPage);
    // Text that displays in the background when the list is empty
    private TextView emptyText;
    // Main view where books are displayed
    private RecyclerView recyclerView;
    // LayoutManager of the recyclerView
    private LinearLayoutManager llm;

    // === SORT TOOLBAR
    // Sort direction button
    private ImageView sortDirectionButton;
    // Sort field button
    private TextView sortFieldButton;

    // === SELECTION TOOLBAR
    private Toolbar toolbar;
    private Toolbar selectionToolbar;
    private MenuItem deleteMenu;
    private MenuItem shareMenu;
    private MenuItem archiveMenu;
    private MenuItem changeGroupMenu;
    private MenuItem folderMenu;
    private MenuItem redownloadMenu;
    private MenuItem coverMenu;

    // === FASTADAPTER COMPONENTS AND HELPERS
    private ItemAdapter<ContentItem> itemAdapter;
    private PagedModelAdapter<Content, ContentItem> pagedItemAdapter;
    private FastAdapter<ContentItem> fastAdapter;
    private SelectExtension<ContentItem> selectExtension;
    private ItemTouchHelper touchHelper;


    // ======== VARIABLES
    // Records the system time (ms) when back button has been last pressed (to detect "double back button" event)
    private long backButtonPressed;
    // Used to ignore native calls to onBookClick right after that book has been deselected
    private boolean invalidateNextBookClick = false;
    // Total number of books in the whole unfiltered library
    private int totalContentCount;
    // True when a new search has been performed and its results have not been handled yet
    // False when the refresh is passive (i.e. not from a direct user action)
    private boolean newSearch = false;
    // Collection of books according to current filters
    private PagedList<Content> library;
    // Position of top item to memorize or restore (used when activity is destroyed and recreated)
    private int topItemPosition = -1;
    // TODO doc
    private Group group = null;

    // Used to start processing when the recyclerView has finished updating
    private final Debouncer<Integer> listRefreshDebouncer = new Debouncer<>(75, this::onRecyclerUpdated);
    private int itemToRefreshIndex = -1;


    /**
     * Diff calculation rules for list items
     * <p>
     * Created once and for all to be used by FastAdapter in endless mode (=using Android PagedList)
     */
    private final AsyncDifferConfig<Content> asyncDifferConfig = new AsyncDifferConfig.Builder<>(new DiffUtil.ItemCallback<Content>() {
        @Override
        public boolean areItemsTheSame(@NonNull Content oldItem, @NonNull Content newItem) {
//            return oldItem.equals(newItem) && oldItem.getCover().equals(newItem.getCover());
//            return oldItem.equals(newItem) && oldItem.getCoverImageUrl().equals(newItem.getCoverImageUrl());
            return oldItem.equals(newItem);
        }

        @Override
        public boolean areContentsTheSame(@NonNull Content oldItem, @NonNull Content newItem) {
            return oldItem.getUrl().equalsIgnoreCase(newItem.getUrl())
                    && oldItem.getSite().equals(newItem.getSite())
                    && oldItem.getLastReadDate() == newItem.getLastReadDate()
                    && oldItem.getCoverImageUrl().equals(newItem.getCoverImageUrl())
//                    && oldItem.isBeingDeleted() == newItem.isBeingDeleted()
                    && oldItem.isFavourite() == newItem.isFavourite();
        }

        @Nullable
        @Override
        public Object getChangePayload(@NonNull Content oldItem, @NonNull Content newItem) {
            ContentItemBundle.Builder diffBundleBuilder = new ContentItemBundle.Builder();

            if (oldItem.isFavourite() != newItem.isFavourite()) {
                diffBundleBuilder.setIsFavourite(newItem.isFavourite());
            }
            if (oldItem.getReads() != newItem.getReads()) {
                diffBundleBuilder.setReads(newItem.getReads());
            }
            if (!oldItem.getCoverImageUrl().equals(newItem.getCoverImageUrl())) {
                diffBundleBuilder.setCoverUri(newItem.getCover().getFileUri());
            }

            if (diffBundleBuilder.isEmpty()) return null;
            else return diffBundleBuilder.getBundle();
        }

    }).build();

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                customBackPress();
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ExtensionsFactories.INSTANCE.register(new SelectExtensionFactory());
        EventBus.getDefault().register(this);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_library_books, container, false);

        Preferences.registerPrefsChangedListener(prefsListener);

        ViewModelFactory vmFactory = new ViewModelFactory(requireActivity().getApplication());
        viewModel = new ViewModelProvider(requireActivity(), vmFactory).get(LibraryViewModel.class);

        initUI(rootView);
        initToolbars();

        selectionToolbar.setOnMenuItemClickListener(this::selectionToolbarOnItemClicked);

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel.getNewSearch().observe(getViewLifecycleOwner(), this::onNewSearch);
        viewModel.getLibraryPaged().observe(getViewLifecycleOwner(), this::onLibraryChanged);
        viewModel.getTotalContent().observe(getViewLifecycleOwner(), this::onTotalContentChanged);
        viewModel.getGroup().observe(getViewLifecycleOwner(), this::onGroupChanged);

        viewModel.updateOrder(); // Trigger a blank search

        // Display pager tooltip
        if (pager.isVisible()) pager.showTooltip(getViewLifecycleOwner());
    }

    /**
     * Initialize the UI components
     *
     * @param rootView Root view of the library screen
     */
    private void initUI(@NonNull View rootView) {
        LibraryActivity activity = ((LibraryActivity) requireActivity());
        emptyText = requireViewById(rootView, R.id.library_empty_txt);

        // Sort controls
        sortDirectionButton = activity.getSortDirectionButton();
        sortDirectionButton.setImageResource(Preferences.isContentSortDesc() ? R.drawable.ic_simple_arrow_down : R.drawable.ic_simple_arrow_up);
        sortDirectionButton.setOnClickListener(v -> {
            boolean sortDesc = !Preferences.isContentSortDesc();
            Preferences.setContentSortDesc(sortDesc);
            // Update icon
            sortDirectionButton.setImageResource(sortDesc ? R.drawable.ic_simple_arrow_down : R.drawable.ic_simple_arrow_up);
            // Run a new search
            viewModel.updateOrder();
            activity.sortCommandsAutoHide(true, null);
        });
        sortFieldButton = activity.getSortFieldButton();
        sortFieldButton.setText(getNameFromFieldCode(Preferences.getContentSortField()));
        sortFieldButton.setOnClickListener(v -> {
            // Load and display the field popup menu
            PopupMenu popup = new PopupMenu(requireContext(), sortDirectionButton);
            popup.getMenuInflater()
                    .inflate(R.menu.library_sort_menu, popup.getMenu());
            popup.getMenu().findItem(R.id.sort_custom).setVisible(group.hasCustomBookOrder);
            popup.setOnMenuItemClickListener(item -> {
                // Update button text
                sortFieldButton.setText(item.getTitle());
                item.setChecked(true);
                int fieldCode = getFieldCodeFromMenuId(item.getItemId());
                if (fieldCode == Preferences.Constant.ORDER_FIELD_RANDOM)
                    RandomSeedSingleton.getInstance().renewSeed();

                Preferences.setContentSortField(fieldCode);
                // Run a new search
                viewModel.updateOrder();
                activity.sortCommandsAutoHide(true, popup);
                return true;
            });
            popup.show(); //showing popup menu
            activity.sortCommandsAutoHide(true, popup);
        }); //closing the setOnClickListener method

        // RecyclerView
        recyclerView = requireViewById(rootView, R.id.library_list);
        llm = (LinearLayoutManager) recyclerView.getLayoutManager();
        new FastScrollerBuilder(recyclerView).build();

        // Pager
        pager.initUI(rootView);
        setPagingMethod(Preferences.getEndlessScroll(), false);
    }

    private String getQuery() {
        return ((LibraryActivity) requireActivity()).getQuery();
    }

    private void setQuery(String query) {
        ((LibraryActivity) requireActivity()).setQuery(query);
    }

    private List<Attribute> getMetadata() {
        return ((LibraryActivity) requireActivity()).getMetadata();
    }

    private void setMetadata(List<Attribute> attrs) {
        ((LibraryActivity) requireActivity()).setMetadata(attrs);
    }

    public void onSearch(String query) {
        viewModel.searchUniversal(query);
    }

    private int getFieldCodeFromMenuId(@IdRes int menuId) {
        switch (menuId) {
            case (R.id.sort_title):
                return Preferences.Constant.ORDER_FIELD_TITLE;
            case (R.id.sort_artist):
                return Preferences.Constant.ORDER_FIELD_ARTIST;
            case (R.id.sort_pages):
                return Preferences.Constant.ORDER_FIELD_NB_PAGES;
            case (R.id.sort_dl_date):
                return Preferences.Constant.ORDER_FIELD_DOWNLOAD_DATE;
            case (R.id.sort_read_date):
                return Preferences.Constant.ORDER_FIELD_READ_DATE;
            case (R.id.sort_reads):
                return Preferences.Constant.ORDER_FIELD_READS;
            case (R.id.sort_size):
                return Preferences.Constant.ORDER_FIELD_SIZE;
            case (R.id.sort_custom):
                return Preferences.Constant.ORDER_FIELD_CUSTOM;
            case (R.id.sort_random):
                return Preferences.Constant.ORDER_FIELD_RANDOM;
            default:
                return Preferences.Constant.ORDER_FIELD_NONE;
        }
    }

    private int getNameFromFieldCode(int prefFieldCode) {
        switch (prefFieldCode) {
            case (Preferences.Constant.ORDER_FIELD_TITLE):
                return R.string.sort_title;
            case (Preferences.Constant.ORDER_FIELD_ARTIST):
                return R.string.sort_artist;
            case (Preferences.Constant.ORDER_FIELD_NB_PAGES):
                return R.string.sort_pages;
            case (Preferences.Constant.ORDER_FIELD_DOWNLOAD_DATE):
                return R.string.sort_dl_date;
            case (Preferences.Constant.ORDER_FIELD_READ_DATE):
                return R.string.sort_read_date;
            case (Preferences.Constant.ORDER_FIELD_READS):
                return R.string.sort_reads;
            case (Preferences.Constant.ORDER_FIELD_SIZE):
                return R.string.sort_size;
            case (Preferences.Constant.ORDER_FIELD_CUSTOM):
                return R.string.sort_custom;
            case (Preferences.Constant.ORDER_FIELD_RANDOM):
                return R.string.sort_random;
            default:
                return R.string.sort_invalid;
        }
    }

    private void initToolbars() {
        if (!(requireActivity() instanceof LibraryActivity)) return;
        LibraryActivity activity = (LibraryActivity) requireActivity();

        toolbar = activity.getToolbar();
        MenuItem editModeMenu = toolbar.getMenu().findItem(R.id.action_edit);
        editModeMenu.setOnMenuItemClickListener(v -> toggleEditMode());
        MenuItem editCancelMenu = toolbar.getMenu().findItem(R.id.action_edit_cancel);
        editCancelMenu.setOnMenuItemClickListener(v -> cancelEditMode());

        selectionToolbar = activity.getSelectionToolbar();
        selectionToolbar.setNavigationOnClickListener(v -> {
            selectExtension.deselect();
            selectionToolbar.setVisibility(View.GONE);
        });

        selectionToolbar.getMenu().clear();
        selectionToolbar.inflateMenu(R.menu.library_selection_menu);

        deleteMenu = selectionToolbar.getMenu().findItem(R.id.action_delete);
        shareMenu = selectionToolbar.getMenu().findItem(R.id.action_share);
        archiveMenu = selectionToolbar.getMenu().findItem(R.id.action_archive);
        changeGroupMenu = selectionToolbar.getMenu().findItem(R.id.action_change_group);
        folderMenu = selectionToolbar.getMenu().findItem(R.id.action_open_folder);
        redownloadMenu = selectionToolbar.getMenu().findItem(R.id.action_redownload);
        coverMenu = selectionToolbar.getMenu().findItem(R.id.action_set_cover);
    }

    private boolean toggleEditMode() {
        if (!(requireActivity() instanceof LibraryActivity)) return false;
        LibraryActivity activity = (LibraryActivity) requireActivity();

        activity.toggleEditMode();

        // Leave edit mode by validating => Save new item position
        if (!activity.isEditMode()) {
            viewModel.saveContentPositions(Stream.of(itemAdapter.getAdapterItems()).map(ContentItem::getContent).withoutNulls().toList());
            group.hasCustomBookOrder = true;
            Preferences.setContentSortField(Preferences.Constant.ORDER_FIELD_CUSTOM);
            sortFieldButton.setText(getNameFromFieldCode(Preferences.Constant.ORDER_FIELD_CUSTOM));
        } else if (group.hasCustomBookOrder) { // Enter edit mode -> warn if a custom order already exists
            new MaterialAlertDialogBuilder(requireContext(), ThemeHelper.getIdForCurrentTheme(requireContext(), R.style.Theme_Light_Dialog))
                    .setIcon(R.drawable.ic_warning)
                    .setTitle(R.string.app_name)
                    .setMessage(R.string.menu_edit_warning_custom)
                    .setPositiveButton(android.R.string.yes,
                            (dialog1, which) -> dialog1.dismiss())
                    .setNegativeButton(android.R.string.no,
                            (dialog2, which) -> {
                                dialog2.dismiss();
                                cancelEditMode();
                            })
                    .create()
                    .show();
        }

        setPagingMethod(Preferences.getEndlessScroll(), activity.isEditMode());
        return true;
    }

    private boolean cancelEditMode() {
        if (!(requireActivity() instanceof LibraryActivity)) return false;
        LibraryActivity activity = (LibraryActivity) requireActivity();

        activity.setEditMode(false);
        setPagingMethod(Preferences.getEndlessScroll(), false);
        return true;
    }

    private boolean selectionToolbarOnItemClicked(@NonNull MenuItem menuItem) {
        boolean keepToolbar = false;
        switch (menuItem.getItemId()) {
            case R.id.action_share:
                shareSelectedItems();
                break;
            case R.id.action_delete:
                purgeSelectedItems();
                break;
            case R.id.action_archive:
                archiveSelectedItems();
                break;
            case R.id.action_change_group:
                moveSelectedItems();
                break;
            case R.id.action_open_folder:
                openItemFolder();
                break;
            case R.id.action_redownload:
                askRedownloadSelectedItemsScratch();
                keepToolbar = true;
                break;
            case R.id.action_set_cover:
                askSetCover();
                break;
            default:
                selectionToolbar.setVisibility(View.GONE);
                return false;
        }
        if (!keepToolbar) selectionToolbar.setVisibility(View.GONE);
        return true;
    }

    private void updateSelectionToolbar(long selectedTotalCount, long selectedLocalCount) {
        boolean isMultipleSelection = selectedTotalCount > 1;

        deleteMenu.setVisible(selectedLocalCount > 0 || Preferences.isDeleteExternalLibrary());
        shareMenu.setVisible(!isMultipleSelection && 1 == selectedLocalCount);
        archiveMenu.setVisible(true);
        changeGroupMenu.setVisible(true);
        folderMenu.setVisible(!isMultipleSelection);
        redownloadMenu.setVisible(selectedLocalCount > 0);
        coverMenu.setVisible(!isMultipleSelection && group != null);

        selectionToolbar.setTitle(getResources().getQuantityString(R.plurals.items_selected, (int) selectedTotalCount, (int) selectedTotalCount));
    }

    /**
     * Callback for the "share item" action button
     */
    private void shareSelectedItems() {
        Set<ContentItem> selectedItems = selectExtension.getSelectedItems();
        Context context = getActivity();
        if (1 == selectedItems.size() && context != null) {
            Content c = Stream.of(selectedItems).findFirst().get().getContent();
            if (c != null) ContentHelper.shareContent(context, c);
        }
    }

    /**
     * Callback for the "delete item" action button
     */
    private void purgeSelectedItems() {
        if (!(requireActivity() instanceof LibraryActivity)) return;
        LibraryActivity activity = (LibraryActivity) requireActivity();

        Set<ContentItem> selectedItems = selectExtension.getSelectedItems();
        if (!selectedItems.isEmpty()) {
            List<Content> selectedContent = Stream.of(selectedItems).map(ContentItem::getContent).withoutNulls().toList();
            // Remove external items if they can't be deleted
            if (!Preferences.isDeleteExternalLibrary())
                selectedContent = Stream.of(selectedContent).filterNot(c -> c.getStatus().equals(StatusContent.EXTERNAL)).toList();
            if (!selectedContent.isEmpty())
                activity.askDeleteItems(selectedContent, Collections.emptyList(), selectExtension);
        }
    }

    /**
     * Callback for the "archive item" action button
     */
    private void archiveSelectedItems() {
        if (!(requireActivity() instanceof LibraryActivity)) return;
        LibraryActivity activity = (LibraryActivity) requireActivity();

        Set<ContentItem> selectedItems = selectExtension.getSelectedItems();
        List<Content> contents = Stream.of(selectedItems)
                .map(ContentItem::getContent)
                .withoutNulls()
                .filterNot(c -> c.getStorageUri().isEmpty())
                .toList();
        activity.askArchiveItems(contents, selectExtension);
    }

    /**
     * Callback for the "change group" action button
     */
    private void moveSelectedItems() {
        Set<ContentItem> selectedItems = selectExtension.getSelectedItems();
        selectExtension.deselect();
        List<Long> bookIds = Stream.of(selectedItems).map(ContentItem::getContent).withoutNulls().map(Content::getId).toList();
        ChangeGroupDialogFragment.invoke(getParentFragmentManager(), Helper.getPrimitiveLongArrayFromList(bookIds));
    }

    /**
     * Callback for the "open containing folder" action button
     */
    private void openItemFolder() {
        Set<ContentItem> selectedItems = selectExtension.getSelectedItems();
        Context context = getActivity();
        if (1 == selectedItems.size() && context != null) {
            Content c = Stream.of(selectedItems).findFirst().get().getContent();
            if (c != null) {
                if (c.getStorageUri().isEmpty()) {
                    ToastUtil.toast(R.string.folder_undefined);
                    return;
                }

                DocumentFile folder = FileHelper.getFolderFromTreeUriString(requireContext(), c.getStorageUri());
                if (folder != null) {
                    selectExtension.deselect();
                    selectionToolbar.setVisibility(View.GONE);
                    FileHelper.openFile(requireContext(), folder);
                }
            }
        }
    }

    /**
     * Callback for the "redownload from scratch" action button
     */
    private void askRedownloadSelectedItemsScratch() {
        Set<ContentItem> selectedItems = selectExtension.getSelectedItems();

        int securedContent = 0;
        int externalContent = 0;
        List<Content> contents = new ArrayList<>();
        for (ContentItem ci : selectedItems) {
            Content c = ci.getContent();
            if (null == c) continue;
            if (c.getStatus().equals(StatusContent.EXTERNAL)) {
                externalContent++;
            } else if (c.getSite().equals(Site.FAKKU2) || c.getSite().equals(Site.EXHENTAI)) {
                securedContent++;
            } else {
                contents.add(c);
            }
        }

        String message = getResources().getQuantityString(R.plurals.redownload_confirm, contents.size());
        if (securedContent > 0)
            message = getResources().getQuantityString(R.plurals.redownload_secured_content, securedContent);
        else if (externalContent > 0)
            message = getResources().getQuantityString(R.plurals.redownload_secured_content, securedContent);

        // TODO make it work for secured sites (Fakku, ExHentai) -> open a browser to fetch the relevant cookies ?

        new MaterialAlertDialogBuilder(requireContext(), ThemeHelper.getIdForCurrentTheme(requireContext(), R.style.Theme_Light_Dialog))
                .setIcon(R.drawable.ic_warning)
                .setCancelable(false)
                .setTitle(R.string.app_name)
                .setMessage(message)
                .setPositiveButton(android.R.string.yes,
                        (dialog1, which) -> {
                            dialog1.dismiss();
                            redownloadContent(contents, true);
                            for (ContentItem ci : selectedItems) ci.setSelected(false);
                            selectExtension.deselect();
                            selectionToolbar.setVisibility(View.GONE);
                        })
                .setNegativeButton(android.R.string.no,
                        (dialog12, which) -> dialog12.dismiss())
                .create()
                .show();
    }

    /**
     * Callback for the "set as group cover" action button
     */
    private void askSetCover() {
        Set<ContentItem> selectedItems = selectExtension.getSelectedItems();
        if (selectedItems.isEmpty()) return;

        Content content = Stream.of(selectedItems).findFirst().get().getContent();

        new MaterialAlertDialogBuilder(requireContext(), ThemeHelper.getIdForCurrentTheme(requireContext(), R.style.Theme_Light_Dialog))
                .setCancelable(false)
                .setTitle(R.string.app_name)
                .setMessage(getResources().getString(R.string.group_make_cover_ask))
                .setPositiveButton(android.R.string.yes,
                        (dialog1, which) -> {
                            dialog1.dismiss();
                            viewModel.setGroupCover(group.id, content.getCover());
                            for (ContentItem ci : selectedItems) ci.setSelected(false);
                            selectExtension.deselect();
                            selectionToolbar.setVisibility(View.GONE);
                        })
                .setNegativeButton(android.R.string.no,
                        (dialog12, which) -> dialog12.dismiss())
                .create()
                .show();
    }

    /**
     * Indicates whether a search query is active (using universal search or advanced search) or not
     *
     * @return True if a search query is active (using universal search or advanced search); false if not (=whole unfiltered library selected)
     */
    private boolean isSearchQueryActive() {
        return ((LibraryActivity) requireActivity()).isSearchQueryActive();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (viewModel != null) viewModel.onSaveState(outState);
        if (fastAdapter != null) fastAdapter.saveInstanceState(outState);

        // Remember current position in the sorted list
        int currentPosition = getTopItemPosition();
        if (currentPosition > 0 || -1 == topItemPosition) topItemPosition = currentPosition;

        outState.putInt(KEY_LAST_LIST_POSITION, topItemPosition);
        topItemPosition = -1;
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);

        topItemPosition = 0;
        if (null == savedInstanceState) return;

        if (viewModel != null) viewModel.onRestoreState(savedInstanceState);
        if (fastAdapter != null) fastAdapter.withSavedInstanceState(savedInstanceState);
        // Mark last position in the list to be the one it will come back to
        topItemPosition = savedInstanceState.getInt(KEY_LAST_LIST_POSITION, 0);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onAppUpdated(AppUpdatedEvent event) {
        EventBus.getDefault().removeStickyEvent(event);
        // Display the "update success" dialog when an update is detected on a release version
        if (!BuildConfig.DEBUG) UpdateSuccessDialogFragment.invoke(getParentFragmentManager());
    }

    @Override
    public void onDestroy() {
        Preferences.unregisterPrefsChangedListener(prefsListener);
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    private void customBackPress() {
        // If content is selected, deselect it
        if (!selectExtension.getSelectedItems().isEmpty()) {
            selectExtension.deselect();
            selectionToolbar.setVisibility(View.GONE);
            backButtonPressed = 0;
            return;
        }

        LibraryActivity activity = (LibraryActivity) requireActivity();
        if (!activity.collapseSearchMenu()) {
            // If none of the above and we're into a grouping, go back to the groups view
            if (!Grouping.FLAT.equals(Preferences.getGroupingDisplay())) {
                activity.goBackToGroups();
            }
            // If none of the above, user is asking to leave => use double-tap
            else if (backButtonPressed + 2000 > SystemClock.elapsedRealtime()) {
                callback.remove();
                requireActivity().onBackPressed();
            } else {
                backButtonPressed = SystemClock.elapsedRealtime();
                ToastUtil.toast(R.string.press_back_again);

                llm.scrollToPositionWithOffset(0, 0);
            }
        }
    }

    /**
     * Callback for any change in Preferences
     */
    private void onSharedPreferenceChanged(String key) {
        if (!(requireActivity() instanceof LibraryActivity)) return;
        LibraryActivity activity = (LibraryActivity) requireActivity();

        Timber.i("Prefs change detected : %s", key);
        if (Preferences.Key.PREF_ENDLESS_SCROLL.equals(key)) {
            setPagingMethod(Preferences.getEndlessScroll(), activity.isEditMode());
            viewModel.updateOrder(); // Trigger a blank search
        } else if (Preferences.Key.PREF_COLOR_THEME.equals(key)) {
            // Restart the app with the library activity on top
            Intent intent = requireActivity().getIntent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                    | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            requireActivity().finish();
            startActivity(intent);
        }
    }

    /**
     * Handler for the "Advanced search" button
     */
    public void onAdvancedSearchButtonClick() {
        Intent search = new Intent(this.getContext(), SearchActivity.class);

        SearchActivityBundle.Builder builder = new SearchActivityBundle.Builder();

        if (!getMetadata().isEmpty())
            builder.setUri(SearchActivityBundle.Builder.buildSearchUri(getMetadata()));

        if (group != null)
            builder.setGroup(group.id);

        search.putExtras(builder.getBundle());

        startActivityForResult(search, 999);
        ((LibraryActivity) requireActivity()).collapseSearchMenu();
    }

    /**
     * Called when returning from the Advanced Search screen
     */
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 999
                && resultCode == Activity.RESULT_OK
                && data != null && data.getExtras() != null) {
            Uri searchUri = new SearchActivityBundle.Parser(data.getExtras()).getUri();

            if (searchUri != null) {
                setQuery(searchUri.getPath());
                setMetadata(SearchActivityBundle.Parser.parseSearchUri(searchUri));
                viewModel.search(getQuery(), getMetadata());
            }
        }
    }

    /**
     * Initialize the paging method of the screen
     *
     * @param isEndless True if endless mode has to be set; false if paged mode has to be set
     */
    private void setPagingMethod(boolean isEndless, boolean isEditMode) {
        // Editing will always be done in Endless mode
        viewModel.setPagingMethod(isEndless || isEditMode);

        // Pager appearance
        if (!isEndless && !isEditMode) {
            pager.setCurrentPage(1);
            pager.show();
        } else pager.hide();

        // Adapter initialization
        if (isEndless && !isEditMode) {
            @ContentItem.ViewType int viewType = ContentItem.ViewType.LIBRARY;
            pagedItemAdapter = new PagedModelAdapter<>(asyncDifferConfig, i -> new ContentItem(viewType), c -> new ContentItem(c, touchHelper, viewType));
            fastAdapter = FastAdapter.with(pagedItemAdapter);
            ContentItem item = new ContentItem(viewType);
            fastAdapter.registerItemFactory(item.getType(), item);

            itemAdapter = null;
        } else { // Paged mode or edit mode
            itemAdapter = new ItemAdapter<>();
            fastAdapter = FastAdapter.with(itemAdapter);

            pagedItemAdapter = null;
        }
        fastAdapter.setHasStableIds(true);

        // Item click listener
        fastAdapter.setOnClickListener((v, a, i, p) -> onBookClick(i, p));

        // Favourite button click listener
        fastAdapter.addEventHook(new ClickEventHook<ContentItem>() {
            @Override
            public void onClick(@NotNull View view, int i, @NotNull FastAdapter<ContentItem> fastAdapter, @NotNull ContentItem item) {
                if (item.getContent() != null) onBookFavouriteClick(item.getContent());
            }

            @org.jetbrains.annotations.Nullable
            @Override
            public View onBind(RecyclerView.@NotNull ViewHolder viewHolder) {
                if (viewHolder instanceof ContentItem.ContentViewHolder) {
                    return ((ContentItem.ContentViewHolder) viewHolder).getFavouriteButton();
                }
                return super.onBind(viewHolder);
            }
        });

        // Site button click listener
        fastAdapter.addEventHook(new ClickEventHook<ContentItem>() {
            @Override
            public void onClick(@NotNull View view, int i, @NotNull FastAdapter<ContentItem> fastAdapter, @NotNull ContentItem item) {
                if (item.getContent() != null) onBookSourceClick(item.getContent());
            }

            @org.jetbrains.annotations.Nullable
            @Override
            public View onBind(RecyclerView.@NotNull ViewHolder viewHolder) {
                if (viewHolder instanceof ContentItem.ContentViewHolder) {
                    return ((ContentItem.ContentViewHolder) viewHolder).getSiteButton();
                }
                return super.onBind(viewHolder);
            }
        });

        // Error button click listener
        fastAdapter.addEventHook(new ClickEventHook<ContentItem>() {
            @Override
            public void onClick(@NotNull View view, int i, @NotNull FastAdapter<ContentItem> fastAdapter, @NotNull ContentItem item) {
                if (item.getContent() != null) onBookErrorClick(item.getContent());
            }

            @org.jetbrains.annotations.Nullable
            @Override
            public View onBind(RecyclerView.@NotNull ViewHolder viewHolder) {
                if (viewHolder instanceof ContentItem.ContentViewHolder) {
                    return ((ContentItem.ContentViewHolder) viewHolder).getErrorButton();
                }
                return super.onBind(viewHolder);
            }
        });

        // Gets (or creates and attaches if not yet existing) the extension from the given `FastAdapter`
        selectExtension = fastAdapter.getOrCreateExtension(SelectExtension.class);
        if (selectExtension != null) {
            selectExtension.setSelectable(true);
            selectExtension.setMultiSelect(true);
            selectExtension.setSelectOnLongClick(true);
            selectExtension.setSelectionListener((item, b) -> this.onSelectionChanged());
        }

        // Drag, drop & swiping
        if (isEditMode) {
            SimpleDragCallback dragSwipeCallback = new SimpleSwipeDragCallback(
                    this,
                    this,
                    ContextCompat.getDrawable(requireContext(), R.drawable.ic_action_delete_forever)).withSensitivity(10f).withSurfaceThreshold(0.75f);
            dragSwipeCallback.setNotifyAllDrops(true);
            dragSwipeCallback.setIsDragEnabled(false); // Despite its name, that's actually to disable drag on long tap

            touchHelper = new ItemTouchHelper(dragSwipeCallback);
            touchHelper.attachToRecyclerView(recyclerView);
        }

        recyclerView.setAdapter(fastAdapter);
    }

    /**
     * Returns the index bounds of the list to be displayed according to the given shelf number
     * Used for paged mode only
     *
     * @param shelfNumber Number of the shelf to display
     * @param librarySize Size of the library
     * @return Min and max index of the books to display on the given page
     */
    private ImmutablePair<Integer, Integer> getShelfBound(int shelfNumber, int librarySize) {
        int minIndex = (shelfNumber - 1) * Preferences.getContentPageQuantity();
        int maxIndex = Math.min(minIndex + Preferences.getContentPageQuantity(), librarySize);
        return new ImmutablePair<>(minIndex, maxIndex);
    }

    /**
     * Loads current shelf of books to into the paged mode adapter
     * NB : A bookshelf is the portion of the collection that is displayed on screen by the paged mode
     * The width of the shelf is determined by the "Quantity per page" setting
     *
     * @param iLibrary Library to extract the shelf from
     */
    private void loadBookshelf(@NonNull final PagedList<Content> iLibrary) {
        if (iLibrary.isEmpty()) {
            itemAdapter.set(Collections.emptyList());
            fastAdapter.notifyDataSetChanged();
        } else {
            ImmutablePair<Integer, Integer> bounds = getShelfBound(pager.getCurrentPageNumber(), iLibrary.size());
            int minIndex = bounds.getLeft();
            int maxIndex = bounds.getRight();

            if (minIndex >= maxIndex) { // We just deleted the last item of the last page => Go back one page
                pager.setCurrentPage(pager.getCurrentPageNumber() - 1);
                loadBookshelf(iLibrary);
                return;
            }

            populateBookshelf(iLibrary, pager.getCurrentPageNumber());
        }
    }

    /**
     * Displays the current "bookshelf" (section of the list corresponding to the selected page)
     * A shelf contains as many books as the user has set in Preferences
     * <p>
     * Used in paged mode only
     *
     * @param iLibrary    Library to display books from
     * @param shelfNumber Number of the shelf to display
     */
    private void populateBookshelf(@NonNull final PagedList<Content> iLibrary, int shelfNumber) {
        if (Preferences.getEndlessScroll()) return;

        ImmutablePair<Integer, Integer> bounds = getShelfBound(shelfNumber, iLibrary.size());
        int minIndex = bounds.getLeft();
        int maxIndex = bounds.getRight();

        @ContentItem.ViewType int viewType = ContentItem.ViewType.LIBRARY; // Paged mode won't be used in edit mode
        List<ContentItem> contentItems = Stream.of(iLibrary.subList(minIndex, maxIndex)).withoutNulls().map(c -> new ContentItem(c, null, viewType)).toList();
        itemAdapter.set(contentItems);
        fastAdapter.notifyDataSetChanged();
    }

    private void populateAllResults(@NonNull final PagedList<Content> iLibrary) {
        if (!(requireActivity() instanceof LibraryActivity)) return;
        LibraryActivity activity = (LibraryActivity) requireActivity();

        if (iLibrary.isEmpty()) {
            itemAdapter.set(Collections.emptyList());
        } else {
            @ContentItem.ViewType int viewType = activity.isEditMode() ? ContentItem.ViewType.LIBRARY_EDIT : ContentItem.ViewType.LIBRARY;
            List<ContentItem> contentItems = Stream.of(iLibrary.subList(0, iLibrary.size())).withoutNulls().map(c -> new ContentItem(c, touchHelper, viewType)).toList();
            itemAdapter.set(contentItems);
        }
        fastAdapter.notifyDataSetChanged();
    }

    /**
     * LiveData callback when a new search takes place
     *
     * @param b Unused parameter (always set to true)
     */
    private void onNewSearch(Boolean b) {
        newSearch = b;
    }

    /**
     * LiveData callback when the library changes
     * - Either because a new search has been performed
     * - Or because a book has been downloaded, deleted, updated
     *
     * @param result Current library according to active filters
     */
    private void onLibraryChanged(PagedList<Content> result) {
        if (!(requireActivity() instanceof LibraryActivity)) return;
        LibraryActivity activity = (LibraryActivity) requireActivity();

        Timber.i(">>Library changed ! Size=%s", result.size());

        updateTitle(result.size(), totalContentCount);

        // Update background text
        if (result.isEmpty()) {
            emptyText.setVisibility(View.VISIBLE);
            if (isSearchQueryActive()) emptyText.setText(R.string.search_entry_not_found);
            else emptyText.setText(R.string.downloads_empty_library);
        } else emptyText.setVisibility(View.GONE);

        // Update visibility of advanced search bar
        activity.updateSearchBarOnResults(!result.isEmpty());

        String query = getQuery();
        // User searches a book ID
        // => Suggests searching through all sources except those where the selected book ID is already in the collection
        if (newSearch && Helper.isNumeric(query)) {
            ArrayList<Integer> siteCodes = Stream.of(result)
                    .filter(content -> query.equals(content.getUniqueSiteId()))
                    .map(Content::getSite)
                    .map(Site::getCode)
                    .collect(toCollection(ArrayList::new));

            SearchBookIdDialogFragment.invoke(requireContext(), getParentFragmentManager(), query, siteCodes);
        }

        // If the update is the result of a new search, get back on top of the list
        if (newSearch) topItemPosition = 0;

        // Update displayed books
        if (Preferences.getEndlessScroll() && !activity.isEditMode()) {
            pagedItemAdapter.submitList(result, this::differEndCallback);
        } else if (activity.isEditMode()) {
            populateAllResults(result);
        } else { // Paged mode
            if (newSearch) pager.setCurrentPage(1);
            pager.setPageCount((int) Math.ceil(result.size() * 1.0 / Preferences.getContentPageQuantity()));
            loadBookshelf(result);
        }

        newSearch = false;
        library = result;
    }

    /**
     * LiveData callback when the total number of books changes (because of book download of removal)
     *
     * @param count Current book count in the whole, unfiltered library
     */
    private void onTotalContentChanged(Integer count) {
        totalContentCount = count;
        if (library != null) updateTitle(library.size(), totalContentCount);
    }

    // TODO doc
    private void onGroupChanged(Group group) {
        if (group != null)
            this.group = group;
        else
            this.group = null;
    }

    /**
     * Update the screen title according to current search filter (#TOTAL BOOKS) if no filter is
     * enabled (#FILTERED / #TOTAL BOOKS) if a filter is enabled
     */
    private void updateTitle(long totalSelectedCount, long totalCount) {
        ((LibraryActivity) requireActivity()).updateTitle(totalSelectedCount, totalCount);
    }

    /**
     * Callback for the book holder itself
     *
     * @param item ContentItem that has been clicked on
     */
    private boolean onBookClick(@NonNull ContentItem item, int position) {
        if (selectExtension.getSelectedItems().isEmpty()) {
            if (!invalidateNextBookClick && item.getContent() != null && !item.getContent().isBeingDeleted()) {
                topItemPosition = position;
                ContentHelper.openHentoidViewer(requireContext(), item.getContent(), viewModel.getSearchManagerBundle());
            } else invalidateNextBookClick = false;

            return true;
        } else {
            selectExtension.setSelectOnLongClick(false);
        }
        return false;
    }

    /**
     * Callback for the "source" button of the book holder
     *
     * @param content Content whose "source" button has been clicked on
     */
    private void onBookSourceClick(@NonNull Content content) {
        ContentHelper.viewContentGalleryPage(requireContext(), content);
    }

    /**
     * Callback for the "favourite" button of the book holder
     *
     * @param content Content whose "favourite" button has been clicked on
     */
    private void onBookFavouriteClick(@NonNull Content content) {
        viewModel.toggleContentFavourite(content);
    }

    /**
     * Callback for the "error" button of the book holder
     *
     * @param content Content whose "error" button has been clicked on
     */
    private void onBookErrorClick(@NonNull Content content) {
        ErrorsDialogFragment.invoke(this, content.getId());
    }

    /**
     * Add the given content back to the download queue
     *
     * @param content Content to add back to the download queue
     */
    public void redownloadContent(@NonNull final Content content) {
        List<Content> contentList = new ArrayList<>();
        contentList.add(content);
        redownloadContent(contentList, false);
    }

    private void redownloadContent(@NonNull final List<Content> contentList, boolean reparseImages) {
        StatusContent targetImageStatus = reparseImages ? StatusContent.ERROR : null;
        for (Content c : contentList) viewModel.addContentToQueue(c, targetImageStatus);

        if (Preferences.isQueueAutostart())
            ContentQueueManager.getInstance().resumeQueue(getContext());

        String message = getResources().getQuantityString(R.plurals.add_to_queue, contentList.size(), contentList.size());
        Snackbar snackbar = Snackbar.make(recyclerView, message, BaseTransientBottomBar.LENGTH_LONG);
        snackbar.setAction("VIEW QUEUE", v -> viewQueue());
        snackbar.show();
    }

    /**
     * Callback for any selection change (item added to or removed from selection)
     */
    private void onSelectionChanged() {
        Set<ContentItem> selectedItems = selectExtension.getSelectedItems();
        int selectedTotalCount = selectedItems.size();

        if (0 == selectedTotalCount) {
            selectionToolbar.setVisibility(View.GONE);
            selectExtension.setSelectOnLongClick(true);
            invalidateNextBookClick = true;
            new Handler().postDelayed(() -> invalidateNextBookClick = false, 200);
        } else {
            long selectedLocalCount = Stream.of(selectedItems).map(ContentItem::getContent).withoutNulls().map(Content::getStatus).filter(s -> s.equals(StatusContent.DOWNLOADED)).count();
            updateSelectionToolbar(selectedTotalCount, selectedLocalCount);
            selectionToolbar.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Handler for any page change
     */
    private void handleNewPage() {
        loadBookshelf(library);
        recyclerView.scrollToPosition(0);
    }

    /**
     * Navigate to the queue screen
     */
    private void viewQueue() {
        Intent intent = new Intent(requireContext(), QueueActivity.class);
        requireContext().startActivity(intent);
    }

    /**
     * Callback for the end of item diff calculations
     * Activated when all _adapter_ items are placed on their definitive position
     */
    private void differEndCallback() {
        if (topItemPosition > -1) {
            int targetPos = topItemPosition;
            listRefreshDebouncer.submit(targetPos);
            topItemPosition = -1;
        }
    }

    /**
     * Callback for the end of recycler updates
     * Activated when all _displayed_ items are placed on their definitive position
     */
    private void onRecyclerUpdated(int topItemPosition) {
        int currentPosition = getTopItemPosition();
        if (currentPosition != topItemPosition)
            llm.scrollToPositionWithOffset(topItemPosition, 0); // Used to restore position after activity has been stopped and recreated
    }

    /**
     * Calculate the position of the top visible item of the book list
     *
     * @return position of the top visible item of the book list
     */
    private int getTopItemPosition() {
        return Math.max(llm.findFirstVisibleItemPosition(), llm.findFirstCompletelyVisibleItemPosition());
    }

    /**
     * DRAG, DROP & SWIPE METHODS
     */

    private void recordMoveFromFirstPos(int from, int to) {
        if (0 == from) itemToRefreshIndex = to;
    }

    private void recordMoveFromFirstPos(List<Integer> positions) {
        // Only useful when moving the 1st item to the bottom
        if (!positions.isEmpty() && 0 == positions.get(0))
            itemToRefreshIndex = itemAdapter.getAdapterItemCount() - positions.size();
    }

    @Override
    public boolean itemTouchOnMove(int oldPosition, int newPosition) {
        DragDropUtil.onMove(itemAdapter, oldPosition, newPosition); // change position
        recordMoveFromFirstPos(oldPosition, newPosition);
        return true;
    }

    @Override
    public void itemTouchDropped(int i, int i1) {
        // Nothing; final position will be saved once the "save" button is hit
    }

    @Override
    public void itemTouchStartDrag(RecyclerView.@NotNull ViewHolder viewHolder) {
        if (viewHolder instanceof IDraggableViewHolder) {
            ((IDraggableViewHolder) viewHolder).onDragged();
        }
    }

    @Override
    public void itemSwiped(int i, int i1) {
        // TODO #609
    }
}
