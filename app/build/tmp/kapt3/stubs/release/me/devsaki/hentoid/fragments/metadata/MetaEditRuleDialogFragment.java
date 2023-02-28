package me.devsaki.hentoid.fragments.metadata;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0002J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\u001a\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010)\u001a\u00020\u0019H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lme/devsaki/hentoid/fragments/metadata/MetaEditRuleDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "Lme/devsaki/hentoid/databinding/DialogMetaRuleEditBinding;", "attrType", "Lme/devsaki/hentoid/enums/AttributeType;", "attributeTypes", "Ljava/util/ArrayList;", "binding", "getBinding", "()Lme/devsaki/hentoid/databinding/DialogMetaRuleEditBinding;", "isCreateMode", "", "parent", "Lme/devsaki/hentoid/fragments/metadata/MetaEditRuleDialogFragment$Parent;", "ruleId", "", "checkConsistency", "sourceName", "", "targetName", "loadRule", "Lme/devsaki/hentoid/database/domains/RenamingRule;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateClick", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedState", "onDestroyView", "onEditClick", "onRemoveClick", "onViewCreated", "rootView", "updateNewBtnStates", "Companion", "Parent", "app_release"})
public final class MetaEditRuleDialogFragment extends androidx.fragment.app.DialogFragment {
    private me.devsaki.hentoid.databinding.DialogMetaRuleEditBinding _binding;
    private me.devsaki.hentoid.enums.AttributeType attrType;
    private me.devsaki.hentoid.fragments.metadata.MetaEditRuleDialogFragment.Parent parent;
    private boolean isCreateMode = false;
    private long ruleId = 0L;
    private final java.util.ArrayList<me.devsaki.hentoid.enums.AttributeType> attributeTypes = null;
    @org.jetbrains.annotations.NotNull()
    public static final me.devsaki.hentoid.fragments.metadata.MetaEditRuleDialogFragment.Companion Companion = null;
    
    public MetaEditRuleDialogFragment() {
        super();
    }
    
    private final me.devsaki.hentoid.databinding.DialogMetaRuleEditBinding getBinding() {
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
    
    private final void updateNewBtnStates() {
    }
    
    private final me.devsaki.hentoid.database.domains.RenamingRule loadRule() {
        return null;
    }
    
    private final void onCreateClick() {
    }
    
    private final void onEditClick() {
    }
    
    private final boolean checkConsistency(java.lang.String sourceName, java.lang.String targetName) {
        return false;
    }
    
    private final void onRemoveClick() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lme/devsaki/hentoid/fragments/metadata/MetaEditRuleDialogFragment$Parent;", "", "onCreateRule", "", "type", "Lme/devsaki/hentoid/enums/AttributeType;", "source", "", "target", "onEditRule", "id", "", "onRemoveRule", "app_release"})
    public static abstract interface Parent {
        
        public abstract void onCreateRule(@org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.enums.AttributeType type, @org.jetbrains.annotations.NotNull()
        java.lang.String source, @org.jetbrains.annotations.NotNull()
        java.lang.String target);
        
        public abstract void onEditRule(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String source, @org.jetbrains.annotations.NotNull()
        java.lang.String target);
        
        public abstract void onRemoveRule(long id);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a8\u0006\r"}, d2 = {"Lme/devsaki/hentoid/fragments/metadata/MetaEditRuleDialogFragment$Companion;", "", "()V", "invoke", "", "parent", "Landroidx/fragment/app/FragmentActivity;", "createMode", "", "ruleId", "", "attrType", "Lme/devsaki/hentoid/enums/AttributeType;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity parent, boolean createMode, long ruleId, @org.jetbrains.annotations.Nullable()
        me.devsaki.hentoid.enums.AttributeType attrType) {
        }
    }
}