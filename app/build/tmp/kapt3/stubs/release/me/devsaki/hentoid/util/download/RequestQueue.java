package me.devsaki.hentoid.util.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003\u00a2\u0006\u0002\u0010\bJd\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#H\u0002J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004J\u0010\u0010\'\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004H\u0002J\u0018\u0010(\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0002J0\u0010+\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00042\u001e\u0010,\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u00160\u0015H\u0002J\u0006\u0010-\u001a\u00020%J\u0006\u0010.\u001a\u00020%R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lme/devsaki/hentoid/util/download/RequestQueue;", "", "successHandler", "Lcom/annimon/stream/function/BiConsumer;", "Lme/devsaki/hentoid/util/download/RequestOrder;", "Landroid/net/Uri;", "errorHandler", "Lme/devsaki/hentoid/util/download/RequestOrder$NetworkError;", "(Lcom/annimon/stream/function/BiConsumer;Lcom/annimon/stream/function/BiConsumer;)V", "active", "", "getActive", "()Z", "setActive", "(Z)V", "downloadDisposables", "Ljava/util/concurrent/ConcurrentHashMap;", "Lio/reactivex/disposables/Disposable;", "downloadsQueue", "Ljava/util/Queue;", "downloadPic", "Lcom/annimon/stream/Optional;", "Lorg/apache/commons/lang3/tuple/ImmutableTriple;", "", "", "site", "Lme/devsaki/hentoid/enums/Site;", "url", "headers", "", "targetFolder", "Landroidx/documentfile/provider/DocumentFile;", "targetFileNameNoExt", "pageIndex", "killSwitch", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executeRequest", "", "requestOrder", "handleComplete", "handleError", "t", "", "handleSuccess", "resultOpt", "start", "stop", "app_release"})
public final class RequestQueue {
    private final com.annimon.stream.function.BiConsumer<me.devsaki.hentoid.util.download.RequestOrder, android.net.Uri> successHandler = null;
    private final com.annimon.stream.function.BiConsumer<me.devsaki.hentoid.util.download.RequestOrder, me.devsaki.hentoid.util.download.RequestOrder.NetworkError> errorHandler = null;
    private boolean active = false;
    private final java.util.Queue<me.devsaki.hentoid.util.download.RequestOrder> downloadsQueue = null;
    private final java.util.concurrent.ConcurrentHashMap<me.devsaki.hentoid.util.download.RequestOrder, io.reactivex.disposables.Disposable> downloadDisposables = null;
    
    public RequestQueue(@org.jetbrains.annotations.NotNull()
    com.annimon.stream.function.BiConsumer<me.devsaki.hentoid.util.download.RequestOrder, android.net.Uri> successHandler, @org.jetbrains.annotations.NotNull()
    com.annimon.stream.function.BiConsumer<me.devsaki.hentoid.util.download.RequestOrder, me.devsaki.hentoid.util.download.RequestOrder.NetworkError> errorHandler) {
        super();
    }
    
    public final boolean getActive() {
        return false;
    }
    
    public final void setActive(boolean p0) {
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    public final void executeRequest(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.util.download.RequestOrder requestOrder) {
    }
    
    private final void handleComplete(me.devsaki.hentoid.util.download.RequestOrder requestOrder) {
    }
    
    private final void handleSuccess(me.devsaki.hentoid.util.download.RequestOrder requestOrder, com.annimon.stream.Optional<org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Integer, android.net.Uri, java.lang.String>> resultOpt) {
    }
    
    private final void handleError(me.devsaki.hentoid.util.download.RequestOrder requestOrder, java.lang.Throwable t) {
    }
    
    /**
     * Download the picture at the given index to the given folder
     *
     * @param pageIndex    Index of the picture to download
     * @param targetFolder Folder to download to
     * @param killSwitch   Switch to interrupt the download
     * @return Optional triple with
     * - The page index
     * - The Uri of the downloaded file
     * - The Mime-type of the downloaded file
     *
     * The return value is empty if the download fails
     */
    private final com.annimon.stream.Optional<org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Integer, android.net.Uri, java.lang.String>> downloadPic(me.devsaki.hentoid.enums.Site site, java.lang.String url, java.util.Map<java.lang.String, java.lang.String> headers, androidx.documentfile.provider.DocumentFile targetFolder, java.lang.String targetFileNameNoExt, int pageIndex, java.util.concurrent.atomic.AtomicBoolean killSwitch) {
        return null;
    }
}