package me.devsaki.hentoid.viewholders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lme/devsaki/hentoid/viewholders/AttributeItem;", "Lcom/mikepenz/fastadapter/items/AbstractItem;", "Lme/devsaki/hentoid/viewholders/AttributeItem$ViewHolder;", "attribute", "Lme/devsaki/hentoid/database/domains/Attribute;", "showCount", "", "(Lme/devsaki/hentoid/database/domains/Attribute;Z)V", "getAttribute", "()Lme/devsaki/hentoid/database/domains/Attribute;", "layoutRes", "", "getLayoutRes", "()I", "getShowCount", "()Z", "type", "getType", "getViewHolder", "v", "Landroid/view/View;", "Companion", "ViewHolder", "app_release"})
public final class AttributeItem extends com.mikepenz.fastadapter.items.AbstractItem<me.devsaki.hentoid.viewholders.AttributeItem.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final me.devsaki.hentoid.database.domains.Attribute attribute = null;
    private final boolean showCount = false;
    @org.jetbrains.annotations.NotNull()
    public static final me.devsaki.hentoid.viewholders.AttributeItem.Companion Companion = null;
    
    public AttributeItem(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.domains.Attribute attribute, boolean showCount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.devsaki.hentoid.database.domains.Attribute getAttribute() {
        return null;
    }
    
    public final boolean getShowCount() {
        return false;
    }
    
    @java.lang.Override()
    public int getType() {
        return 0;
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public me.devsaki.hentoid.viewholders.AttributeItem.ViewHolder getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lme/devsaki/hentoid/viewholders/AttributeItem$ViewHolder;", "Lcom/mikepenz/fastadapter/FastAdapter$ViewHolder;", "Lme/devsaki/hentoid/viewholders/AttributeItem;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "badge", "Landroid/widget/TextView;", "getBadge", "()Landroid/widget/TextView;", "bindView", "", "item", "payloads", "", "", "unbindView", "app_release"})
    public static final class ViewHolder extends com.mikepenz.fastadapter.FastAdapter.ViewHolder<me.devsaki.hentoid.viewholders.AttributeItem> {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView badge = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getBadge() {
            return null;
        }
        
        @java.lang.Override()
        public void bindView(@org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.viewholders.AttributeItem item, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> payloads) {
        }
        
        @java.lang.Override()
        public void unbindView(@org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.viewholders.AttributeItem item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n\u00a8\u0006\f"}, d2 = {"Lme/devsaki/hentoid/viewholders/AttributeItem$Companion;", "", "()V", "formatAttrBadge", "Landroid/text/SpannableString;", "context", "Landroid/content/Context;", "attribute", "Lme/devsaki/hentoid/database/domains/Attribute;", "showCount", "", "excluded", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.text.SpannableString formatAttrBadge(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.database.domains.Attribute attribute, boolean showCount, boolean excluded) {
            return null;
        }
    }
}