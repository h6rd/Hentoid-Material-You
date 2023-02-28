package me.devsaki.hentoid.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0014J\b\u0010\u0013\u001a\u00020\tH\u0014\u00a8\u0006\u0014"}, d2 = {"Lme/devsaki/hentoid/activities/PrefsActivity;", "Lme/devsaki/hentoid/activities/BaseActivity;", "()V", "isBrowserPrefs", "", "isDownloaderPrefs", "isStoragePrefs", "isViewerPrefs", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onImportEventComplete", "event", "Lme/devsaki/hentoid/events/ProcessEvent;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onStart", "onStop", "app_debug"})
public final class PrefsActivity extends me.devsaki.hentoid.activities.BaseActivity {
    
    public PrefsActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final boolean isViewerPrefs() {
        return false;
    }
    
    private final boolean isBrowserPrefs() {
        return false;
    }
    
    private final boolean isDownloaderPrefs() {
        return false;
    }
    
    private final boolean isStoragePrefs() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onImportEventComplete(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.events.ProcessEvent event) {
    }
}