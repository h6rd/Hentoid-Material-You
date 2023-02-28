package me.devsaki.hentoid.fragments.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0002J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0002J\b\u0010\u001c\u001a\u00020\u000bH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u000bH\u0016J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0012H\u0016J\u001a\u0010&\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020(2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010)\u001a\u00020\u000bH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006+"}, d2 = {"Lme/devsaki/hentoid/fragments/preferences/PreferencesFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "viewModel", "Lme/devsaki/hentoid/viewmodels/PreferencesViewModel;", "getViewModel", "()Lme/devsaki/hentoid/viewmodels/PreferencesViewModel;", "setViewModel", "(Lme/devsaki/hentoid/viewmodels/PreferencesViewModel;)V", "onCheckUpdatePrefClick", "", "onClearCookies", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreatePreferences", "rootKey", "", "onDeleteAllExceptFavourites", "onDestroy", "onDoHChanged", "onExternalFolderChanged", "onHentoidFolderChanged", "onNavigateToScreen", "preferenceScreen", "Landroidx/preference/PreferenceScreen;", "onPrefColorThemeChanged", "onPrefRequiringRestartChanged", "onPreferenceTreeClick", "", "preference", "Landroidx/preference/Preference;", "onResume", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "onViewCreated", "view", "Landroid/view/View;", "populateMemoryUsage", "Companion", "app_release"})
public final class PreferencesFragment extends androidx.preference.PreferenceFragmentCompat implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    public me.devsaki.hentoid.viewmodels.PreferencesViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public static final me.devsaki.hentoid.fragments.preferences.PreferencesFragment.Companion Companion = null;
    private static final java.lang.String KEY_ROOT = "root";
    
    public PreferencesFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.viewmodels.PreferencesViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.viewmodels.PreferencesViewModel p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    java.lang.String rootKey) {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @java.lang.Override()
    public boolean onPreferenceTreeClick(@org.jetbrains.annotations.NotNull()
    androidx.preference.Preference preference) {
        return false;
    }
    
    @java.lang.Override()
    public void onNavigateToScreen(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceScreen preferenceScreen) {
    }
    
    private final void onCheckUpdatePrefClick() {
    }
    
    private final void onPrefRequiringRestartChanged() {
    }
    
    private final void onHentoidFolderChanged() {
    }
    
    private final void onExternalFolderChanged() {
    }
    
    private final void onPrefColorThemeChanged() {
    }
    
    private final void onDoHChanged() {
    }
    
    private final void onClearCookies() {
    }
    
    private final void populateMemoryUsage() {
    }
    
    private final void onDeleteAllExceptFavourites() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lme/devsaki/hentoid/fragments/preferences/PreferencesFragment$Companion;", "", "()V", "KEY_ROOT", "", "newInstance", "Lme/devsaki/hentoid/fragments/preferences/PreferencesFragment;", "rootKey", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final me.devsaki.hentoid.fragments.preferences.PreferencesFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.String rootKey) {
            return null;
        }
    }
}