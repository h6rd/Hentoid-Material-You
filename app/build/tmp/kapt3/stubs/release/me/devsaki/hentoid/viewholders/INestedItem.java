package me.devsaki.hentoid.viewholders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lme/devsaki/hentoid/viewholders/INestedItem;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/mikepenz/fastadapter/IItem;", "getLevel", "", "app_release"})
public abstract interface INestedItem<VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends com.mikepenz.fastadapter.IItem<VH> {
    
    public abstract int getLevel();
}