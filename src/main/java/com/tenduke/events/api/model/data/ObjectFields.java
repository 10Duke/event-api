package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for identifying an object related to the event.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface ObjectFields {

    /**
     * Gets the object id.
     * @return The object id.
     */
    String getObjectId();

    /**
     * Gets the object name. If objects are persisted, this should be name of the table.
     * @return The object name, e.g. table name.
     */
    String getObjectName();
}
