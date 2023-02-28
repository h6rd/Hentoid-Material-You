package me.devsaki.hentoid.util;

import java.lang.System;

/**
 * Utility class for debouncing values to consumer functions
 *
 *
 * This is backed by a Handler that uses the current thread's looper. Behavior is undefined for
 * threads without a looper.
 *
 * @param <T> type of value that will be debounced
 * @see android.os.Looper
 * </T>
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0010R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lme/devsaki/hentoid/util/Debouncer;", "T", "", "context", "Landroid/content/Context;", "delayMs", "", "callback", "Lcom/annimon/stream/function/Consumer;", "(Landroid/content/Context;JLcom/annimon/stream/function/Consumer;)V", "handler", "Landroid/os/Handler;", "clear", "", "submit", "t", "(Ljava/lang/Object;)V", "app_release"})
public final class Debouncer<T extends java.lang.Object> {
    private final long delayMs = 0L;
    private final com.annimon.stream.function.Consumer<T> callback = null;
    private final android.os.Handler handler = null;
    
    public Debouncer(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long delayMs, @org.jetbrains.annotations.NotNull()
    com.annimon.stream.function.Consumer<T> callback) {
        super();
    }
    
    public final void clear() {
    }
    
    public final void submit(T t) {
    }
}