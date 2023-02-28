package me.devsaki.hentoid.util.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\u0006J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lme/devsaki/hentoid/util/network/DownloadSpeedCalculator;", "", "()V", "MAX_SAMPLES_SIZE", "", "avgSpeedBps", "", "samples", "Ljava/util/Queue;", "Lorg/apache/commons/lang3/tuple/ImmutablePair;", "", "addSampleNow", "", "downloadedBytes", "getAvgSpeedKbps", "updateAvgSpeed", "ticksNow", "app_debug"})
public final class DownloadSpeedCalculator {
    @org.jetbrains.annotations.NotNull()
    public static final me.devsaki.hentoid.util.network.DownloadSpeedCalculator INSTANCE = null;
    private static final int MAX_SAMPLES_SIZE = 15;
    private static final java.util.Queue<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Long, java.lang.Long>> samples = null;
    private static float avgSpeedBps = 0.0F;
    
    private DownloadSpeedCalculator() {
        super();
    }
    
    /**
     * Record a sample for the current time
     *
     * @param downloadedBytes Total number of downloaded bytes to sample at the current time
     */
    @kotlin.jvm.Synchronized()
    public final synchronized void addSampleNow(long downloadedBytes) {
    }
    
    /**
     * Update average speed by processing recorded samples
     *
     * @param ticksNow        Timestamp to calculate download speed for
     * @param downloadedBytes Total number of downloaded bytes at the given timestamp
     */
    private final void updateAvgSpeed(long ticksNow, long downloadedBytes) {
    }
    
    /**
     * Get the updated average download speed
     * @return Updated average download speed, in Kbps
     */
    public final float getAvgSpeedKbps() {
        return 0.0F;
    }
}