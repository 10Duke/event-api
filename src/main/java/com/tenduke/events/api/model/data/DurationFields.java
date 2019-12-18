package com.tenduke.events.api.model.data;

/**
 * Event data fields related to duration of the operation related to the event.
 * @author jarkko
 */
public interface DurationFields {

    /**
     * Gets duration of the operation related to the event.
     * @return Duration in milliseconds.
     */
    Long getDuration();
}
