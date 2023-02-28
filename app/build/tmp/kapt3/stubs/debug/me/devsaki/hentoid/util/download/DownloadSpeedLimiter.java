package me.devsaki.hentoid.util.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lme/devsaki/hentoid/util/download/DownloadSpeedLimiter;", "", "()V", "bucket", "Lorg/isomorphism/util/TokenBucket;", "getBucket", "()Lorg/isomorphism/util/TokenBucket;", "setBucket", "(Lorg/isomorphism/util/TokenBucket;)V", "prefsSpeedCapToKbps", "", "value", "setSpeedLimitKbps", "", "take", "", "bytes", "", "app_debug"})
public final class DownloadSpeedLimiter {
    @org.jetbrains.annotations.NotNull()
    public static final me.devsaki.hentoid.util.download.DownloadSpeedLimiter INSTANCE = null;
    @org.jetbrains.annotations.Nullable()
    private static org.isomorphism.util.TokenBucket bucket;
    
    private DownloadSpeedLimiter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.isomorphism.util.TokenBucket getBucket() {
        return null;
    }
    
    public final void setBucket(@org.jetbrains.annotations.Nullable()
    org.isomorphism.util.TokenBucket p0) {
    }
    
    public final void setSpeedLimitKbps(int value) {
    }
    
    public final boolean take(long bytes) {
        return false;
    }
    
    public final int prefsSpeedCapToKbps(int value) {
        return 0;
    }
}