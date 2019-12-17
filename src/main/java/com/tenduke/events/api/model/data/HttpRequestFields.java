package com.tenduke.events.api.model.data;

/**
 * Event data fields related to HTTP channel, or commonly used when tracking events
 * triggered by HTTP requests.
 * @author jarkko
 */
public interface HttpRequestFields {

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
     * <p>
     * Gets request id.
     * </p>
     * <p>
     * Id created by the server for the HTTP request. This id is typically used for associating
     * event with a request log row.
     * </p>
     * @return The request id.
     */
    String getRequestId();
}
