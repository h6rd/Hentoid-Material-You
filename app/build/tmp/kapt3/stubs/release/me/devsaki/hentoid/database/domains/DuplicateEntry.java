package me.devsaki.hentoid.database.domains;

import java.lang.System;

@io.objectbox.annotation.Entity()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\u0006\u00103\u001a\u00020\bJ\u0011\u00104\u001a\u00020\'2\u0006\u00105\u001a\u00020\u0000H\u0096\u0002J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\bH\u00c6\u0003J\t\u0010;\u001a\u00020\bH\u00c6\u0003J\t\u0010<\u001a\u00020\bH\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003JY\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010?\u001a\u00020\u001f2\b\u00105\u001a\u0004\u0018\u00010@H\u00d6\u0003J\t\u0010A\u001a\u00020\'H\u00d6\u0001J\t\u0010B\u001a\u00020CH\u00d6\u0001J\u0006\u0010D\u001a\u00020\u0003R\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u000eR\u000e\u00102\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lme/devsaki/hentoid/database/domains/DuplicateEntry;", "", "referenceId", "", "referenceSize", "duplicateId", "duplicateSize", "titleScore", "", "coverScore", "artistScore", "id", "(JJJJFFFJ)V", "getArtistScore", "()F", "getCoverScore", "duplicateContent", "Lme/devsaki/hentoid/database/domains/Content;", "getDuplicateContent", "()Lme/devsaki/hentoid/database/domains/Content;", "setDuplicateContent", "(Lme/devsaki/hentoid/database/domains/Content;)V", "getDuplicateId", "()J", "setDuplicateId", "(J)V", "getDuplicateSize", "setDuplicateSize", "getId", "setId", "isBeingDeleted", "", "()Z", "setBeingDeleted", "(Z)V", "keep", "getKeep", "setKeep", "nbDuplicates", "", "getNbDuplicates", "()I", "setNbDuplicates", "(I)V", "referenceContent", "getReferenceContent", "setReferenceContent", "getReferenceId", "getReferenceSize", "getTitleScore", "totalScore", "calcTotalScore", "compareTo", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "hashCode", "toString", "", "uniqueHash", "app_release"})
public final class DuplicateEntry implements java.lang.Comparable<me.devsaki.hentoid.database.domains.DuplicateEntry> {
    private final long referenceId = 0L;
    private final long referenceSize = 0L;
    private long duplicateId;
    private long duplicateSize;
    private final float titleScore = 0.0F;
    private final float coverScore = 0.0F;
    private final float artistScore = 0.0F;
    @io.objectbox.annotation.Id()
    private long id;
    @kotlin.jvm.Transient()
    private transient float totalScore = -1.0F;
    @kotlin.jvm.Transient()
    private transient int nbDuplicates = 1;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Transient()
    private transient me.devsaki.hentoid.database.domains.Content referenceContent;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Transient()
    private transient me.devsaki.hentoid.database.domains.Content duplicateContent;
    @kotlin.jvm.Transient()
    private transient boolean keep = true;
    @kotlin.jvm.Transient()
    private transient boolean isBeingDeleted = false;
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.database.domains.DuplicateEntry copy(long referenceId, long referenceSize, long duplicateId, long duplicateSize, float titleScore, float coverScore, float artistScore, long id) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public DuplicateEntry(long referenceId, long referenceSize, long duplicateId, long duplicateSize, float titleScore, float coverScore, float artistScore, long id) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getReferenceId() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getReferenceSize() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getDuplicateId() {
        return 0L;
    }
    
    public final void setDuplicateId(long p0) {
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getDuplicateSize() {
        return 0L;
    }
    
    public final void setDuplicateSize(long p0) {
    }
    
    public final float component5() {
        return 0.0F;
    }
    
    public final float getTitleScore() {
        return 0.0F;
    }
    
    public final float component6() {
        return 0.0F;
    }
    
    public final float getCoverScore() {
        return 0.0F;
    }
    
    public final float component7() {
        return 0.0F;
    }
    
    public final float getArtistScore() {
        return 0.0F;
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final int getNbDuplicates() {
        return 0;
    }
    
    public final void setNbDuplicates(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final me.devsaki.hentoid.database.domains.Content getReferenceContent() {
        return null;
    }
    
    public final void setReferenceContent(@org.jetbrains.annotations.Nullable()
    me.devsaki.hentoid.database.domains.Content p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final me.devsaki.hentoid.database.domains.Content getDuplicateContent() {
        return null;
    }
    
    public final void setDuplicateContent(@org.jetbrains.annotations.Nullable()
    me.devsaki.hentoid.database.domains.Content p0) {
    }
    
    public final boolean getKeep() {
        return false;
    }
    
    public final void setKeep(boolean p0) {
    }
    
    public final boolean isBeingDeleted() {
        return false;
    }
    
    public final void setBeingDeleted(boolean p0) {
    }
    
    public final float calcTotalScore() {
        return 0.0F;
    }
    
    public final long uniqueHash() {
        return 0L;
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.domains.DuplicateEntry other) {
        return 0;
    }
}