package me.devsaki.hentoid.fragments.tools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J0\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u001a\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J0\u0010#\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lme/devsaki/hentoid/fragments/tools/MetaExportDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lme/devsaki/hentoid/databinding/DialogToolsMetaExportBinding;", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "exportDisposable", "Lio/reactivex/disposables/Disposable;", "getExportedCollection", "Lme/devsaki/hentoid/json/JsonContentCollection;", "exportLibrary", "", "exportFavsOnly", "exportCustomgroups", "exportQueue", "exportBookmarks", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedState", "Landroid/os/Bundle;", "onDestroyView", "", "onJsonSerialized", "json", "", "onViewCreated", "rootView", "savedInstanceState", "refreshDisplay", "refreshFavsDisplay", "runExport", "exportCustomGroups", "Companion", "app_release"})
public final class MetaExportDialogFragment extends androidx.fragment.app.DialogFragment {
    private me.devsaki.hentoid.databinding.DialogToolsMetaExportBinding binding;
    private me.devsaki.hentoid.database.CollectionDAO dao;
    private io.reactivex.disposables.Disposable exportDisposable;
    @org.jetbrains.annotations.NotNull()
    public static final me.devsaki.hentoid.fragments.tools.MetaExportDialogFragment.Companion Companion = null;
    
    public MetaExportDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View rootView, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void refreshDisplay() {
    }
    
    private final void refreshFavsDisplay() {
    }
    
    private final void runExport(boolean exportLibrary, boolean exportFavsOnly, boolean exportCustomGroups, boolean exportQueue, boolean exportBookmarks) {
    }
    
    private final me.devsaki.hentoid.json.JsonContentCollection getExportedCollection(boolean exportLibrary, boolean exportFavsOnly, boolean exportCustomgroups, boolean exportQueue, boolean exportBookmarks) {
        return null;
    }
    
    private final void onJsonSerialized(java.lang.String json, boolean exportLibrary, boolean exportFavsOnly, boolean exportQueue, boolean exportBookmarks) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lme/devsaki/hentoid/fragments/tools/MetaExportDialogFragment$Companion;", "", "()V", "invoke", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager) {
        }
    }
}