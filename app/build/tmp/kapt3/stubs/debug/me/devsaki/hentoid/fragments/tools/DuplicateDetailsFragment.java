package me.devsaki.hentoid.fragments.tools;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016J&\u0010 \u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0012H\u0016J\u0010\u0010\'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0016J\u001a\u0010-\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010#2\u0006\u0010/\u001a\u00020\u0012H\u0002J$\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u00020\u001eH\u0002J\b\u00109\u001a\u00020\u001eH\u0016J\b\u0010:\u001a\u00020\u001eH\u0002J\u0018\u0010;\u001a\u00020\u001e2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=H\u0002J\b\u0010?\u001a\u00020\u001eH\u0002J\u0010\u0010@\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0006H\u0002J\b\u0010A\u001a\u00020\u001eH\u0016J\b\u0010B\u001a\u00020\u001eH\u0016J\u0010\u0010C\u001a\u00020\u00122\u0006\u0010D\u001a\u00020EH\u0002J\u001a\u0010F\u001a\u00020\u001e2\u0006\u0010G\u001a\u0002012\b\u00106\u001a\u0004\u0018\u000107H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006H"}, d2 = {"Lme/devsaki/hentoid/fragments/tools/DuplicateDetailsFragment;", "Landroidx/fragment/app/Fragment;", "Lme/devsaki/hentoid/fragments/library/MergeDialogFragment$Parent;", "()V", "ITEM_DIFF_CALLBACK", "Lcom/mikepenz/fastadapter/diff/DiffCallback;", "Lme/devsaki/hentoid/viewholders/DuplicateItem;", "_binding", "Lme/devsaki/hentoid/databinding/FragmentDuplicateDetailsBinding;", "activity", "Ljava/lang/ref/WeakReference;", "Lme/devsaki/hentoid/activities/DuplicateDetectorActivity;", "binding", "getBinding", "()Lme/devsaki/hentoid/databinding/FragmentDuplicateDetailsBinding;", "callback", "Landroidx/activity/OnBackPressedCallback;", "enabled", "", "fastAdapter", "Lcom/mikepenz/fastadapter/FastAdapter;", "itemAdapter", "Lcom/mikepenz/fastadapter/adapters/ItemAdapter;", "viewModel", "Lme/devsaki/hentoid/viewmodels/DuplicateViewModel;", "getViewModel", "()Lme/devsaki/hentoid/viewmodels/DuplicateViewModel;", "setViewModel", "(Lme/devsaki/hentoid/viewmodels/DuplicateViewModel;)V", "addCustomBackControl", "", "leaveSelectionMode", "mergeContents", "contentList", "", "Lme/devsaki/hentoid/database/domains/Content;", "newTitle", "", "deleteAfterMerging", "onActivityEvent", "event", "Lme/devsaki/hentoid/events/CommunicationEvent;", "onAttach", "context", "Landroid/content/Context;", "onBookChoice", "item", "choice", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onCustomBackPress", "onDestroyView", "onDisable", "onDuplicatesChanged", "duplicates", "", "Lme/devsaki/hentoid/database/domains/DuplicateEntry;", "onEnable", "onItemClick", "onStart", "onStop", "onToolbarItemClicked", "menuItem", "Landroid/view/MenuItem;", "onViewCreated", "view", "app_debug"})
public final class DuplicateDetailsFragment extends androidx.fragment.app.Fragment implements me.devsaki.hentoid.fragments.library.MergeDialogFragment.Parent {
    private me.devsaki.hentoid.databinding.FragmentDuplicateDetailsBinding _binding;
    private androidx.activity.OnBackPressedCallback callback;
    private java.lang.ref.WeakReference<me.devsaki.hentoid.activities.DuplicateDetectorActivity> activity;
    public me.devsaki.hentoid.viewmodels.DuplicateViewModel viewModel;
    private final com.mikepenz.fastadapter.adapters.ItemAdapter<me.devsaki.hentoid.viewholders.DuplicateItem> itemAdapter = null;
    private final com.mikepenz.fastadapter.FastAdapter<me.devsaki.hentoid.viewholders.DuplicateItem> fastAdapter = null;
    private boolean enabled = true;
    private final com.mikepenz.fastadapter.diff.DiffCallback<me.devsaki.hentoid.viewholders.DuplicateItem> ITEM_DIFF_CALLBACK = null;
    
    public DuplicateDetailsFragment() {
        super();
    }
    
    private final me.devsaki.hentoid.databinding.FragmentDuplicateDetailsBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.viewmodels.DuplicateViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.viewmodels.DuplicateViewModel p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addCustomBackControl() {
    }
    
    private final void onCustomBackPress() {
    }
    
    private final void onItemClick(me.devsaki.hentoid.viewholders.DuplicateItem item) {
    }
    
    private final void onBookChoice(me.devsaki.hentoid.database.domains.Content item, boolean choice) {
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized void onDuplicatesChanged(java.util.List<me.devsaki.hentoid.database.domains.DuplicateEntry> duplicates) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onActivityEvent(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.events.CommunicationEvent event) {
    }
    
    private final boolean onToolbarItemClicked(android.view.MenuItem menuItem) {
        return false;
    }
    
    private final void onEnable() {
    }
    
    private final void onDisable() {
    }
    
    @java.lang.Override()
    public void mergeContents(@org.jetbrains.annotations.NotNull()
    java.util.List<me.devsaki.hentoid.database.domains.Content> contentList, @org.jetbrains.annotations.NotNull()
    java.lang.String newTitle, boolean deleteAfterMerging) {
    }
    
    @java.lang.Override()
    public void leaveSelectionMode() {
    }
}