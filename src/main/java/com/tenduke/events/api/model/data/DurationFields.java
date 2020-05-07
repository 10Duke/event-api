package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields related to duration of the operation related to the event.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface DurationFields {

    /**
     * Gets duration of the operation related to the event.
     * @return Duration in milliseconds.
     */
    Long getDuration();
}
