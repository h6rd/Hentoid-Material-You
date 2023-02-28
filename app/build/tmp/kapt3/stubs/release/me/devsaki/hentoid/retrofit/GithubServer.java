package me.devsaki.hentoid.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lme/devsaki/hentoid/retrofit/GithubServer;", "", "()V", "api", "Lme/devsaki/hentoid/retrofit/GithubServer$Api;", "getApi", "()Lme/devsaki/hentoid/retrofit/GithubServer$Api;", "setApi", "(Lme/devsaki/hentoid/retrofit/GithubServer$Api;)V", "moshi", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "moshi$delegate", "Lkotlin/Lazy;", "init", "", "Api", "app_release"})
public final class GithubServer {
    @org.jetbrains.annotations.NotNull()
    public static final me.devsaki.hentoid.retrofit.GithubServer INSTANCE = null;
    private static final kotlin.Lazy moshi$delegate = null;
    public static me.devsaki.hentoid.retrofit.GithubServer.Api api;
    
    private GithubServer() {
        super();
    }
    
    private final com.squareup.moshi.Moshi getMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.retrofit.GithubServer.Api getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.retrofit.GithubServer.Api p0) {
    }
    
    public final void init() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lme/devsaki/hentoid/retrofit/GithubServer$Api;", "", "latestRelease", "Lio/reactivex/Single;", "Lme/devsaki/hentoid/json/GithubRelease;", "getLatestRelease", "()Lio/reactivex/Single;", "releases", "", "getReleases", "app_release"})
    public static abstract interface Api {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "releases")
        public abstract io.reactivex.Single<java.util.List<me.devsaki.hentoid.json.GithubRelease>> getReleases();
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "releases/latest")
        public abstract io.reactivex.Single<me.devsaki.hentoid.json.GithubRelease> getLatestRelease();
    }
}