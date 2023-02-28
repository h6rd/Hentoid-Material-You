package me.devsaki.hentoid.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.annimon.stream.Stream;

import java.util.ArrayList;
import java.util.List;

import me.devsaki.hentoid.database.CollectionDAO;
import me.devsaki.hentoid.database.domains.Content;
import me.devsaki.hentoid.database.domains.Group;
import me.devsaki.hentoid.database.domains.RenamingRule;
import me.devsaki.hentoid.database.domains.SiteBookmark;
import me.devsaki.hentoid.enums.Grouping;

public class JsonContentCollection {

    private List<JsonContent> library = new ArrayList<>();
    private List<JsonContent> queue = new ArrayList<>();
    private List<JsonCustomGrouping> groupings = new ArrayList<>();
    private List<JsonBookmark> bookmarks = new ArrayList<>();
    private List<JsonRenamingRule> renamingRules = new ArrayList<>();


    public JsonContentCollection() {
        // Nothing special do to here
    }

    public List<Content> getLibrary(@Nullable CollectionDAO dao) {
        return Stream.of(library).map(c -> c.toEntity(dao)).toList();
    }

    public List<JsonContent> getJsonLibrary() {
        return library;
    }

    public void setLibrary(@NonNull List<Content> library) {
        this.library = Stream.of(library).map(c -> JsonContent.fromEntity(c, false)).toList();
    }

    public void addToLibrary(@NonNull Content content) {
        library.add(JsonContent.fromEntity(content, false));
    }

    public List<Content> getQueue() {
        return Stream.of(queue).map(c -> c.toEntity(null)).toList();
    }

    public List<JsonContent> getJsonQueue() {
        return queue;
    }

    public void setQueue(@NonNull List<Content> queue) {
        this.queue = Stream.of(queue).map(c -> JsonContent.fromEntity(c, false)).toList();
    }

    public List<Group> getCustomGroups() {
        return Stream.of(groupings).flatMap(gr -> Stream.of(gr.getGroups())).map(g -> g.toEntity(Grouping.CUSTOM)).toList();
    }

    public void setCustomGroups(@NonNull List<Group> customGroups) {
        this.groupings = new ArrayList<>();
        this.groupings.add(JsonCustomGrouping.fromEntity(Grouping.CUSTOM, customGroups)); // Just one for now
    }

    public List<SiteBookmark> getBookmarks() {
        return Stream.of(bookmarks).map(JsonBookmark::toEntity).toList();
    }

    public void setBookmarks(@NonNull List<SiteBookmark> bookmarks) {
        this.bookmarks = Stream.of(bookmarks).map(JsonBookmark::fromEntity).toList();
    }

    public List<RenamingRule> getRenamingRules() {
        return Stream.of(renamingRules).map(JsonRenamingRule::toEntity).toList();
    }

    public void setRenamingRules(List<RenamingRule> data) {
        this.renamingRules = Stream.of(data).map(JsonRenamingRule::fromEntity).toList();
    }

    public boolean isEmpty() {
        return library.isEmpty() && queue.isEmpty() && groupings.isEmpty() && bookmarks.isEmpty() && renamingRules.isEmpty();
    }
}
