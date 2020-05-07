package com.tenduke.events.api.model;

import java.net.URL;
import java.net.URLClassLoader;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test of EventApi class.
 * @author jarkko
 */
public class EventApiIT {

    @BeforeAll
    public static void init() throws Exception {
        String eventApiJarPath = "./target/events-api-" + getProjectBuildVersion() + ".jar";
        URL[] urls = { new URL("jar:file:" + eventApiJarPath + "!/") };
        URLClassLoader cl = URLClassLoader.newInstance(urls);
        cl.loadClass("META-INF/MANIFEST.MF");
    }

    /**
     * Test of getApiVersion method, of class EventApi.
     */
    @Test
    @DisplayName("Returns API version")
    public void testGetApiVersion() {
        String result = EventApi.getApiVersion();
        assertEquals(getProjectBuildVersion(), result, "API version must be the same as project version");
    }
    /**
     * Gets the current Maven artifact version, passed to the test using {@code projectBuildVersion} JVM property.
     * @return The version specifier.
     */
    private static String getProjectBuildVersion() {
        return System.getProperty("projectBuildVersion");
    }
}
