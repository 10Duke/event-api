package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for identifying the request related to the event.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface RequestFields {
    /**
     * <p>
     * Gets request id.
     * </p>
     * <p>
     * Id created by the server for the request. This id is typically used for associating
     * event with a request log row.
     * </p>
     * @return The request id.
     */
    String getRequestId();
}
