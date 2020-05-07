package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields related to user on behalf of which user described by
 * {@link UserFields} acts. For example, when user A is acting in the system
 * and impersonating herself as user B, {@link UserFields}
 * describe the actual user (user A) and {@link OnBehalfOfUserFields} describe
 * the impersonated user (user B).
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface OnBehalfOfUserFields {

    /**
     * Gets identifier of the user on behalf of which the actual user acts.
     * @return The on-behalf-of user id.
     */
    String getOnBehalfOfId();

    /**
     * Indicates if the user on behalf of which the actual user acts is a technical user.
     * @return {@code true} if {@code onBehalfOfId} is known to refer to a technical user.
     */
    Boolean isOnBehalfOfTechnical();

    /**
     * Gets user name of the user on behalf of which the actual user acts.
     * @return The on-behalf-of user name.
     */
    String getOnBehalfOfUserName();
}
