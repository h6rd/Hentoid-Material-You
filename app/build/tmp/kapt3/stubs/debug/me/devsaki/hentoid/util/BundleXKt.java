package me.devsaki.hentoid.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004\u001a\u001e\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u0018\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u0004\u001a\u0018\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001*\u00020\u0004\u001a\u001e\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b\u001a\u0018\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001*\u00020\u0004\u001a\u001e\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n\u001a\u0018\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001*\u00020\u0004\u001a\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\f\u001a\u0018\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001*\u00020\u0004\u001a\u001e\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000e\u001a\u0018\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001*\u00020\u0004\u001a\u001e\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00120\u0001*\u00020\u0004\u001a\u0018\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001*\u00020\u0004\u001a\u001e\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014\u001a\u0018\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001*\u00020\u0004\u001a\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00180\u0001\"\b\b\u0000\u0010\u0018*\u00020\u0019*\u00020\u0004\u001a\u0018\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0001*\u00020\u0004\u001a\u0018\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0001*\u00020\u0004\u001a\u001e\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d0\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001d\u001a\u0018\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0001*\u00020\u0004\u001a\u0018\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010!0\u0001*\u00020\u0004\u001a\u0018\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010#0\u0001*\u00020\u0004\u001a\u001e\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020#0\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020#\u00a8\u0006$"}, d2 = {"boolean", "Lkotlin/properties/ReadWriteProperty;", "", "", "Landroid/os/Bundle;", "default", "bundle", "byte", "", "char", "", "float", "", "int", "", "intArray", "", "intArrayList", "Ljava/util/ArrayList;", "long", "", "longArray", "", "parcelable", "T", "Landroid/os/Parcelable;", "serializable", "Ljava/io/Serializable;", "short", "", "size", "Landroid/util/Size;", "sizeF", "Landroid/util/SizeF;", "string", "", "app_debug"})
public final class BundleXKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.properties.ReadWriteProperty<java.lang.Object, android.os.Bundle> bundle(@org.jetbrains.annotations.NotNull()
    android.os.Bundle $this$bundle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.String> string(@org.jetbrains.annotations.NotNull()
    android.os.Bundle $this$string, @org.jetbrains.annotations.NotNull()
    java.lang.String p1_772401952) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.properties.ReadWriteProperty<java.lang.Object, android.util.Size> size(@org.jetbrains.annotations.NotNull()
    android.os.Bundle $this$size) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.properties.ReadWriteProperty<java.lang.Object, android.util.SizeF> sizeF(@org.jetbrains.annotations.NotNull()
    android.os.Bundle $this$sizeF) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends android.os.Parcelable>kotlin.properties.ReadWriteProperty<java.lang.Object, T> parcelable(@org.jetbrains.annotations.NotNull()
    android.os.Bundle $this$parcelable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.properties.ReadWriteProperty<java.lang.Object, java.io.Serializable> serializable(@org.jetbrains.annotations.NotNull()
    android.os.Bundle $this$serializable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.properties.ReadWriteProperty<java.lang.Object, int[]> intArray(@org.jetbrains.annotations.NotNull()
    android.os.Bundle $this$intArray) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.properties.ReadWriteProperty<java.lang.Object, long[]> longArray(@org.jetbrains.annotations.NotNull()
    android.os.Bundle $this$longArray) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.properties.ReadWriteProperty<java.lang.Object, java.util.ArrayList<java.lang.Integer>> intArrayList(@org.jetbrains.annotations.NotNull()
    android.os.Bundle $this$intArrayList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.String> string(@org.jetbrains.annotations.NotNull()
    android.os.Bundle $this$string) {
        return null;
    }
}