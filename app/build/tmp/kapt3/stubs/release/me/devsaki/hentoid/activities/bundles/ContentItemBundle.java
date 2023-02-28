package me.devsaki.hentoid.activities.bundles;

import java.lang.System;

/**
 * Helper class to transfer payload data to [me.devsaki.hentoid.viewholders.ContentItem]
 * through a Bundle
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R/\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R/\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR/\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u0011\u0010 \u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b \u0010!R/\u0010\"\u001a\u0004\u0018\u00010\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b$\u0010\u000f\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR/\u0010%\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010\u000f\u001a\u0004\b&\u0010\u0013\"\u0004\b\'\u0010\u0015R/\u0010)\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010\u000f\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R/\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u0007\u001a\u0004\u0018\u00010-8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b3\u0010\u000f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R/\u00104\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b7\u0010\u000f\u001a\u0004\b5\u0010\u000b\"\u0004\b6\u0010\r\u00a8\u00068"}, d2 = {"Lme/devsaki/hentoid/activities/bundles/ContentItemBundle;", "", "bundle", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "getBundle", "()Landroid/os/Bundle;", "<set-?>", "", "coverUri", "getCoverUri", "()Ljava/lang/String;", "setCoverUri", "(Ljava/lang/String;)V", "coverUri$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "downloadMode", "getDownloadMode", "()Ljava/lang/Integer;", "setDownloadMode", "(Ljava/lang/Integer;)V", "downloadMode$delegate", "", "isBeingDeleted", "()Ljava/lang/Boolean;", "setBeingDeleted", "(Ljava/lang/Boolean;)V", "isBeingDeleted$delegate", "isCompleted", "setCompleted", "isCompleted$delegate", "isEmpty", "()Z", "isFavourite", "setFavourite", "isFavourite$delegate", "rating", "getRating", "setRating", "rating$delegate", "readPagesCount", "getReadPagesCount", "setReadPagesCount", "readPagesCount$delegate", "", "reads", "getReads", "()Ljava/lang/Long;", "setReads", "(Ljava/lang/Long;)V", "reads$delegate", "title", "getTitle", "setTitle", "title$delegate", "app_release"})
public final class ContentItemBundle {
    @org.jetbrains.annotations.NotNull()
    private final android.os.Bundle bundle = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty isBeingDeleted$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty isFavourite$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty rating$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty isCompleted$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty reads$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty readPagesCount$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty coverUri$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty title$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty downloadMode$delegate = null;
    
    public ContentItemBundle() {
        super();
    }
    
    public ContentItemBundle(@org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Bundle getBundle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isBeingDeleted() {
        return null;
    }
    
    public final void setBeingDeleted(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFavourite() {
        return null;
    }
    
    public final void setFavourite(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRating() {
        return null;
    }
    
    public final void setRating(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isCompleted() {
        return null;
    }
    
    public final void setCompleted(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getReads() {
        return null;
    }
    
    public final void setReads(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReadPagesCount() {
        return null;
    }
    
    public final void setReadPagesCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCoverUri() {
        return null;
    }
    
    public final void setCoverUri(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDownloadMode() {
        return null;
    }
    
    public final void setDownloadMode(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean isEmpty() {
        return false;
    }
}