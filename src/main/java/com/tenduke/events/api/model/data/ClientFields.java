package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields related to client application (in practice OAuth client or SAML SP)
 * connected to the event sender system (which itself is a client to 10Duke Event Data).
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface ClientFields {

    /**
     * <p>
     * Gets identifier of a client application related to the event.
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
