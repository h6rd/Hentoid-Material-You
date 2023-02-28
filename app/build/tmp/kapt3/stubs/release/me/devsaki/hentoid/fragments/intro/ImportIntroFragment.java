package me.devsaki.hentoid.fragments.intro;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\u001a\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010\'H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0007J\b\u0010+\u001a\u00020\u0016H\u0016J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0013H\u0002J\u001a\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0006\u0010/\u001a\u00020\u0016J\b\u00100\u001a\u00020\u0016H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lme/devsaki/hentoid/fragments/intro/ImportIntroFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lme/devsaki/hentoid/databinding/IntroSlide04Binding;", "_mergedBinding", "Lme/devsaki/hentoid/databinding/IncludeImportStepsBinding;", "binding", "getBinding", "()Lme/devsaki/hentoid/databinding/IntroSlide04Binding;", "importDisposable", "Lio/reactivex/disposables/Disposable;", "isDone", "", "mergedBinding", "getMergedBinding", "()Lme/devsaki/hentoid/databinding/IncludeImportStepsBinding;", "pickFolder", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "askSkip", "", "nextStep", "onCancelExistingLibraryDialog", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onFolderPickerResult", "resultCode", "treeUri", "Landroid/net/Uri;", "onMigrationEvent", "event", "Lme/devsaki/hentoid/events/ProcessEvent;", "onResume", "onScanHentoidFolderResult", "onViewCreated", "view", "reset", "updateOnSelectFolder", "app_release"})
public final class ImportIntroFragment extends androidx.fragment.app.Fragment {
    private me.devsaki.hentoid.databinding.IntroSlide04Binding _binding;
    private me.devsaki.hentoid.databinding.IncludeImportStepsBinding _mergedBinding;
    private boolean isDone = false;
    private io.reactivex.disposables.Disposable importDisposable;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.Integer> pickFolder = null;
    
    public ImportIntroFragment() {
        super();
    }
    
    private final me.devsaki.hentoid.databinding.IntroSlide04Binding getBinding() {
        return null;
    }
    
    private final me.devsaki.hentoid.databinding.IncludeImportStepsBinding getMergedBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * Reset the screen to its initial state
     * useful when coming back from a later step to switch the selected folder
     */
    public final void reset() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void onFolderPickerResult(int resultCode, android.net.Uri treeUri) {
    }
    
    private final void onScanHentoidFolderResult(int resultCode) {
    }
    
    private final void updateOnSelectFolder() {
    }
    
    private final void onCancelExistingLibraryDialog() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMigrationEvent(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.events.ProcessEvent event) {
    }
    
    private final void askSkip() {
    }
    
    private final void nextStep() {
    }
}