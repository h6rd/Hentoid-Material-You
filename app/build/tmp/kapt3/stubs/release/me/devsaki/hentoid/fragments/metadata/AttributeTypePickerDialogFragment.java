package me.devsaki.hentoid.fragments.metadata;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0002J\u001a\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lme/devsaki/hentoid/fragments/metadata/AttributeTypePickerDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "Lme/devsaki/hentoid/databinding/DialogMetaNewAttributeBinding;", "binding", "getBinding", "()Lme/devsaki/hentoid/databinding/DialogMetaNewAttributeBinding;", "fastAdapter", "Lcom/mikepenz/fastadapter/FastAdapter;", "Lme/devsaki/hentoid/viewholders/AttributeItem;", "itemAdapter", "Lcom/mikepenz/fastadapter/adapters/ItemAdapter;", "newAttrName", "", "parent", "Lme/devsaki/hentoid/fragments/metadata/AttributeTypePickerDialogFragment$Parent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedState", "onDestroyView", "onItemClick", "", "item", "onViewCreated", "rootView", "Companion", "Parent", "app_release"})
public final class AttributeTypePickerDialogFragment extends androidx.fragment.app.DialogFragment {
    private me.devsaki.hentoid.databinding.DialogMetaNewAttributeBinding _binding;
    private final com.mikepenz.fastadapter.adapters.ItemAdapter<me.devsaki.hentoid.viewholders.AttributeItem> itemAdapter = null;
    private final com.mikepenz.fastadapter.FastAdapter<me.devsaki.hentoid.viewholders.AttributeItem> fastAdapter = null;
    private me.devsaki.hentoid.fragments.metadata.AttributeTypePickerDialogFragment.Parent parent;
    private java.lang.String newAttrName;
    @org.jetbrains.annotations.NotNull()
    public static final me.devsaki.hentoid.fragments.metadata.AttributeTypePickerDialogFragment.Companion Companion = null;
    
    public AttributeTypePickerDialogFragment() {
        super();
    }
    
    private final me.devsaki.hentoid.databinding.DialogMetaNewAttributeBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    /**
     * Callback for image item click
     *
     * @param item AttributeItem that has been clicked on
     */
    private final boolean onItemClick(me.devsaki.hentoid.viewholders.AttributeItem item) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lme/devsaki/hentoid/fragments/metadata/AttributeTypePickerDialogFragment$Parent;", "", "onNewAttributeSelected", "", "name", "", "type", "Lme/devsaki/hentoid/enums/AttributeType;", "app_release"})
    public static abstract interface Parent {
        
        public abstract void onNewAttributeSelected(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.enums.AttributeType type);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lme/devsaki/hentoid/fragments/metadata/AttributeTypePickerDialogFragment$Companion;", "", "()V", "invoke", "", "parent", "Landroidx/fragment/app/FragmentActivity;", "newAttrName", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity parent, @org.jetbrains.annotations.NotNull()
        java.lang.String newAttrName) {
        }
    }
}