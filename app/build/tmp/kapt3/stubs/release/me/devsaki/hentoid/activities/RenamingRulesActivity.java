package me.devsaki.hentoid.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\u0012\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J \u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00122\u0006\u0010\'\u001a\u00020\u0012H\u0016J\b\u0010(\u001a\u00020\u001aH\u0014J \u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010\'\u001a\u00020\u0012H\u0016J\u0010\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\fH\u0002J\u0010\u0010.\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+H\u0016J\u0016\u0010/\u001a\u00020\u001a2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001f01H\u0002J\b\u00102\u001a\u00020\u001aH\u0002J\u0010\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020\u000e2\u0006\u00104\u001a\u000205H\u0002J\b\u00107\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lme/devsaki/hentoid/activities/RenamingRulesActivity;", "Lme/devsaki/hentoid/activities/BaseActivity;", "Lme/devsaki/hentoid/fragments/metadata/MetaEditRuleDialogFragment$Parent;", "()V", "actionSearchView", "Landroidx/appcompat/widget/SearchView;", "attributeTypeFilter", "Lme/devsaki/hentoid/enums/AttributeType;", "binding", "Lme/devsaki/hentoid/databinding/ActivityRulesBinding;", "fastAdapter", "Lcom/mikepenz/fastadapter/FastAdapter;", "Lme/devsaki/hentoid/viewholders/RuleItem;", "invalidateNextQueryTextChange", "", "itemAdapter", "Lcom/mikepenz/fastadapter/adapters/ItemAdapter;", "queryFilter", "", "ruleItemDiffCallback", "Lcom/mikepenz/fastadapter/diff/DiffCallback;", "selectExtension", "Lcom/mikepenz/fastadapter/select/SelectExtension;", "viewModel", "Lme/devsaki/hentoid/viewmodels/RulesEditViewModel;", "bindInteractions", "", "bindUI", "deleteSelectedItems", "editRule", "rule", "Lme/devsaki/hentoid/database/domains/RenamingRule;", "leaveSelectionMode", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateRule", "type", "source", "target", "onDestroy", "onEditRule", "id", "", "onItemClick", "item", "onRemoveRule", "onRulesChanged", "rules", "", "onSelectionChanged", "onSelectionToolbarItemClicked", "menuItem", "Landroid/view/MenuItem;", "onToolbarItemClicked", "showSortFilterPanel", "app_release"})
public final class RenamingRulesActivity extends me.devsaki.hentoid.activities.BaseActivity implements me.devsaki.hentoid.fragments.metadata.MetaEditRuleDialogFragment.Parent {
    private me.devsaki.hentoid.viewmodels.RulesEditViewModel viewModel;
    private me.devsaki.hentoid.databinding.ActivityRulesBinding binding;
    private androidx.appcompat.widget.SearchView actionSearchView;
    private final com.mikepenz.fastadapter.adapters.ItemAdapter<me.devsaki.hentoid.viewholders.RuleItem> itemAdapter = null;
    private final com.mikepenz.fastadapter.FastAdapter<me.devsaki.hentoid.viewholders.RuleItem> fastAdapter = null;
    private com.mikepenz.fastadapter.select.SelectExtension<me.devsaki.hentoid.viewholders.RuleItem> selectExtension;
    private boolean invalidateNextQueryTextChange = false;
    private java.lang.String queryFilter = "";
    private me.devsaki.hentoid.enums.AttributeType attributeTypeFilter = me.devsaki.hentoid.enums.AttributeType.UNDEFINED;
    private final com.mikepenz.fastadapter.diff.DiffCallback<me.devsaki.hentoid.viewholders.RuleItem> ruleItemDiffCallback = null;
    
    public RenamingRulesActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void onRulesChanged(java.util.List<? extends me.devsaki.hentoid.database.domains.RenamingRule> rules) {
    }
    
    private final void bindUI() {
    }
    
    private final void bindInteractions() {
    }
    
    /**
     * Callback for any selection change (item added to or removed from selection)
     */
    private final void onSelectionChanged() {
    }
    
    private final boolean onToolbarItemClicked(android.view.MenuItem menuItem) {
        return false;
    }
    
    private final boolean onSelectionToolbarItemClicked(android.view.MenuItem menuItem) {
        return false;
    }
    
    private final void showSortFilterPanel() {
    }
    
    private final void deleteSelectedItems() {
    }
    
    private final void leaveSelectionMode() {
    }
    
    /**
     * Callback for attribute item click
     *
     * @param item RuleItem that has been clicked on
     */
    private final boolean onItemClick(me.devsaki.hentoid.viewholders.RuleItem item) {
        return false;
    }
    
    private final void editRule(me.devsaki.hentoid.database.domains.RenamingRule rule) {
    }
    
    @java.lang.Override()
    public void onCreateRule(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.enums.AttributeType type, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String target) {
    }
    
    @java.lang.Override()
    public void onEditRule(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String target) {
    }
    
    @java.lang.Override()
    public void onRemoveRule(long id) {
    }
}