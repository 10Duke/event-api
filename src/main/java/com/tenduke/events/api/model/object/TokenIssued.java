package com.tenduke.events.api.model.object;

import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * OAuth 2.0 access token issued.
 * @author jarkko
 */
public interface TokenIssued extends
        TimeFields,
        RequestFields,
        ErrorInfoFields,
        UserIdFields {

    /**
     * Gets token lifetime.
     * @return Token lifetime in seconds from {@link #getEventTime()}.
     */
    Long getExpiresIn();

    /**
     * Indicates if a refresh token was issued.
     * @return {@code true} if refresh token was issued.
     */
    boolean isRefreshTokenIssued();

    /**
     * If a refresh token was issued, gets lifetime of the refresh token.
     * @return Refresh token validity end time in seconds from
     *      {@link #getEventTime()}, or {@code null} if valid indefinitely.
     */
    Long getRefreshTokenExpiresIn();

    /**
     * Gets the requested grant type.
     * @return The grant type value, must not be {@code null}.
     */
    String getGrantType();
}
