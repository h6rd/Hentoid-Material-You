package me.devsaki.hentoid.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eJ\u0016\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\nJ \u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\'J\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\'J\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\'J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\'J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170\'J\u000e\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.J\b\u0010/\u001a\u00020\u0019H\u0014J\u000e\u00100\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eJ\u001e\u00101\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0016\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u000eJ\u0006\u0010\u0016\u001a\u00020\u0019J\u0006\u00105\u001a\u00020\u0019J&\u00106\u001a\u00020\u00192\b\u00107\u001a\u0004\u0018\u00010\u000e2\b\u00108\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u00109\u001a\u00020$H\u0002J\u001e\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u00172\u0006\u0010=\u001a\u00020\u0017J\u0014\u0010>\u001a\u00020\u00192\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010@\u001a\u00020\u00192\u0006\u0010A\u001a\u00020\u0017J\u000e\u0010B\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u001dR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lme/devsaki/hentoid/viewmodels/MetadataEditViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "(Landroid/app/Application;Lme/devsaki/hentoid/database/CollectionDAO;)V", "attributeTypes", "Landroidx/lifecycle/MutableLiveData;", "", "Lme/devsaki/hentoid/enums/AttributeType;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "contentAttributes", "Lme/devsaki/hentoid/database/domains/Attribute;", "contentList", "Lme/devsaki/hentoid/database/domains/Content;", "filterDisposable", "Lio/reactivex/disposables/Disposable;", "leaveDisposable", "libraryAttributes", "Lme/devsaki/hentoid/util/SearchHelper$AttributeQueryResult;", "resetSelectionFilter", "", "addContentAttribute", "", "attr", "createAssignNewAttribute", "attrName", "", "type", "doRenameAttribute", "newName", "id", "", "createRule", "", "doSaveContent", "getAttributeTypes", "Landroidx/lifecycle/LiveData;", "getContent", "getContentAttributes", "getLibraryAttributes", "getResetSelectionFilter", "loadContent", "contentId", "", "onCleared", "removeContentAttribute", "renameAttribute", "replaceContentAttribute", "idToBeReplaced", "toReplaceWith", "saveContent", "setAttr", "toAdd", "toRemove", "replaceMode", "setAttributeQuery", "query", "pageNum", "itemsPerPage", "setAttributeTypes", "value", "setCover", "order", "setTitle", "app_release"})
public final class MetadataEditViewModel extends androidx.lifecycle.AndroidViewModel {
    private final me.devsaki.hentoid.database.CollectionDAO dao = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private io.reactivex.disposables.Disposable filterDisposable;
    private io.reactivex.disposables.Disposable leaveDisposable;
    private final androidx.lifecycle.MutableLiveData<java.util.List<me.devsaki.hentoid.database.domains.Content>> contentList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<me.devsaki.hentoid.enums.AttributeType>> attributeTypes = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<me.devsaki.hentoid.database.domains.Attribute>> contentAttributes = null;
    private final androidx.lifecycle.MutableLiveData<me.devsaki.hentoid.util.SearchHelper.AttributeQueryResult> libraryAttributes = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> resetSelectionFilter = null;
    
    public MetadataEditViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.CollectionDAO dao) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.Content>> getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.enums.AttributeType>> getAttributeTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.Attribute>> getContentAttributes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<me.devsaki.hentoid.util.SearchHelper.AttributeQueryResult> getLibraryAttributes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getResetSelectionFilter() {
        return null;
    }
    
    /**
     * Allow the Activity to tell the BottomSheetFragment to reset its filter
     * Needed because the callback from AttributeTypePickerDialogFragment is done on the activity
     */
    public final void resetSelectionFilter() {
    }
    
    /**
     * Load the given list of Content
     *
     * @param contentId  IDs of the Contents to load
     */
    public final void loadContent(@org.jetbrains.annotations.NotNull()
    long[] contentId) {
    }
    
    public final void setCover(int order) {
    }
    
    /**
     * Set the attributes type to search in the Atttribute search
     *
     * @param value Attribute types the searches will be performed for
     */
    public final void setAttributeTypes(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends me.devsaki.hentoid.enums.AttributeType> value) {
    }
    
    /**
     * Set and run the query to perform the Attribute search
     *
     * @param query        Content of the attribute name to search (%s%)
     * @param pageNum      Number of the "paged" result to fetch
     * @param itemsPerPage Number of items per result "page"
     */
    public final void setAttributeQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int pageNum, int itemsPerPage) {
    }
    
    /**
     * Replace the given attribute with the other given attribute to the selected books
     * NB : Replacement will be done only on books where 'toBeReplaced' is set; _not_ on all books of the collection
     *
     * @param idToBeReplaced ID of the Attribute to be replaced in the current book selection
     * @param toReplaceWith Attribute to replace with in the current book selection
     */
    public final void replaceContentAttribute(long idToBeReplaced, @org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.domains.Attribute toReplaceWith) {
    }
    
    /**
     * Add the given attribute to the selected books
     *
     * @param attr Attribute to add to current selection
     */
    public final void addContentAttribute(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.domains.Attribute attr) {
    }
    
    /**
     * Remove the given attribute from the selected books
     *
     * @param attr Attribute to remove to current selection
     */
    public final void removeContentAttribute(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.domains.Attribute attr) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.database.domains.Attribute createAssignNewAttribute(@org.jetbrains.annotations.NotNull()
    java.lang.String attrName, @org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.enums.AttributeType type) {
        return null;
    }
    
    /**
     * Add and remove the given attributes from the selected books
     *
     * @param toAdd Attribute to add to current selection
     * @param toRemove Attribute to remove to current selection
     * @param replaceMode True to add only where removed items are present; false to apply to all books
     */
    private final void setAttr(me.devsaki.hentoid.database.domains.Attribute toAdd, me.devsaki.hentoid.database.domains.Attribute toRemove, boolean replaceMode) {
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void saveContent() {
    }
    
    private final void doSaveContent() {
    }
    
    public final void renameAttribute(@org.jetbrains.annotations.NotNull()
    java.lang.String newName, long id, boolean createRule) {
    }
    
    private final void doRenameAttribute(java.lang.String newName, long id, boolean createRule) {
    }
}