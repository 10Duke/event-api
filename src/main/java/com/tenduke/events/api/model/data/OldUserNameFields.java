package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data field for events that need old user name.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface OldUserNameFields {

    /**
     * Gets the old user name or email before the update.
     * @return The user name / email.
     */
    String getOldUserName();
}
