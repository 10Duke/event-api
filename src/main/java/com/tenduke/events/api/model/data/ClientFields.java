package com.tenduke.events.api.model.data;

/**
 * Event data fields related to client application (in practice OAuth client)
 * connected to the event sender system (which itself is a client to 10Duke Event Data).
 * @author jarkko
 */
public interface ClientFields {

    /**
     * <p>
     * Gets identifier of a client application that end user has used for sending
     * request to the system that created the event.
     * </p>
     * <p>
     * It is recommended that a permanent id used by the event sender system is used
     * as the value of this field, and not e.g. OAuth {@code client_id}.
     * </p>
     * @return Identifier of the client application in the event sender system.
     */
    String getClientApplicationId();

    /**
     * Gets type of the client application. This field may be used in addition to
     * {@code clientApplicationId} if necessary.
     * @return Type of the client application, as described in the event sender system.
     */
    String getClientApplicationType();
}
