package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields related to end user.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface UserFields extends UserIdFields {

    /**
     * Indicates if the user is a technical user.
     * @return {@code true} if {@code userId} is known to refer to a technical user.
     */
    Boolean isTechnicalUser();

    /**
     * Gets user name used by the end user in the client system.
     * @return The user name.
     */
    String getUserName();

    /**
     * Gets id of authenticated session established when user authenticates herself.
     * @return The authenticated session id.
     */
    String getAuthenticatedSessionId();
}
