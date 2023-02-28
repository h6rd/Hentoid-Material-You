package me.devsaki.hentoid.activities;

import java.lang.System;

/**
 * Welcome (Intro Slide) Activity
 * Presents required permissions, then calls the proper activity to:
 * Set storage directory and library import
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u001c\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0014J\u001a\u0010\u0010\u001a\u00020\u00062\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012H\u0002J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lme/devsaki/hentoid/activities/IntroActivity;", "Lcom/github/appintro/AppIntro2;", "()V", "autoEndHandler", "Landroid/os/Handler;", "nextStep", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDonePressed", "currentFragment", "Landroidx/fragment/app/Fragment;", "onSlideChanged", "oldFragment", "newFragment", "setSourcePrefs", "sources", "", "Lme/devsaki/hentoid/enums/Site;", "setThemePrefs", "pref", "", "app_release"})
public final class IntroActivity extends com.github.appintro.AppIntro2 {
    private android.os.Handler autoEndHandler;
    
    public IntroActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSlideChanged(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment oldFragment, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment newFragment) {
    }
    
    public final void nextStep() {
    }
    
    public final void setThemePrefs(int pref) {
    }
    
    private final void setSourcePrefs(java.util.List<? extends me.devsaki.hentoid.enums.Site> sources) {
    }
    
    @java.lang.Override()
    protected void onDonePressed(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment currentFragment) {
    }
}