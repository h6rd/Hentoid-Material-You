package me.devsaki.hentoid.retrofit.sources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lme/devsaki/hentoid/retrofit/sources/LusciousServer;", "", "()V", "API_URL", "", "api", "Lme/devsaki/hentoid/retrofit/sources/LusciousServer$Api;", "getApi", "()Lme/devsaki/hentoid/retrofit/sources/LusciousServer$Api;", "setApi", "(Lme/devsaki/hentoid/retrofit/sources/LusciousServer$Api;)V", "init", "", "Api", "app_release"})
public final class LusciousServer {
    @org.jetbrains.annotations.NotNull()
    public static final me.devsaki.hentoid.retrofit.sources.LusciousServer INSTANCE = null;
    private static final java.lang.String API_URL = "https://members.luscious.net/";
    public static me.devsaki.hentoid.retrofit.sources.LusciousServer.Api api;
    
    private LusciousServer() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.retrofit.sources.LusciousServer.Api getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.retrofit.sources.LusciousServer.Api p0) {
    }
    
    public final void init() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\'J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\'\u00a8\u0006\n"}, d2 = {"Lme/devsaki/hentoid/retrofit/sources/LusciousServer$Api;", "", "getBookMetadata", "Lretrofit2/Call;", "Lme/devsaki/hentoid/json/sources/LusciousBookMetadata;", "options", "", "", "getGalleryMetadata", "Lme/devsaki/hentoid/json/sources/LusciousGalleryMetadata;", "app_release"})
    public static abstract interface Api {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "graphql/nobatch/")
        public abstract retrofit2.Call<me.devsaki.hentoid.json.sources.LusciousBookMetadata> getBookMetadata(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.QueryMap()
        java.util.Map<java.lang.String, java.lang.String> options);
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "graphql/nobatch/")
        public abstract retrofit2.Call<me.devsaki.hentoid.json.sources.LusciousGalleryMetadata> getGalleryMetadata(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.QueryMap()
        java.util.Map<java.lang.String, java.lang.String> options);
    }
}