package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields related to event time.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface TimeFields {

    /**
     * Gets timestamp of when the event has actually happened in the client system.
     * @return The event timestamp in milliseconds since the Epoch (1970-01-01T00:00:00Z).
     */
    Long getEventTime();
}
