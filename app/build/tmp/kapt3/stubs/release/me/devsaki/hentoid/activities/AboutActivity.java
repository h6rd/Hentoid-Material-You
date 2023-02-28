package me.devsaki.hentoid.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0014J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lme/devsaki/hentoid/activities/AboutActivity;", "Lme/devsaki/hentoid/activities/BaseActivity;", "()V", "binding", "Lme/devsaki/hentoid/databinding/ActivityAboutBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onUpdateEvent", "event", "Lme/devsaki/hentoid/events/UpdateEvent;", "showFragment", "fragment", "Landroidx/fragment/app/Fragment;", "app_release"})
public final class AboutActivity extends me.devsaki.hentoid.activities.BaseActivity {
    private me.devsaki.hentoid.databinding.ActivityAboutBinding binding;
    
    public AboutActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showFragment(androidx.fragment.app.Fragment fragment) {
    }
    
    @org.greenrobot.eventbus.Subscribe(sticky = true, threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onUpdateEvent(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.events.UpdateEvent event) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}