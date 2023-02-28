package me.devsaki.hentoid.retrofit.sources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lme/devsaki/hentoid/retrofit/sources/PixivServer;", "", "()V", "API_URL", "", "api", "Lme/devsaki/hentoid/retrofit/sources/PixivServer$Api;", "getApi", "()Lme/devsaki/hentoid/retrofit/sources/PixivServer$Api;", "setApi", "(Lme/devsaki/hentoid/retrofit/sources/PixivServer$Api;)V", "init", "", "Api", "app_debug"})
public final class PixivServer {
    @org.jetbrains.annotations.NotNull()
    public static final me.devsaki.hentoid.retrofit.sources.PixivServer INSTANCE = null;
    private static final java.lang.String API_URL = "https://www.pixiv.net/";
    public static me.devsaki.hentoid.retrofit.sources.PixivServer.Api api;
    
    private PixivServer() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.retrofit.sources.PixivServer.Api getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.retrofit.sources.PixivServer.Api p0) {
    }
    
    public final void init() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\u0015"}, d2 = {"Lme/devsaki/hentoid/retrofit/sources/PixivServer$Api;", "", "getIllustMetadata", "Lretrofit2/Call;", "Lme/devsaki/hentoid/json/sources/PixivIllustMetadata;", "id", "", "cookies", "getIllustPages", "Lme/devsaki/hentoid/json/sources/PixivIllustPagesMetadata;", "getSeriesIllusts", "Lme/devsaki/hentoid/json/sources/PixivSeriesIllustMetadata;", "limit", "", "lastorder", "getSeriesMetadata", "Lme/devsaki/hentoid/json/sources/PixivSeriesMetadata;", "getUserIllusts", "Lme/devsaki/hentoid/json/sources/PixivUserIllustMetadata;", "getUserMetadata", "Lme/devsaki/hentoid/json/sources/PixivUserMetadata;", "app_debug"})
    public static abstract interface Api {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "touch/ajax/illust/details")
        public abstract retrofit2.Call<me.devsaki.hentoid.json.sources.PixivIllustMetadata> getIllustMetadata(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "illust_id")
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Header(value = "cookie")
        java.lang.String cookies);
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "ajax/illust/{id}/pages")
        public abstract retrofit2.Call<me.devsaki.hentoid.json.sources.PixivIllustPagesMetadata> getIllustPages(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "id")
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Header(value = "cookie")
        java.lang.String cookies);
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "touch/ajax/illust/series/{id}")
        public abstract retrofit2.Call<me.devsaki.hentoid.json.sources.PixivSeriesMetadata> getSeriesMetadata(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "id")
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Header(value = "cookie")
        java.lang.String cookies);
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "touch/ajax/illust/series_content/{id}")
        public abstract retrofit2.Call<me.devsaki.hentoid.json.sources.PixivSeriesIllustMetadata> getSeriesIllusts(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "id")
        java.lang.String id, @retrofit2.http.Query(value = "limit")
        int limit, @retrofit2.http.Query(value = "last_order")
        int lastorder, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Header(value = "cookie")
        java.lang.String cookies);
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "touch/ajax/illust/user_illusts")
        public abstract retrofit2.Call<me.devsaki.hentoid.json.sources.PixivUserIllustMetadata> getUserIllusts(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "user_id")
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Header(value = "cookie")
        java.lang.String cookies);
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "touch/ajax/user/details")
        public abstract retrofit2.Call<me.devsaki.hentoid.json.sources.PixivUserMetadata> getUserMetadata(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "id")
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Header(value = "cookie")
        java.lang.String cookies);
    }
}