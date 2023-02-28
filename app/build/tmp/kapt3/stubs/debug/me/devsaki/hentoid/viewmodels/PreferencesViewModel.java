package me.devsaki.hentoid.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0014J\u0006\u0010\f\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lme/devsaki/hentoid/viewmodels/PreferencesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "(Landroid/app/Application;Lme/devsaki/hentoid/database/CollectionDAO;)V", "getDao", "()Lme/devsaki/hentoid/database/CollectionDAO;", "deleteAllItemsExceptFavourites", "", "onCleared", "removeAllExternalContent", "app_debug"})
public final class PreferencesViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final me.devsaki.hentoid.database.CollectionDAO dao = null;
    
    public PreferencesViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.CollectionDAO dao) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.database.CollectionDAO getDao() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void removeAllExternalContent() {
    }
    
    public final void deleteAllItemsExceptFavourites() {
    }
}