package me.devsaki.hentoid.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lme/devsaki/hentoid/util/DuplicateHelper;", "", "()V", "Companion", "DuplicateCandidate", "app_debug"})
public final class DuplicateHelper {
    @org.jetbrains.annotations.NotNull()
    public static final me.devsaki.hentoid.util.DuplicateHelper.Companion Companion = null;
    private static final double[] COVER_THRESHOLDS = {0.8, 0.85, 0.9};
    private static final double[] TEXT_THRESHOLDS = {0.78, 0.8, 0.85};
    private static final double[] TOTAL_THRESHOLDS = {0.8, 0.85, 0.9};
    private static final int COVER_WORK_RESOLUTION = 48;
    private static final java.util.List<java.lang.String> TITLE_CHAPTER_WORDS = null;
    
    public DuplicateHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0011\u001a\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001d\u00a8\u0006 "}, d2 = {"Lme/devsaki/hentoid/util/DuplicateHelper$DuplicateCandidate;", "", "content", "Lme/devsaki/hentoid/database/domains/Content;", "useTitle", "", "useArtist", "useLanguage", "useCover", "forceCoverHash", "", "(Lme/devsaki/hentoid/database/domains/Content;ZZZZJ)V", "artistsCleanup", "", "", "getArtistsCleanup", "()Ljava/util/List;", "countryCodes", "kotlin.jvm.PlatformType", "getCountryCodes", "coverHash", "getCoverHash", "()J", "id", "getId", "size", "getSize", "titleCleanup", "getTitleCleanup", "()Ljava/lang/String;", "titleNoDigits", "getTitleNoDigits", "app_debug"})
    public static final class DuplicateCandidate {
        private final long id = 0L;
        private final long coverHash = 0L;
        private final long size = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String titleCleanup = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String titleNoDigits = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<java.lang.String> artistsCleanup = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<java.lang.String> countryCodes = null;
        
        public DuplicateCandidate(@org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.database.domains.Content content, boolean useTitle, boolean useArtist, boolean useLanguage, boolean useCover, long forceCoverHash) {
            super();
        }
        
        public final long getId() {
            return 0L;
        }
        
        public final long getCoverHash() {
            return 0L;
        }
        
        public final long getSize() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitleCleanup() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitleNoDigits() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getArtistsCleanup() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getCountryCodes() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J(\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J>\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0006J(\u0010#\u001a\u00020\"2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J\u0018\u0010&\u001a\u0004\u0018\u00010\u00112\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u0004\u0018\u00010\u00112\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020\u000fJ\u0010\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u0006J(\u00100\u001a\u0002012\u0006\u0010\'\u001a\u00020(2\u0006\u00102\u001a\u0002032\u0006\u0010)\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002JN\u00104\u001a\u0002012\u0006\u0010\'\u001a\u00020(2\u0006\u00102\u001a\u0002032\u0006\u00105\u001a\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u00020*082\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<08JP\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u00020\"2\u0006\u0010E\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020\nJ(\u0010H\u001a\u0002012\u0006\u0010\'\u001a\u00020(2\u0006\u00102\u001a\u0002032\u0006\u0010)\u001a\u00020*2\u0006\u0010I\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006J"}, d2 = {"Lme/devsaki/hentoid/util/DuplicateHelper$Companion;", "", "()V", "COVER_THRESHOLDS", "", "COVER_WORK_RESOLUTION", "", "TEXT_THRESHOLDS", "TITLE_CHAPTER_WORDS", "", "", "TOTAL_THRESHOLDS", "calcPhash", "", "hashEngine", "Lme/devsaki/hentoid/util/image/ImagePHash;", "bitmap", "Landroid/graphics/Bitmap;", "computeArtistScore", "", "referenceArtistsCleanup", "candidateArtistsCleanup", "computeCoverScore", "referenceHash", "candidateHash", "sensitivity", "computeTitleScore", "textComparator", "Lme/devsaki/hentoid/util/string_similarity/StringSimilarity;", "referenceTitleCleanup", "referenceTitleNoDigits", "candidateTitleCleanup", "candidateTitleNoDigits", "ignoreChapters", "", "containsSameLanguage", "referenceCodes", "candidateCodes", "getCoverBitmapFromContent", "context", "Landroid/content/Context;", "content", "Lme/devsaki/hentoid/database/domains/Content;", "getCoverBitmapFromStream", "stream", "Ljava/io/InputStream;", "getHashEngine", "resolution", "indexContent", "", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "indexCovers", "stopped", "Ljava/util/concurrent/atomic/AtomicBoolean;", "info", "Landroidx/core/util/Consumer;", "progress", "Lcom/annimon/stream/function/BiConsumer;", "error", "", "processContent", "Lme/devsaki/hentoid/database/domains/DuplicateEntry;", "reference", "Lme/devsaki/hentoid/util/DuplicateHelper$DuplicateCandidate;", "candidate", "useTitle", "useCover", "useSameArtist", "useSameLanguage", "sanitizeTitle", "title", "savePhash", "pHash", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final me.devsaki.hentoid.util.image.ImagePHash getHashEngine() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final me.devsaki.hentoid.util.image.ImagePHash getHashEngine(int resolution) {
            return null;
        }
        
        public final void indexCovers(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.database.CollectionDAO dao, @org.jetbrains.annotations.NotNull()
        java.util.concurrent.atomic.AtomicBoolean stopped, @org.jetbrains.annotations.NotNull()
        androidx.core.util.Consumer<me.devsaki.hentoid.database.domains.Content> info, @org.jetbrains.annotations.NotNull()
        com.annimon.stream.function.BiConsumer<java.lang.Integer, java.lang.Integer> progress, @org.jetbrains.annotations.NotNull()
        androidx.core.util.Consumer<java.lang.Throwable> error) {
        }
        
        private final void indexContent(android.content.Context context, me.devsaki.hentoid.database.CollectionDAO dao, me.devsaki.hentoid.database.domains.Content content, me.devsaki.hentoid.util.image.ImagePHash hashEngine) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap getCoverBitmapFromContent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.database.domains.Content content) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap getCoverBitmapFromStream(@org.jetbrains.annotations.NotNull()
        java.io.InputStream stream) {
            return null;
        }
        
        public final long calcPhash(@org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.util.image.ImagePHash hashEngine, @org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap bitmap) {
            return 0L;
        }
        
        private final void savePhash(android.content.Context context, me.devsaki.hentoid.database.CollectionDAO dao, me.devsaki.hentoid.database.domains.Content content, long pHash) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final me.devsaki.hentoid.database.domains.DuplicateEntry processContent(@org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.util.DuplicateHelper.DuplicateCandidate reference, @org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.util.DuplicateHelper.DuplicateCandidate candidate, boolean useTitle, boolean useCover, boolean useSameArtist, boolean useSameLanguage, boolean ignoreChapters, int sensitivity, @org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.util.string_similarity.StringSimilarity textComparator) {
            return null;
        }
        
        private final boolean containsSameLanguage(java.util.List<java.lang.String> referenceCodes, java.util.List<java.lang.String> candidateCodes) {
            return false;
        }
        
        private final float computeCoverScore(long referenceHash, long candidateHash, int sensitivity) {
            return 0.0F;
        }
        
        public final float computeTitleScore(@org.jetbrains.annotations.NotNull()
        me.devsaki.hentoid.util.string_similarity.StringSimilarity textComparator, @org.jetbrains.annotations.NotNull()
        java.lang.String referenceTitleCleanup, @org.jetbrains.annotations.NotNull()
        java.lang.String referenceTitleNoDigits, @org.jetbrains.annotations.NotNull()
        java.lang.String candidateTitleCleanup, @org.jetbrains.annotations.NotNull()
        java.lang.String candidateTitleNoDigits, boolean ignoreChapters, int sensitivity) {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String sanitizeTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            return null;
        }
        
        private final float computeArtistScore(java.util.List<java.lang.String> referenceArtistsCleanup, java.util.List<java.lang.String> candidateArtistsCleanup) {
            return 0.0F;
        }
    }
}