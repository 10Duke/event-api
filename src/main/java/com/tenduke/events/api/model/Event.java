package com.tenduke.events.api.model;

import java.util.UUID;

/**
 * <p>
 * Data structure containing data of an event stored by 10Duke Event Data service.
 * All events have a common envelope with common metadata fields. The {@code data}
 * field contains the actual event data payload, the other top-level fields
 * are these metadata fields.
 * </p>
 * <p>
 * This object describes the recommended event structure where envelope and data
 * are separated. The envelope fields are specified by 10Duke Event Data as reflected
 * by this object, but using field named {@code data} for the event data payload
 * is just a recommended convention. 10Duke Event Data would allow any fields as
 * siblings of the envelope field, and it would also be possible to have a flat structure
 * where all event data payload fields would be root level fields.
 * </p>
 * @param <D> Type of the {@code data} object carrying the event data payload.
 * @author jarkko
 */
public class Event<D> extends AbstractEventFeedItem {

    private UUID eventId;

    private String eventObjectId;

    private String eventObjectType;

    private String eventSourceId;

    private Long eventReceived;

    private D data;

    /**
     * Initializes a new instance of the Event class.
     */
    public Event() {
        super();
    }

    /**
     * <p>
     * Gets unique id of the event.
     * </p>
     * <p>
     * When sending events to 10Duke Event Data, setting event id is optional.
     * If {@code eventId} is not specified, Event Data will generate an id.
     * Event Data does not enforce uniqueness of the ids. If using ids generated
     * by Event Data, there is a high probability that the generated UUIDs are unique.
     * If client generates ids, it is on the clients responsibility to take care
     * of uniqueness of the ids.
     * </p>
     * @return The event id, or {@code null} if not specified.
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
     * Event Data does not enforce uniqueness of the ids. If using ids generated
     * by Event Data, there is a high probability that the generated UUIDs are unique.
     * If client generates ids, it is on the clients responsibility to take care
     * of uniqueness of the ids.
     * </p>
     * @param eventId The event id, or {@code null} if not specified.
     */
    public void setEventId(final UUID eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * Gets id of an external entity that the event is related to.
     * </p>
     * <p>
     * Full key for identifying an external entity or reference consists of both
     * {@code eventObjectType} and {@code eventObjectId}. When one of them is set,
     * the other one must be set as well.
     * </p>
     * @return The external entity id or a reference id, or {@code null} if there is
     *      no external related entity.
     */
    public String getEventObjectId() {
        return eventObjectId;
    }

    /**
     * <p>
     * Sets id of an external entity that the event is related to.
     * </p>
     * <p>
     * Full key for identifying an external entity or reference consists of both
     * {@code eventObjectType} and {@code eventObjectId}. When one of them is set,
     * the other one must be set as well.
     * </p>
     * @param eventObjectId The external entity id or a reference id, or {@code null} if there is
     *      no external related entity.
     */
    public void setEventObjectId(final String eventObjectId) {
        this.eventObjectId = eventObjectId;
    }

    /**
     * <p>
     * Gets type of an external entity that the event is related to.
     * </p>
     * <p>
     * Full key for identifying an external entity or reference consists of both
     * {@code eventObjectType} and {@code eventObjectId}. When one of them is set,
     * the other one must be set as well.
     * </p>
     * @return The external entity type or reference type, or {@code null} if there
     *      is no external related entity.
     */
    public String getEventObjectType() {
        return eventObjectType;
    }

    /**
     * <p>
     * Sets type of an external entity that the event is related to.
     * </p>
     * <p>
     * Full key for identifying an external entity or reference consists of both
     * {@code eventObjectType} and {@code eventObjectId}. When one of them is set,
     * the other one must be set as well.
     * </p>
     * @param eventObjectType The external entity type or reference type, or {@code null} if there
     *      is no external related entity.
     */
    public void setEventObjectType(final String eventObjectType) {
        this.eventObjectType = eventObjectType;
    }

    /**
     * Gets name or identifier of system producing the event. Client applications sending
     * events to the 10Duke Event Data system must be coordinated so that {@code eventSourceId}
     * values are unique across all clients.
     * @return The event source id.
     */
    public String getEventSourceId() {
        return eventSourceId;
    }

    /**
     * Sets name or identifier of system producing the event. Client applications sending
     * events to the 10Duke Event Data system must be coordinated so that {@code eventSourceId}
     * values are unique across all clients.
     * @param eventSourceId The event source id.
     */
    public void setEventSourceId(final String eventSourceId) {
        this.eventSourceId = eventSourceId;
    }

    /**
     * Gets timestamp when the event has been received by the 10Duke Event Data service.
     * The value is generated by the 10Duke Event Data service when event is received,
     * and must not be set by client that sends events.
     * @return Timestamp value in nanoseconds since the Epoch (1970-01-01T00:00:00Z).
     *      Must be {@code null} when sending events to the 10Duke Event Data service.
     */
    public Long getEventReceived() {
        return eventReceived;
    }

    /**
     * Sets timestamp when the event has been received by the 10Duke Event Data service.
     * The value is generated by the 10Duke Event Data service when event is received,
     * and must not be set by client that sends events.
     * @param eventReceived Timestamp value in nanoseconds since the Epoch (1970-01-01T00:00:00Z).
     *      Must be {@code null} when sending events to the 10Duke Event Data service.
     */
    public void setEventReceived(final Long eventReceived) {
        this.eventReceived = eventReceived;
    }

    /**
     * Gets object representing the event payload. All the other fields of the {@link Event} object
     * are an envelope and common metadata, {@code data} holds the actual event data.
     * @return The event payload object.
     */
    public D getData() {
        return data;
    }

    /**
     * Sets object representing the event payload. All the other fields of the {@link Event} object
     * are an envelope and common metadata, {@code data} holds the actual event data.
     * @param data The event payload object.
     */
    public void setData(final D data) {
        this.data = data;
    }
}
