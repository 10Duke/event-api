package com.tenduke.events.api.model.data;

/**
 * Interface for error information object.
 * @author jarkko
 */
public interface ErrorInfo {

    /**
     * Gets the error code.
     * @return The error code.
     */
    String getError();

    /**
     * Gets the error description, may be given optionally.
     * @return The error description, may be {@code null}.
     */
    String getErrorDescription();

    /**
     * Gets URI for error details, may be given optionally.
     * @return The URI for error details, may be {@code null}.
     */
    String getErrorUri();
}
