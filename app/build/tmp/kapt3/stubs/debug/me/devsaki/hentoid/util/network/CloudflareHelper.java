package me.devsaki.hentoid.util.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lme/devsaki/hentoid/util/network/CloudflareHelper;", "", "()V", "stopped", "Ljava/util/concurrent/atomic/AtomicBoolean;", "webView", "Lme/devsaki/hentoid/util/network/CloudflareHelper$CloudflareWebView;", "clear", "", "tryPassCloudflare", "", "revivedSite", "Lme/devsaki/hentoid/enums/Site;", "oldCookie", "", "CloudflareFailedException", "CloudflareProtectedException", "CloudflareWebView", "CloudflareWebViewClient", "app_debug"})
public final class CloudflareHelper {
    private me.devsaki.hentoid.util.network.CloudflareHelper.CloudflareWebView webView;
    private final java.util.concurrent.atomic.AtomicBoolean stopped = null;
    
    public CloudflareHelper() {
        super();
    }
    
    public final boolean tryPassCloudflare(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.enums.Site revivedSite, @org.jetbrains.annotations.Nullable()
    java.lang.String oldCookie) {
        return false;
    }
    
    public final void clear() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lme/devsaki/hentoid/util/network/CloudflareHelper$CloudflareProtectedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "app_debug"})
    public static final class CloudflareProtectedException extends java.lang.Exception {
        
        public CloudflareProtectedException() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lme/devsaki/hentoid/util/network/CloudflareHelper$CloudflareFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "app_debug"})
    public static final class CloudflareFailedException extends java.lang.Exception {
        
        public CloudflareFailedException() {
            super();
        }
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lme/devsaki/hentoid/util/network/CloudflareHelper$CloudflareWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "client", "Lme/devsaki/hentoid/util/network/CloudflareHelper$CloudflareWebViewClient;", "getClient", "()Lme/devsaki/hentoid/util/network/CloudflareHelper$CloudflareWebViewClient;", "setAgentProperties", "", "useMobileAgent", "", "useHentoidAgent", "useWebviewAgent", "setUserAgent", "agent", "", "app_debug"})
    public static final class CloudflareWebView extends android.webkit.WebView {
        @org.jetbrains.annotations.NotNull()
        private final me.devsaki.hentoid.util.network.CloudflareHelper.CloudflareWebViewClient client = null;
        
        public CloudflareWebView(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final me.devsaki.hentoid.util.network.CloudflareHelper.CloudflareWebViewClient getClient() {
            return null;
        }
        
        public final void setUserAgent(@org.jetbrains.annotations.NotNull()
        java.lang.String agent) {
        }
        
        public final void setAgentProperties(boolean useMobileAgent, boolean useHentoidAgent, boolean useWebviewAgent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\u0004\u00a8\u0006\u0015"}, d2 = {"Lme/devsaki/hentoid/util/network/CloudflareHelper$CloudflareWebViewClient;", "Landroid/webkit/WebViewClient;", "dnsOverHttpsEnabled", "", "(Z)V", "useHentoidAgent", "getUseHentoidAgent", "()Z", "setUseHentoidAgent", "useMobileAgent", "getUseMobileAgent", "setUseMobileAgent", "useWebviewAgent", "getUseWebviewAgent", "setUseWebviewAgent", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "app_debug"})
    public static final class CloudflareWebViewClient extends android.webkit.WebViewClient {
        private final boolean dnsOverHttpsEnabled = false;
        private boolean useMobileAgent = false;
        private boolean useHentoidAgent = false;
        private boolean useWebviewAgent = false;
        
        public CloudflareWebViewClient(boolean dnsOverHttpsEnabled) {
            super();
        }
        
        public final boolean getUseMobileAgent() {
            return false;
        }
        
        public final void setUseMobileAgent(boolean p0) {
        }
        
        public final boolean getUseHentoidAgent() {
            return false;
        }
        
        public final void setUseHentoidAgent(boolean p0) {
        }
        
        public final boolean getUseWebviewAgent() {
            return false;
        }
        
        public final void setUseWebviewAgent(boolean p0) {
        }
        
        /**
         * Note : this method is called by a non-UI thread
         */
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.webkit.WebResourceResponse shouldInterceptRequest(@org.jetbrains.annotations.NotNull()
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
        android.webkit.WebResourceRequest request) {
            return null;
        }
    }
}