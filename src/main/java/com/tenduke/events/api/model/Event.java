package com.tenduke.events.api.model;

import java.util.UUID;

/**
 *
 * @author jarkko
 */
public class Event {

    //<editor-fold defaultstate="collapsed" desc="private fields">

    private UUID eventId;

    private String eventType;

    private String eventObjectId;

    private String eventObjectType;

    private String eventSourceId;

    private Long eventReceived;

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="constructors">

    /**
     * Initializes a new instance of the Event class.
     */
    public Event() {
        //
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="methods">

    /**
     * <p>
     * Gets unique id of the event.
     * </p>
     * <p>
     * When sending events to 10Duke Event Data, setting event id is optional.
     * If {@code eventId} is not specified, Event Data will generate an id.
     * </p>
     * @return The event id.
     */
    public UUID getEventId() {
        return eventId;
    }

    /**
     * <p>
     * Sets unique id of the event.
     * </p>
     * <p>
     * When sending events to 10Duke Event Data, setting event id is optional.
     * If {@code eventId} is not specified, Event Data will generate an id.
     * </p>
     * @param eventId The event id.
     */
    public void setEventId(final UUID eventId) {
        this.eventId = eventId;
    }

    /**
     * Gets the event type.
     * @return The event type.
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType the eventType to set
     */
    public void setEventType(final String eventType) {
        this.eventType = eventType;
    }

    /**
     * @return the eventObjectId
     */
    public String getEventObjectId() {
        return eventObjectId;
    }

    /**
     * @param eventObjectId the eventObjectId to set
     */
    public void setEventObjectId(final String eventObjectId) {
        this.eventObjectId = eventObjectId;
    }

    /**
     * @return the eventObjectType
     */
    public String getEventObjectType() {
        return eventObjectType;
    }

    /**
     * @param eventObjectType the eventObjectType to set
     */
    public void setEventObjectType(final String eventObjectType) {
        this.eventObjectType = eventObjectType;
    }

    /**
     * @return the eventSourceId
     */
    public String getEventSourceId() {
        return eventSourceId;
    }

    /**
     * @param eventSourceId the eventSourceId to set
     */
    public void setEventSourceId(final String eventSourceId) {
        this.eventSourceId = eventSourceId;
    }

    /**
     * @return the eventReceived
     */
    public Long getEventReceived() {
        return eventReceived;
    }

    /**
     * @param eventReceived the eventReceived to set
     */
    public void setEventReceived(final Long eventReceived) {
        this.eventReceived = eventReceived;
    }

    //</editor-fold>
}
