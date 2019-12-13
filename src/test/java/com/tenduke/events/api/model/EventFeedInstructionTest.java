package com.tenduke.events.api.model;

import java.net.URI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test of EventFeedInstruction class.
 * @author jarkko
 */
public class EventFeedInstructionTest {

    /**
     * Test of getUrl method, of class EventFeedInstruction.
     */
    @Test
    @DisplayName("Typical URL value is valid")
    public void testGetUrl() {
        EventFeedInstruction instance = new EventFeedInstruction();
        String uri = "my-feed?after=1575031959729007422";
        instance.setUrl(URI.create(uri));
        assertEquals(uri, instance.getUrl().toString(), "Must return the same string representation that was used as input");
    }
}
