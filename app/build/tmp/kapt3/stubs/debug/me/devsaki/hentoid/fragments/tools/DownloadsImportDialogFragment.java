package me.devsaki.hentoid.fragments.tools;

import java.lang.System;

/**
 * Dialog for the downloads list import feature
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\u0018\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0013H\u0002J\u001e\u0010#\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\'\u001a\u00020\u0016H\u0002J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010)\u001a\u00020,H\u0007J\u001a\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u00100\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lme/devsaki/hentoid/fragments/tools/DownloadsImportDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "Lme/devsaki/hentoid/databinding/DialogQueueDownloadsImportBinding;", "binding", "getBinding", "()Lme/devsaki/hentoid/databinding/DialogQueueDownloadsImportBinding;", "importDisposable", "Lio/reactivex/disposables/Disposable;", "isServiceGracefulClose", "", "pickFile", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "askRun", "", "fileUri", "Landroid/net/Uri;", "checkFile", "file", "Landroidx/documentfile/provider/DocumentFile;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedState", "Landroid/os/Bundle;", "onDestroyView", "onFilePickerResult", "resultCode", "uri", "onFileRead", "downloadsList", "", "", "jsonFile", "onImportEvent", "event", "Lme/devsaki/hentoid/events/ProcessEvent;", "onServiceDestroyed", "Lme/devsaki/hentoid/events/ServiceDestroyedEvent;", "onViewCreated", "rootView", "savedInstanceState", "runImport", "queuePosition", "Companion", "app_debug"})
public final class DownloadsImportDialogFragment extends androidx.fragment.app.DialogFragment {
    private me.devsaki.hentoid.databinding.DialogQueueDownloadsImportBinding _binding;
    private boolean isServiceGracefulClose = false;
    private io.reactivex.disposables.Disposable importDisposable;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.Integer> pickFile = null;
    @org.jetbrains.annotations.NotNull()
    public static final me.devsaki.hentoid.fragments.tools.DownloadsImportDialogFragment.Companion Companion = null;
    
    public DownloadsImportDialogFragment() {
        super();
    }
    
    private final me.devsaki.hentoid.databinding.DialogQueueDownloadsImportBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View rootView, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onFilePickerResult(int resultCode, android.net.Uri uri) {
    }
    
    private final void checkFile(androidx.documentfile.provider.DocumentFile file) {
    }
    
    private final void onFileRead(java.util.List<java.lang.String> downloadsList, androidx.documentfile.provider.DocumentFile jsonFile) {
    }
    
    private final void askRun(android.net.Uri fileUri) {
    }
    
    private final void runImport(android.net.Uri fileUri, int queuePosition) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onImportEvent(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.events.ProcessEvent event) {
    }
    
    /**
     * Service destroyed event handler
     *
     * @param event Broadcasted event
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onServiceDestroyed(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.events.ServiceDestroyedEvent event) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000e"}, d2 = {"Lme/devsaki/hentoid/fragments/tools/DownloadsImportDialogFragment$Companion;", "", "()V", "invoke", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "readFile", "", "", "context", "Landroid/content/Context;", "file", "Landroidx/documentfile/provider/DocumentFile;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> readFile(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        androidx.documentfile.provider.DocumentFile file) {
            return null;
        }
    }
}