package com.tenduke.events.api.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 * Metadata of the 10Duke Event Data model described by this artifact.
 * @author jarkko
 */
public final class EventApi {

    /**
     * Name of resource containing events-api properties.
     */
    private static final String EVENTS_API_PROPERTIES_RESOURCE = "META-INF/10duke/events-api.properties";

    /**
     * Version of the event-api artifact.
     */
    private static String version;

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
        if (version != null) {
            return version;
        }

        // Earlier version was read from Manifest.mf using EventApi.class.getPackage().getImplementationVersion().
        // That didn't work correctly, classloader seemed to mess up between different webapps.
        try (final InputStream resourceStream = EventApi.class.getClassLoader()
                .getResourceAsStream(EVENTS_API_PROPERTIES_RESOURCE)) {
            try (final InputStreamReader reader = new InputStreamReader(resourceStream, StandardCharsets.UTF_8)) {
                final Properties props = new Properties();
                props.load(reader);
                final String versionProperty = props.getProperty("version");
                version = versionProperty;
                return versionProperty;
            }
        } catch (IOException ex) {
            throw new IllegalStateException("Reading events-api version from embedded resource failed", ex);
        }
    }

}
