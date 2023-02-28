package me.devsaki.hentoid.fragments.tools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0014\u001a\u00020\u0012J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\bJ\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u0012H\u0002J\u0006\u0010!\u001a\u00020\u0012J\b\u0010\"\u001a\u00020\u0012H\u0002J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\fJ\u0010\u0010\'\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lme/devsaki/hentoid/fragments/tools/DuplicateMainTopPanel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "activity", "Lme/devsaki/hentoid/activities/DuplicateDetectorActivity;", "(Lme/devsaki/hentoid/activities/DuplicateDetectorActivity;)V", "binding", "Lme/devsaki/hentoid/databinding/IncludeDuplicateControlsBinding;", "isShowing", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "menuView", "Landroid/view/View;", "menuWindow", "Landroid/widget/PopupWindow;", "viewModel", "Lme/devsaki/hentoid/viewmodels/DuplicateViewModel;", "activateScanUi", "", "disableScanUi", "dismiss", "initFrame", "initUI", "context", "Landroid/content/Context;", "isVisible", "onDestroy", "owner", "onMainCriteriaChanged", "onProcessEvent", "event", "Lme/devsaki/hentoid/events/ProcessEvent;", "onScanClick", "onServiceDestroyedEvent", "onStopClick", "setLifecycleOwner", "setLifecycleOwnerFromContext", "showAsDropDown", "anchor", "updateUI", "app_release"})
public final class DuplicateMainTopPanel implements androidx.lifecycle.DefaultLifecycleObserver {
    private me.devsaki.hentoid.databinding.IncludeDuplicateControlsBinding binding;
    private android.view.View menuView;
    private android.widget.PopupWindow menuWindow;
    private androidx.lifecycle.LifecycleOwner lifecycleOwner;
    private boolean isShowing = false;
    private final me.devsaki.hentoid.viewmodels.DuplicateViewModel viewModel = null;
    
    public DuplicateMainTopPanel(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.activities.DuplicateDetectorActivity activity) {
        super();
    }
    
    private final void setLifecycleOwnerFromContext(android.content.Context context) {
    }
    
    private final void setLifecycleOwner(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
    }
    
    @java.lang.Override()
    public void onDestroy(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    private final void initFrame(me.devsaki.hentoid.activities.DuplicateDetectorActivity activity) {
    }
    
    public final void showAsDropDown(@org.jetbrains.annotations.NotNull()
    android.view.View anchor) {
    }
    
    public final boolean isVisible() {
        return false;
    }
    
    public final void dismiss() {
    }
    
    private final void initUI(android.content.Context context) {
    }
    
    private final void updateUI(android.content.Context context) {
    }
    
    private final void onScanClick() {
    }
    
    private final void activateScanUi() {
    }
    
    private final void disableScanUi() {
    }
    
    private final void onMainCriteriaChanged() {
    }
    
    private final void onStopClick() {
    }
    
    public final void onProcessEvent(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.events.ProcessEvent event) {
    }
    
    public final void onServiceDestroyedEvent() {
    }
}