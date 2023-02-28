package me.devsaki.hentoid.notification.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lme/devsaki/hentoid/notification/download/DownloadProgressNotification;", "Lme/devsaki/hentoid/util/notification/Notification;", "title", "", "progress", "", "max", "sizeDownloadedMB", "estimateBookSizeMB", "avgSpeedKbps", "(Ljava/lang/String;IIIII)V", "progressString", "getDefaultIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "getPauseIntent", "onCreateNotification", "Landroid/app/Notification;", "app_release"})
public final class DownloadProgressNotification implements me.devsaki.hentoid.util.notification.Notification {
    private final java.lang.String title = null;
    private final int progress = 0;
    private final int max = 0;
    private final int sizeDownloadedMB = 0;
    private final int estimateBookSizeMB = 0;
    private final int avgSpeedKbps = 0;
    private final java.lang.String progressString = null;
    
    public DownloadProgressNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String title, int progress, int max, int sizeDownloadedMB, int estimateBookSizeMB, int avgSpeedKbps) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Notification onCreateNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final android.app.PendingIntent getDefaultIntent(android.content.Context context) {
        return null;
    }
    
    private final android.app.PendingIntent getPauseIntent(android.content.Context context) {
        return null;
    }
}