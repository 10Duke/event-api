package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields describing an error.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface ErrorInfoFields {

    /**
     * Gets object containing error info.
     * @return The {@link ErrorInfo}.
     */
    ErrorInfo getErrorInfo();
}
