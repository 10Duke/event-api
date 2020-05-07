package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields related to HTTP channel, or commonly used when tracking events
 * triggered by HTTP requests.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface HttpRequestFields extends RequestFields {

    /**
     * Gets IP address of the client that sent the request.
     * @return The client IP address.
     */
    String getClientIpAddress();

    /**
     * Gets session id used between the server and the user agent (e.g. web browser)
     * for establishing a session. This session is not related to user authentication.
     * @return The user agent session id.
     */
    String getUserAgentSessionId();

    /**
     * Gets the {@code User-Agent} string describing the user agent (e.g. web browser).
     * @return The {@code User-Agent} as received from the user agent (e.g. web browser).
     */
    String getUserAgent();

    /**
     * Gets the request origin URL.
     * @return The origin URL up to request port (path not included), or {@code null} for same origin
     *      (or if request originator did not include information for some other reason, but omitting
     *      origin will lead to the interpretation that the request is a same origin request).
     */
    String getOrigin();

    /**
     * Gets the request referer URL.
     * @return URL of another resource that was context linking to the requested resource,
     *      or {@code null} if not specified.
     */
    String getReferer();

    /**
     * Gets the request HTTP method.
     * @return The HTTP method.
     */
    String getMethod();

    /**
     * Gets the full request URL.
     * @return The request URL.
     */
    String getUrl();

    /**
     * Gets status code sent back to the client.
     * @return The HTTP response status.
     */
    Integer getStatus();
}
