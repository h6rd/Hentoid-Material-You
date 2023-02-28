package me.devsaki.hentoid.retrofit.sources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lme/devsaki/hentoid/retrofit/sources/EHentaiServer;", "", "()V", "EHENTAI_URL", "", "EXHENTAI_URL", "ehentaiApi", "Lme/devsaki/hentoid/retrofit/sources/EHentaiServer$Api;", "getEhentaiApi", "()Lme/devsaki/hentoid/retrofit/sources/EHentaiServer$Api;", "setEhentaiApi", "(Lme/devsaki/hentoid/retrofit/sources/EHentaiServer$Api;)V", "exentaiApi", "getExentaiApi", "setExentaiApi", "init", "", "Api", "app_debug"})
public final class EHentaiServer {
    @org.jetbrains.annotations.NotNull()
    public static final me.devsaki.hentoid.retrofit.sources.EHentaiServer INSTANCE = null;
    private static final java.lang.String EHENTAI_URL = "http://e-hentai.org/";
    private static final java.lang.String EXHENTAI_URL = "https://exhentai.org/";
    public static me.devsaki.hentoid.retrofit.sources.EHentaiServer.Api ehentaiApi;
    public static me.devsaki.hentoid.retrofit.sources.EHentaiServer.Api exentaiApi;
    
    private EHentaiServer() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.retrofit.sources.EHentaiServer.Api getEhentaiApi() {
        return null;
    }
    
    public final void setEhentaiApi(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.retrofit.sources.EHentaiServer.Api p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.retrofit.sources.EHentaiServer.Api getExentaiApi() {
        return null;
    }
    
    public final void setExentaiApi(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.retrofit.sources.EHentaiServer.Api p0) {
    }
    
    public final void init() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\'J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000b2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\'\u00a8\u0006\f"}, d2 = {"Lme/devsaki/hentoid/retrofit/sources/EHentaiServer$Api;", "", "getGalleryMetadata", "Lretrofit2/Call;", "Lme/devsaki/hentoid/json/sources/EHentaiGalleriesMetadata;", "query", "Lme/devsaki/hentoid/json/sources/EHentaiGalleryQuery;", "cookies", "", "getImageMetadata", "Lme/devsaki/hentoid/json/sources/EHentaiImageResponse;", "Lme/devsaki/hentoid/json/sources/EHentaiImageQuery;", "app_debug"})
    public static abstract interface Api {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.POST(value = "api.php")
        public abstract retrofit2.Call<me.devsaki.hentoid.json.sources.EHentaiGalleriesMetadata> getGalleryMetadata(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Body()
        me.devsaki.hentoid.json.sources.EHentaiGalleryQuery query, @org.jetbrains.annotations.Nullable()
        @retrofit2.http.Header(value = "cookie")
        java.lang.String cookies);
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.POST(value = "api.php")
        public abstract retrofit2.Call<me.devsaki.hentoid.json.sources.EHentaiImageResponse> getImageMetadata(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Body()
        me.devsaki.hentoid.json.sources.EHentaiImageQuery query, @org.jetbrains.annotations.Nullable()
        @retrofit2.http.Header(value = "cookie")
        java.lang.String cookies);
    }
}