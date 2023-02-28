package me.devsaki.hentoid.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lme/devsaki/hentoid/viewmodels/ChangelogViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "errorValueLive", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorValueLive", "()Landroidx/lifecycle/MutableLiveData;", "successValueLive", "", "Lme/devsaki/hentoid/json/GithubRelease;", "getSuccessValueLive", "onCleared", "", "app_release"})
public final class ChangelogViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<me.devsaki.hentoid.json.GithubRelease>> successValueLive = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> errorValueLive = null;
    private final io.reactivex.disposables.Disposable disposable = null;
    
    public ChangelogViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<me.devsaki.hentoid.json.GithubRelease>> getSuccessValueLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getErrorValueLive() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}