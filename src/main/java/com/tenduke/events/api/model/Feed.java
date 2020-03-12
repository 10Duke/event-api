package com.tenduke.events.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.net.URI;
import java.util.List;

/**
 * Object encapsulating result of event listing operations.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Feed {

    private URI uri;

    private URI updateUrl;

    private int count;

    private List<AbstractEventFeedItem> objects;

    /**
     * Initializes a new instance of the {@link Feed} class.
     */
    public Feed() {
        //
    }

    /**
     * Gets the feed URI.
     * @return The relative feed URI of the returned feed.
     */
    public URI getUri() {
        return uri;
    }

    /**
     * Sets the feed URI.
     * @param uri The relative feed URI of the returned feed.
     */
    public void setUri(final URI uri) {
        this.uri = uri;
    }

    /**
     * Gets URL that can be used for requesting update to the returned feed.
     * @return The feed update URL.
     */
    public URI getUpdateUrl() {
        return updateUrl;
    }

    /**
     * Sets URL that can be used for requesting update to the returned feed.
     * @param updateUrl The feed update URL.
     */
    public void setUpdateUrl(final URI updateUrl) {
        this.updateUrl = updateUrl;
    }

    /**
     * Gets number of event items in {@code objects}. Instruction items are not included
     * in {@code count}, and the total number of items in {@code objects} is {@code count} + 2.
     * @return The event count.
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets number of event items in {@code objects}. Instruction items are not included
     * in {@code count}, and the total number of items in {@code objects} is {@code count} + 2.
     * @param count The event count.
     */
    public void setCount(final int count) {
        this.count = count;
    }

    /**
     * Gets the feed items. The first item is always instruction for accessing older events and
     * the last item is always instruction for accessing newer events. Between there instructions
     * are events in the requested feed range, if any.
     * @return List of {@link AbstractEventFeedItem} with at least two items
     *      (the instruction items described above).
     */
    public List<AbstractEventFeedItem> getObjects() {
        return objects;
    }

    /**
     * Sets the feed items. The first item is always instruction for accessing older events and
     * the last item is always instruction for accessing newer events. Between there instructions
     * are events in the requested feed range, if any.
     * @param objects List of {@link AbstractEventFeedItem} with at least two items
     *      (the instruction items described above).
     */
    public void setObjects(final List<AbstractEventFeedItem> objects) {
        this.objects = objects;
    }
}
