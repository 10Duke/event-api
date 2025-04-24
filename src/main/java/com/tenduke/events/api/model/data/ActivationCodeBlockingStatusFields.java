package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields common for events about activation code blocking status
 * changes (block / unblock).
 * @author jarkko
 * @since 10Duke Enterprise 6.0.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface ActivationCodeBlockingStatusFields extends 
        TimeFields,
        RequestFields,
        ErrorInfoFields {

    /**
     * Gets the affected activation code.
     * @return The activation code.
     */
    String getCode();
}
