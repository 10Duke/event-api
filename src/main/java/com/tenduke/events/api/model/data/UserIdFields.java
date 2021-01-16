package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data user id field.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface UserIdFields {

    /**
     * Indicates if the user is a technical user.
     * @return {@code true} if {@code userId} is known to refer to a technical user.
     */
    Boolean isTechnicalUser();

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
}
