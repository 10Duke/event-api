package com.tenduke.events.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Base class for objects that can used as feed items in event feed data
 * return by 10Duke Event Data service.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractEventFeedItem {

    private String eventType;

    /**
     * Initializes a new instance of the {@link AbstractEventFeedItem} class.
     */
    protected AbstractEventFeedItem() {
        //
    }

    /**
     * Gets the event type.
     * @return The event type.
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the event type.
     * @param eventType The event type.
     */
    public void setEventType(final String eventType) {
        this.eventType = eventType;
    }
}
