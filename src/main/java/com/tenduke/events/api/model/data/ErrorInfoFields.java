package com.tenduke.events.api.model.data;

/**
 * Event data fields describing an error.
 * @author jarkko
 */
public interface ErrorInfoFields {

    /**
     * Gets object containing error info.
     * @return The {@link ErrorInfo}.
     */
    ErrorInfo getErrorInfo();
}
