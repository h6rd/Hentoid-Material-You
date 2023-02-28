package me.devsaki.hentoid.util.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0003:;<BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\u000bH\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u000eH\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0011H\u00c6\u0003Jo\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u000eH\u00d6\u0001J\t\u00109\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0014\u00a8\u0006="}, d2 = {"Lme/devsaki/hentoid/util/download/RequestOrder;", "", "method", "Lme/devsaki/hentoid/util/download/RequestOrder$HttpMethod;", "url", "", "headers", "", "site", "Lme/devsaki/hentoid/enums/Site;", "targetDir", "Landroidx/documentfile/provider/DocumentFile;", "fileName", "pageIndex", "", "backupUrl", "img", "Lme/devsaki/hentoid/database/domains/ImageFile;", "(Lme/devsaki/hentoid/util/download/RequestOrder$HttpMethod;Ljava/lang/String;Ljava/util/Map;Lme/devsaki/hentoid/enums/Site;Landroidx/documentfile/provider/DocumentFile;Ljava/lang/String;ILjava/lang/String;Lme/devsaki/hentoid/database/domains/ImageFile;)V", "getBackupUrl", "()Ljava/lang/String;", "getFileName", "getHeaders", "()Ljava/util/Map;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "getImg", "()Lme/devsaki/hentoid/database/domains/ImageFile;", "killSwitch", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getKillSwitch", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "getMethod", "()Lme/devsaki/hentoid/util/download/RequestOrder$HttpMethod;", "getPageIndex", "()I", "getSite", "()Lme/devsaki/hentoid/enums/Site;", "getTargetDir", "()Landroidx/documentfile/provider/DocumentFile;", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "HttpMethod", "NetworkError", "NetworkErrorType", "app_debug"})
public final class RequestOrder {
    @org.jetbrains.annotations.NotNull()
    private final me.devsaki.hentoid.util.download.RequestOrder.HttpMethod method = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.String> headers = null;
    @org.jetbrains.annotations.NotNull()
    private final me.devsaki.hentoid.enums.Site site = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.documentfile.provider.DocumentFile targetDir = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fileName = null;
    private final int pageIndex = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String backupUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final me.devsaki.hentoid.database.domains.ImageFile img = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.atomic.AtomicBoolean killSwitch = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID id = null;
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.util.download.RequestOrder copy(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.util.download.RequestOrder.HttpMethod method, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> headers, @org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.enums.Site site, @org.jetbrains.annotations.NotNull()
    androidx.documentfile.provider.DocumentFile targetDir, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, int pageIndex, @org.jetbrains.annotations.NotNull()
    java.lang.String backupUrl, @org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.domains.ImageFile img) {
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
    
    public RequestOrder(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.util.download.RequestOrder.HttpMethod method, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> headers, @org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.enums.Site site, @org.jetbrains.annotations.NotNull()
    androidx.documentfile.provider.DocumentFile targetDir, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, int pageIndex, @org.jetbrains.annotations.NotNull()
    java.lang.String backupUrl, @org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.domains.ImageFile img) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.util.download.RequestOrder.HttpMethod component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.util.download.RequestOrder.HttpMethod getMethod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.enums.Site component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.enums.Site getSite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.documentfile.provider.DocumentFile component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.documentfile.provider.DocumentFile getTargetDir() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFileName() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getPageIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBackupUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.database.domains.ImageFile component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.database.domains.ImageFile getImg() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.atomic.AtomicBoolean getKillSwitch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getId() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lme/devsaki/hentoid/util/download/RequestOrder$HttpMethod;", "", "(Ljava/lang/String;I)V", "GET", "POST", "OPTIONS", "app_debug"})
    public static enum HttpMethod {
        /*public static final*/ GET /* = new GET() */,
        /*public static final*/ POST /* = new POST() */,
        /*public static final*/ OPTIONS /* = new OPTIONS() */;
        
        HttpMethod() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lme/devsaki/hentoid/util/download/RequestOrder$NetworkErrorType;", "", "(Ljava/lang/String;I)V", "INTERRUPTED", "NETWORK_ERROR", "PARSE", "FILE_IO", "app_debug"})
    public static enum NetworkErrorType {
        /*public static final*/ INTERRUPTED /* = new INTERRUPTED() */,
        /*public static final*/ NETWORK_ERROR /* = new NETWORK_ERROR() */,
        /*public static final*/ PARSE /* = new PARSE() */,
        /*public static final*/ FILE_IO /* = new FILE_IO() */;
        
        NetworkErrorType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lme/devsaki/hentoid/util/download/RequestOrder$NetworkError;", "", "statusCode", "", "message", "", "type", "Lme/devsaki/hentoid/util/download/RequestOrder$NetworkErrorType;", "(ILjava/lang/String;Lme/devsaki/hentoid/util/download/RequestOrder$NetworkErrorType;)V", "getMessage", "()Ljava/lang/String;", "getStatusCode", "()I", "getType", "()Lme/devsaki/hentoid/util/download/RequestOrder$NetworkErrorType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class NetworkError {
        private final int statusCode = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        @org.jetbrains.annotations.NotNull()
        private final me.devsaki.hentoid.util.download.RequestOrder.NetworkErrorType type = null;
        
        @org.jetbrains.annotations.NotNull()
        public final me.devsaki.hentoid.util.download.RequestOrder.NetworkError copy(int statusCode, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.util.download.RequestOrder.NetworkErrorType type) {
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
        
        public NetworkError(int statusCode, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.util.download.RequestOrder.NetworkErrorType type) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getStatusCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final me.devsaki.hentoid.util.download.RequestOrder.NetworkErrorType component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final me.devsaki.hentoid.util.download.RequestOrder.NetworkErrorType getType() {
            return null;
        }
    }
}