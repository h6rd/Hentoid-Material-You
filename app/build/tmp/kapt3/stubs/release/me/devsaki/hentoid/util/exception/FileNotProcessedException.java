package me.devsaki.hentoid.util.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lme/devsaki/hentoid/util/exception/FileNotProcessedException;", "Lme/devsaki/hentoid/util/exception/ContentNotProcessedException;", "content", "Lme/devsaki/hentoid/database/domains/Content;", "message", "", "cause", "", "(Lme/devsaki/hentoid/database/domains/Content;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Lme/devsaki/hentoid/database/domains/Content;Ljava/lang/String;)V", "app_release"})
public final class FileNotProcessedException extends me.devsaki.hentoid.util.exception.ContentNotProcessedException {
    
    public FileNotProcessedException(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.domains.Content content, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable cause) {
        super(null, null, null);
    }
    
    public FileNotProcessedException(@org.jetbrains.annotations.NotNull()
    me.devsaki.hentoid.database.domains.Content content, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        super(null, null, null);
    }
}