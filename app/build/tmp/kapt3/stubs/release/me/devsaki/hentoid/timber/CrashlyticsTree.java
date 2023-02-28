package me.devsaki.hentoid.timber;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J,\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014\u00a8\u0006\u000e"}, d2 = {"Lme/devsaki/hentoid/timber/CrashlyticsTree;", "Ltimber/log/Timber$Tree;", "()V", "isLoggable", "", "tag", "", "priority", "", "log", "", "message", "t", "", "app_release"})
public final class CrashlyticsTree extends timber.log.Timber.Tree {
    
    public CrashlyticsTree() {
        super();
    }
    
    @java.lang.Override()
    protected boolean isLoggable(@org.jetbrains.annotations.Nullable()
    java.lang.String tag, int priority) {
        return false;
    }
    
    @java.lang.Override()
    protected void log(int priority, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
}