package me.devsaki.hentoid.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a\u0012\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n\u001a\u0019\u0010\u000b\u001a\u00020\u0001\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\r*\u00020\u0002H\u0086\b\u00a8\u0006\u000e"}, d2 = {"clearAppCache", "", "Landroid/content/Context;", "clearWebviewCache", "callback", "Landroidx/core/util/Consumer;", "", "isFinishing", "startBrowserActivity", "url", "", "startLocalActivity", "T", "Landroid/app/Activity;", "app_release"})
public final class ContextXKt {
    
    /**
     * Open the given url using the device's app(s) of choice
     *
     * @param url Url to be opened
     */
    public static final void startBrowserActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$startBrowserActivity, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public static final void clearWebviewCache(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$clearWebviewCache, @org.jetbrains.annotations.Nullable()
    androidx.core.util.Consumer<java.lang.Boolean> callback) {
    }
    
    public static final void clearAppCache(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$clearAppCache) {
    }
    
    public static final boolean isFinishing(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isFinishing) {
        return false;
    }
}