package com.tenduke.events.api.model.data;

import com.tenduke.events.api.model.data.HttpRequestFields;

/**
 * Event with HTTP request data.
 * @author jarkko
 */
public interface HttpRequestEvent extends ErrorInfoEvent, HttpRequestFields {

    /**
     * Sets the HTTP response status code.
     * @param status The response status code.
     */
    void setStatus(Integer status);
}
