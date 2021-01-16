package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields related to end user.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface UserFields extends UserIdFields {

    /**
     * Gets id of authenticated session established when user authenticates herself.
     * @return The authenticated session id.
     */
    String getAuthenticatedSessionId();
}
