package com.tenduke.events.api.model.data;

/**
 * Event data fields related to end user.
 * @author jarkko
 */
public interface UserFields {

    /**
     * <p>
     * Gets identifier of the user in the client system.
     * </p>
     * <p>
     * This user id should be permanent.
     * </p>
     * @return The client user id.
     */
    String getUserId();

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
