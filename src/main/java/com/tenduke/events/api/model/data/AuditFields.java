package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for tracking access to a resource.
 * @param <R> Type of the tracked resource.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface AuditFields<R> {
    /**
     * Gets new state of the object. This may contain either the full resource in its
     * new state, or just the modified fields.
     * @return The full object in its new state, or an object with only modified fields populated.
     */
    R getModifiedFields();
}
