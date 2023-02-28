package me.devsaki.hentoid.util.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lme/devsaki/hentoid/util/exception/NetworkingException;", "Ljava/io/IOException;", "statusCode", "", "message", "", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getStatusCode", "()I", "app_release"})
public final class NetworkingException extends java.io.IOException {
    private final int statusCode = 0;
    
    public NetworkingException(int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable cause) {
        super();
    }
    
    public final int getStatusCode() {
        return 0;
    }
}