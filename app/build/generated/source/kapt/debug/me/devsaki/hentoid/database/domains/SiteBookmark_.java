
package me.devsaki.hentoid.database.domains;

import io.objectbox.EntityInfo;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;
import io.objectbox.internal.IdGetter;
import me.devsaki.hentoid.database.domains.SiteBookmarkCursor.Factory;
import me.devsaki.hentoid.enums.Site;
import me.devsaki.hentoid.enums.Site.SiteConverter;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * Properties for entity "SiteBookmark". Can be used for QueryBuilder and for referencing DB names.
 */
public final class SiteBookmark_ implements EntityInfo<SiteBookmark> {

    // Leading underscores for static constants to avoid naming conflicts with property names

    public static final String __ENTITY_NAME = "SiteBookmark";

    public static final int __ENTITY_ID = 12;

    public static final Class<SiteBookmark> __ENTITY_CLASS = SiteBookmark.class;

    public static final String __DB_NAME = "SiteBookmark";

    public static final CursorFactory<SiteBookmark> __CURSOR_FACTORY = new Factory();

    @Internal
    static final SiteBookmarkIdGetter __ID_GETTER = new SiteBookmarkIdGetter();

    public final static SiteBookmark_ __INSTANCE = new SiteBookmark_();

    public final static io.objectbox.Property<SiteBookmark> id =
        new io.objectbox.Property<>(__INSTANCE, 0, 1, long.class, "id", true, "id");

    public final static io.objectbox.Property<SiteBookmark> site =
        new io.objectbox.Property<>(__INSTANCE, 1, 2, long.class, "site", false, "site", SiteConverter.class, Site.class);

    public final static io.objectbox.Property<SiteBookmark> title =
        new io.objectbox.Property<>(__INSTANCE, 2, 5, String.class, "title");

    public final static io.objectbox.Property<SiteBookmark> url =
        new io.objectbox.Property<>(__INSTANCE, 3, 3, String.class, "url");

    public final static io.objectbox.Property<SiteBookmark> order =
        new io.objectbox.Property<>(__INSTANCE, 4, 4, int.class, "order");

    public final static io.objectbox.Property<SiteBookmark> isHomepage =
        new io.objectbox.Property<>(__INSTANCE, 5, 6, boolean.class, "isHomepage");

    @SuppressWarnings("unchecked")
    public final static io.objectbox.Property<SiteBookmark>[] __ALL_PROPERTIES = new io.objectbox.Property[]{
        id,
        site,
        title,
        url,
        order,
        isHomepage
    };

    public final static io.objectbox.Property<SiteBookmark> __ID_PROPERTY = id;

    @Override
    public String getEntityName() {
        return __ENTITY_NAME;
    }

    @Override
    public int getEntityId() {
        return __ENTITY_ID;
    }

    @Override
    public Class<SiteBookmark> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override
    public String getDbName() {
        return __DB_NAME;
    }

    @Override
    public io.objectbox.Property<SiteBookmark>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override
    public io.objectbox.Property<SiteBookmark> getIdProperty() {
        return __ID_PROPERTY;
    }

    @Override
    public IdGetter<SiteBookmark> getIdGetter() {
        return __ID_GETTER;
    }

    @Override
    public CursorFactory<SiteBookmark> getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Internal
    static final class SiteBookmarkIdGetter implements IdGetter<SiteBookmark> {
        @Override
        public long getId(SiteBookmark object) {
            return object.id;
        }
    }

}
