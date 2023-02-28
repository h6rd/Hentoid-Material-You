package me.devsaki.hentoid.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\nJ\b\u0010\u0011\u001a\u00020\nH\u0002J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\nH\u0002J\u0012\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\nH\u0014J\b\u0010\u001b\u001a\u00020\nH\u0014J\u000e\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\nH\u0002J\b\u0010 \u001a\u00020\nH\u0002J\u000e\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\rJ\u001e\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lme/devsaki/hentoid/activities/DuplicateDetectorActivity;", "Lme/devsaki/hentoid/activities/BaseActivity;", "()V", "binding", "Lme/devsaki/hentoid/databinding/ActivityDuplicateDetectorBinding;", "viewModel", "Lme/devsaki/hentoid/viewmodels/DuplicateViewModel;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "enableCurrentFragment", "", "enableFragment", "fragmentIndex", "", "getToolbarView", "Landroid/view/View;", "goBackToMain", "hideSettingsBar", "initFragmentToolbars", "toolbarOnItemClicked", "Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;", "initSelectionToolbar", "initUI", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "showDetailsFor", "content", "Lme/devsaki/hentoid/database/domains/Content;", "updateDisplay", "updateSelectionToolbar", "updateTitle", "count", "updateToolbar", "localCount", "externalCount", "streamedCount", "DuplicatePagerAdapter", "app_debug"})
public final class DuplicateDetectorActivity extends me.devsaki.hentoid.activities.BaseActivity {
    private me.devsaki.hentoid.databinding.ActivityDuplicateDetectorBinding binding;
    private androidx.viewpager2.widget.ViewPager2 viewPager;
    private me.devsaki.hentoid.viewmodels.DuplicateViewModel viewModel;
    
    public DuplicateDetectorActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void initUI() {
    }
    
    public final void initFragmentToolbars(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar.OnMenuItemClickListener toolbarOnItemClicked) {
    }
    
    private final void updateDisplay() {
    }
    
    public final void goBackToMain() {
    }
    
    public final void showDetailsFor(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.domains.Content content) {
    }
    
    private final void enableCurrentFragment() {
    }
    
    private final void enableFragment(int fragmentIndex) {
    }
    
    /**
     * Update the title of the DuplicateDetectorActivity
     * ```
     * if count>0, update the title to "n duplicates" for the detail page
     * if count<0, update the title to "n item(s) left" for the main page
     * if count=0, update the title to "Duplicate Detector" for the main page without any items
     * ```
     * @param count Number of items
     */
    public final void updateTitle(int count) {
    }
    
    public final void updateToolbar(int localCount, int externalCount, int streamedCount) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getToolbarView() {
        return null;
    }
    
    private final void initSelectionToolbar() {
    }
    
    private final void hideSettingsBar() {
    }
    
    private final void updateSelectionToolbar() {
    }
    
    /**
     * ============================== SUBCLASS
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lme/devsaki/hentoid/activities/DuplicateDetectorActivity$DuplicatePagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fa", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_debug"})
    static final class DuplicatePagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        
        public DuplicatePagerAdapter(@org.jetbrains.annotations.Nullable()
        androidx.fragment.app.FragmentActivity fa) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
}