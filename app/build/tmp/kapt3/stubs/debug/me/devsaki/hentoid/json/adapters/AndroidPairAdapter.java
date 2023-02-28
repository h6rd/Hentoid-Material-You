package me.devsaki.hentoid.json.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lme/devsaki/hentoid/json/adapters/AndroidPairAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Landroidx/core/util/Pair;", "", "firstAdapter", "secondAdapter", "listAdapter", "", "", "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "app_debug"})
public final class AndroidPairAdapter extends com.squareup.moshi.JsonAdapter<androidx.core.util.Pair<java.lang.Object, java.lang.Object>> {
    private final com.squareup.moshi.JsonAdapter<java.lang.Object> firstAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.lang.Object> secondAdapter = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> listAdapter = null;
    
    public AndroidPairAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonAdapter<java.lang.Object> firstAdapter, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonAdapter<java.lang.Object> secondAdapter, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> listAdapter) {
        super();
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    androidx.core.util.Pair<java.lang.Object, java.lang.Object> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.core.util.Pair<java.lang.Object, java.lang.Object> fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
}