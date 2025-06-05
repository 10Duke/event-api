package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfo;

/**
 * Basic error info object, implements {@link ErrorInfo}.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicErrorInfo implements ErrorInfo {

    /**
     * URI for error details.
     */
    private String errorUri;

    /**
     * Error description.
     */
    private String errorDescription;

    /**
     * The error code.
     */
    private String error;

    /**
     * Initializes a new instance of the {@link BasicErrorInfo} class.
     */
    public BasicErrorInfo() {
        //
    }

    /**
     * Gets the error code.
     * @return The error code.
     */
    @Override
    public String getError() {
        return error;
    }

    /**
     * Sets the error code.
     * @param error The error code.
     */
    public void setError(final String error) {
        this.error = error;
    }

    /**
     * Gets the error description, may be given optionally.
     * @return The error description, may be {@code null}.
     */
    @Override
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the error description, may be given optionally.
     * @param errorDescription The error description, may be {@code null}.
     */
    public void setErrorDescription(final String errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * Gets URI for error details, may be given optionally.
     * @return The URI for error details, may be {@code null}.
     */
    @Override
    public String getErrorUri() {
        return errorUri;
    }

    /**
     * Gets URI for error details, may be given optionally.
     * @param errorUri The URI for error details, may be {@code null}.
     */
    public void setErrorUri(final String errorUri) {
        this.errorUri = errorUri;
    }
}
