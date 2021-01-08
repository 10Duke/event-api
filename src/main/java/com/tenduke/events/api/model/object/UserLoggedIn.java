package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * User logged in.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface UserLoggedIn extends
        TimeFields,
        RequestFields,
        ErrorInfoFields,
        UserIdFields {

    /**
     * Gets value of flag indicating if user has requested for the system to remember the
     * authentications (user has chosen the "remember me" option).
     *
     * @return {@code true} if user has requested for authentications to be remembered,
     * {@code false} if user has requested for authentications not to be remembered, or {@code null}
     * if user preference unknown / for default behaviour.
     */
    Boolean getRemember();
}
