package me.devsaki.hentoid.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00140\u0016J\u0014\u0010\u0017\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lme/devsaki/hentoid/database/DuplicatesDAO;", "", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "db", "Lme/devsaki/hentoid/database/ObjectBoxDB;", "duplicatesDb", "Lme/devsaki/hentoid/database/DuplicatesDB;", "cleanup", "", "clearEntries", "delete", "entry", "Lme/devsaki/hentoid/database/domains/DuplicateEntry;", "enrichWithContent", "e", "getDbSizeBytes", "", "getEntries", "", "getEntriesLive", "Landroidx/lifecycle/LiveData;", "insertEntries", "insertEntry", "app_debug"})
public final class DuplicatesDAO {
    private final me.devsaki.hentoid.database.DuplicatesDB duplicatesDb = null;
    private final me.devsaki.hentoid.database.ObjectBoxDB db = null;
    
    public DuplicatesDAO(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super();
    }
    
    public final void cleanup() {
    }
    
    public final long getDbSizeBytes() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<me.devsaki.hentoid.database.domains.DuplicateEntry> getEntries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.DuplicateEntry>> getEntriesLive() {
        return null;
    }
    
    private final me.devsaki.hentoid.database.domains.DuplicateEntry enrichWithContent(me.devsaki.hentoid.database.domains.DuplicateEntry e) {
        return null;
    }
    
    public final void clearEntries() {
    }
    
    public final void insertEntry(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.domains.DuplicateEntry entry) {
    }
    
    public final void insertEntries(@org.jetbrains.annotations.NotNull()
    java.util.List<me.devsaki.hentoid.database.domains.DuplicateEntry> entry) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.domains.DuplicateEntry entry) {
    }
}