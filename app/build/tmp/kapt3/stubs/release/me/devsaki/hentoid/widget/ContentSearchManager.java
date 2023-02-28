package me.devsaki.hentoid.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001/B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018J\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0011J\u000e\u0010!\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0011J\u000e\u0010\"\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0011J\u000e\u0010#\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0011J\u000e\u0010$\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001eJ\u0010\u0010%\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010&J\u000e\u0010\'\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0011J\u000e\u0010(\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001eJ\u000e\u0010)\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020*J\u0016\u0010+\u001a\u00020\n2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0019J\u0006\u0010.\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lme/devsaki/hentoid/widget/ContentSearchManager;", "", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "(Lme/devsaki/hentoid/database/CollectionDAO;)V", "getDao", "()Lme/devsaki/hentoid/database/CollectionDAO;", "values", "Lme/devsaki/hentoid/widget/ContentSearchManager$ContentSearchBundle;", "clearFilters", "", "clearSelectedSearchTags", "getLibrary", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lme/devsaki/hentoid/database/domains/Content;", "isFilterBookCompleted", "", "isFilterBookNotCompleted", "loadFromBundle", "b", "Landroid/os/Bundle;", "saveToBundle", "searchLibraryForId", "Lio/reactivex/Single;", "", "", "setContentSortDesc", "value", "setContentSortField", "", "setContentType", "setFilterBookCompleted", "setFilterBookFavourites", "setFilterBookNotCompleted", "setFilterPageFavourites", "setFilterRating", "setGroup", "Lme/devsaki/hentoid/database/domains/Group;", "setLoadAll", "setLocation", "setQuery", "", "setTags", "tags", "Lme/devsaki/hentoid/database/domains/Attribute;", "toBundle", "ContentSearchBundle", "app_release"})
public final class ContentSearchManager {
    @org.jetbrains.annotations.NotNull()
    private final me.devsaki.hentoid.database.CollectionDAO dao = null;
    private final me.devsaki.hentoid.widget.ContentSearchManager.ContentSearchBundle values = null;
    
    public ContentSearchManager(@org.jetbrains.annotations.NotNull()
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
    
    public final void setFilterBookFavourites(boolean value) {
    }
    
    public final void setFilterBookCompleted(boolean value) {
    }
    
    public final boolean isFilterBookCompleted() {
        return false;
    }
    
    public final void setFilterBookNotCompleted(boolean value) {
    }
    
    public final boolean isFilterBookNotCompleted() {
        return false;
    }
    
    public final void setFilterRating(int value) {
    }
    
    public final void setFilterPageFavourites(boolean value) {
    }
    
    public final void setLoadAll(boolean value) {
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void setContentSortField(int value) {
    }
    
    public final void setContentSortDesc(boolean value) {
    }
    
    public final void setLocation(int value) {
    }
    
    public final void setContentType(int value) {
    }
    
    public final void setGroup(@org.jetbrains.annotations.Nullable()
    me.devsaki.hentoid.database.domains.Group value) {
    }
    
    public final void setTags(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends me.devsaki.hentoid.database.domains.Attribute> tags) {
    }
    
    public final void clearSelectedSearchTags() {
    }
    
    public final void clearFilters() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<me.devsaki.hentoid.database.domains.Content>> getLibrary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<java.lang.Long>> searchLibraryForId() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010I\u001a\u00020\u0017R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00178F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00178F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\r\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR+\u0010\"\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00178F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b%\u0010\r\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR+\u0010&\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00178F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b)\u0010\r\u001a\u0004\b\'\u0010\u001a\"\u0004\b(\u0010\u001cR+\u0010*\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b-\u0010\r\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R+\u0010/\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020.8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b4\u0010\r\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u00105\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00178F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b8\u0010\r\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR+\u00109\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b<\u0010\r\u001a\u0004\b:\u0010\u0013\"\u0004\b;\u0010\u0015R+\u0010=\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b@\u0010\r\u001a\u0004\b>\u0010\t\"\u0004\b?\u0010\u000bR+\u0010A\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00178F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bD\u0010\r\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010\u001cR+\u0010E\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bH\u0010\r\u001a\u0004\bF\u0010\u0013\"\u0004\bG\u0010\u0015\u00a8\u0006J"}, d2 = {"Lme/devsaki/hentoid/widget/ContentSearchManager$ContentSearchBundle;", "", "bundle", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "<set-?>", "", "attributes", "getAttributes", "()Ljava/lang/String;", "setAttributes", "(Ljava/lang/String;)V", "attributes$delegate", "Lkotlin/properties/ReadWriteProperty;", "getBundle", "()Landroid/os/Bundle;", "", "contentType", "getContentType", "()I", "setContentType", "(I)V", "contentType$delegate", "", "filterBookCompleted", "getFilterBookCompleted", "()Z", "setFilterBookCompleted", "(Z)V", "filterBookCompleted$delegate", "filterBookFavourites", "getFilterBookFavourites", "setFilterBookFavourites", "filterBookFavourites$delegate", "filterBookNotCompleted", "getFilterBookNotCompleted", "setFilterBookNotCompleted", "filterBookNotCompleted$delegate", "filterPageFavourites", "getFilterPageFavourites", "setFilterPageFavourites", "filterPageFavourites$delegate", "filterRating", "getFilterRating", "setFilterRating", "filterRating$delegate", "", "groupId", "getGroupId", "()J", "setGroupId", "(J)V", "groupId$delegate", "loadAll", "getLoadAll", "setLoadAll", "loadAll$delegate", "location", "getLocation", "setLocation", "location$delegate", "query", "getQuery", "setQuery", "query$delegate", "sortDesc", "getSortDesc", "setSortDesc", "sortDesc$delegate", "sortField", "getSortField", "setSortField", "sortField$delegate", "isFilterActive", "app_release"})
    public static final class ContentSearchBundle {
        @org.jetbrains.annotations.NotNull()
        private final android.os.Bundle bundle = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty loadAll$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty filterPageFavourites$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty filterBookFavourites$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty filterBookCompleted$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty filterBookNotCompleted$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty filterRating$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty query$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty sortField$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty sortDesc$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty attributes$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty location$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty contentType$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.properties.ReadWriteProperty groupId$delegate = null;
        
        public ContentSearchBundle() {
            super();
        }
        
        public ContentSearchBundle(@org.jetbrains.annotations.NotNull()
        android.os.Bundle bundle) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle getBundle() {
            return null;
        }
        
        public final boolean getLoadAll() {
            return false;
        }
        
        public final void setLoadAll(boolean p0) {
        }
        
        public final boolean getFilterPageFavourites() {
            return false;
        }
        
        public final void setFilterPageFavourites(boolean p0) {
        }
        
        public final boolean getFilterBookFavourites() {
            return false;
        }
        
        public final void setFilterBookFavourites(boolean p0) {
        }
        
        public final boolean getFilterBookCompleted() {
            return false;
        }
        
        public final void setFilterBookCompleted(boolean p0) {
        }
        
        public final boolean getFilterBookNotCompleted() {
            return false;
        }
        
        public final void setFilterBookNotCompleted(boolean p0) {
        }
        
        public final int getFilterRating() {
            return 0;
        }
        
        public final void setFilterRating(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getQuery() {
            return null;
        }
        
        public final void setQuery(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
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
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAttributes() {
            return null;
        }
        
        public final void setAttributes(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getLocation() {
            return 0;
        }
        
        public final void setLocation(int p0) {
        }
        
        public final int getContentType() {
            return 0;
        }
        
        public final void setContentType(int p0) {
        }
        
        public final long getGroupId() {
            return 0L;
        }
        
        public final void setGroupId(long p0) {
        }
        
        public final boolean isFilterActive() {
            return false;
        }
    }
}