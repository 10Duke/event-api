package com.tenduke.events.api.model;

/**
 * Metadata of the 10Duke Event Data model described by this artifact.
 * @author jarkko
 */
public final class EventApi {

    /**
     * Prevents an instance of the {@link EventApi} class from being created.
     */
    private EventApi() {
        //
    }

    /**
     * Gets version of the API.
     * @return The API version.
     */
    public static final String getApiVersion() {
        return EventApi.class.getPackage().getImplementationVersion();
    }
}
