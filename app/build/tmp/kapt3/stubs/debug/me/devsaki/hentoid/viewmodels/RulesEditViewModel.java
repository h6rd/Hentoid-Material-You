package me.devsaki.hentoid.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014J \u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J \u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J\u0016\u0010 \u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010H\u0002J\u001e\u0010\"\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fJ\u0006\u0010%\u001a\u00020\u0018J\b\u0010&\u001a\u00020\u0018H\u0014J\u0014\u0010\'\u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010J\u000e\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000bJ\u000e\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lme/devsaki/hentoid/viewmodels/RulesEditViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "(Landroid/app/Application;Lme/devsaki/hentoid/database/CollectionDAO;)V", "actionDisposable", "Lio/reactivex/disposables/Disposable;", "attributeTypeFilter", "Landroidx/lifecycle/MutableLiveData;", "Lme/devsaki/hentoid/enums/AttributeType;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "currentRulesSource", "Landroidx/lifecycle/LiveData;", "", "Lme/devsaki/hentoid/database/domains/RenamingRule;", "filterDisposable", "query", "", "rulesList", "Landroidx/lifecycle/MediatorLiveData;", "createRule", "", "type", "source", "target", "doCreateRule", "doEditRule", "id", "", "doRemoveRules", "itemIds", "editRule", "getAttributeTypeFilter", "getRules", "loadRules", "onCleared", "removeRules", "setAttributeType", "attributeType", "setQuery", "data", "app_debug"})
public final class RulesEditViewModel extends androidx.lifecycle.AndroidViewModel {
    private final me.devsaki.hentoid.database.CollectionDAO dao = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private io.reactivex.disposables.Disposable actionDisposable;
    private io.reactivex.disposables.Disposable filterDisposable;
    private java.lang.String query = "";
    private androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.RenamingRule>> currentRulesSource;
    private final androidx.lifecycle.MediatorLiveData<java.util.List<me.devsaki.hentoid.database.domains.RenamingRule>> rulesList = null;
    private final androidx.lifecycle.MutableLiveData<me.devsaki.hentoid.enums.AttributeType> attributeTypeFilter = null;
    
    public RulesEditViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.CollectionDAO dao) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.RenamingRule>> getRules() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<me.devsaki.hentoid.enums.AttributeType> getAttributeTypeFilter() {
        return null;
    }
    
    public final void setAttributeType(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.enums.AttributeType attributeType) {
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    public final void loadRules() {
    }
    
    public final void createRule(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.enums.AttributeType type, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String target) {
    }
    
    private final void doCreateRule(me.devsaki.hentoid.enums.AttributeType type, java.lang.String source, java.lang.String target) {
    }
    
    public final void editRule(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String target) {
    }
    
    private final void doEditRule(long id, java.lang.String source, java.lang.String target) {
    }
    
    public final void removeRules(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> itemIds) {
    }
    
    private final void doRemoveRules(java.util.List<java.lang.Long> itemIds) {
    }
}