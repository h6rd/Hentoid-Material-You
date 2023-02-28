package me.devsaki.hentoid.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0018J\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010 \u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lme/devsaki/hentoid/widget/GroupSearchManager;", "", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "(Lme/devsaki/hentoid/database/CollectionDAO;)V", "getDao", "()Lme/devsaki/hentoid/database/CollectionDAO;", "values", "Lme/devsaki/hentoid/widget/GroupSearchManager$GroupSearchBundle;", "clearFilters", "", "getAllGroups", "Landroidx/lifecycle/LiveData;", "", "Lme/devsaki/hentoid/database/domains/Group;", "getGroups", "loadFromBundle", "b", "Landroid/os/Bundle;", "saveToBundle", "setArtistGroupVisibility", "value", "", "setFilterFavourites", "", "setFilterRating", "setGrouping", "Lme/devsaki/hentoid/enums/Grouping;", "setQuery", "", "setSortDesc", "setSortField", "toBundle", "GroupSearchBundle", "app_release"})
public final class GroupSearchManager {
    @org.jetbrains.annotations.NotNull()
    private final me.devsaki.hentoid.database.CollectionDAO dao = null;
    private final me.devsaki.hentoid.widget.GroupSearchManager.GroupSearchBundle values = null;
    
    public GroupSearchManager(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.CollectionDAO dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.database.CollectionDAO getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Bundle toBundle() {
        return null;
    }
    
    public final void saveToBundle(@org.jetbrains.annotations.NotNull()
    android.os.Bundle b) {
    }
    
    public final void loadFromBundle(@org.jetbrains.annotations.NotNull()
    android.os.Bundle b) {
    }
    
    public final void setFilterFavourites(boolean value) {
    }
    
    public final void setFilterRating(int value) {
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void setGrouping(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.enums.Grouping value) {
    }
    
    public final void setArtistGroupVisibility(int value) {
    }
    
    public final void setSortField(int value) {
    }
    
    public final void setSortDesc(boolean value) {
    }
    
    public final void clearFilters() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.Group>> getGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.Group>> getAllGroups() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010.\u001a\u00020\u0010R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR+\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR+\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b%\u0010\r\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010&\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b)\u0010\r\u001a\u0004\b\'\u0010\u0013\"\u0004\b(\u0010\u0015R+\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b-\u0010\r\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000b\u00a8\u0006/"}, d2 = {"Lme/devsaki/hentoid/widget/GroupSearchManager$GroupSearchBundle;", "", "bundle", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "<set-?>", "", "artistGroupVisibility", "getArtistGroupVisibility", "()I", "setArtistGroupVisibility", "(I)V", "artistGroupVisibility$delegate", "Lkotlin/properties/ReadWriteProperty;", "getBundle", "()Landroid/os/Bundle;", "", "filterFavourites", "getFilterFavourites", "()Z", "setFilterFavourites", "(Z)V", "filterFavourites$delegate", "filterRating", "getFilterRating", "setFilterRating", "filterRating$delegate", "groupingId", "getGroupingId", "setGroupingId", "groupingId$delegate", "", "query", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "query$delegate", "sortDesc", "getSortDesc", "setSortDesc", "sortDesc$delegate", "sortField", "getSortField", "setSortField", "sortField$delegate", "isFilterActive", "app_release"})
    public static final class GroupSearchBundle {
        @org.jetbrains.annotations.NotNull()
        private final android.os.Bundle bundle = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty filterFavourites$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty filterRating$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty artistGroupVisibility$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty query$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty groupingId$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty sortField$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty sortDesc$delegate = null;
        
        public GroupSearchBundle() {
            super();
        }
        
        public GroupSearchBundle(@org.jetbrains.annotations.NotNull()
        android.os.Bundle bundle) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle getBundle() {
            return null;
        }
        
        public final boolean getFilterFavourites() {
            return false;
        }
        
        public final void setFilterFavourites(boolean p0) {
        }
        
        public final int getFilterRating() {
            return 0;
        }
        
        public final void setFilterRating(int p0) {
        }
        
        public final int getArtistGroupVisibility() {
            return 0;
        }
        
        public final void setArtistGroupVisibility(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getQuery() {
            return null;
        }
        
        public final void setQuery(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getGroupingId() {
            return 0;
        }
        
        public final void setGroupingId(int p0) {
        }
        
        public final int getSortField() {
            return 0;
        }
        
        public final void setSortField(int p0) {
        }
        
        public final boolean getSortDesc() {
            return false;
        }
        
        public final void setSortDesc(boolean p0) {
        }
        
        public final boolean isFilterActive() {
            return false;
        }
    }
}