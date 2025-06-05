package com.tenduke.events.api.model.object;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test BasicErrorInfo.
 * @author jarkko
 */
class BasicErrorInfoTest {

    /**
     * Test of getError method, of class BasicErrorInfo.
     */
    @Test
    public void testGetError() {
        BasicErrorInfo instance = new BasicErrorInfo();
        String result = instance.getError();
        assertNull(result);
    }

    /**
     * Test of setError method, of class BasicErrorInfo.
     */
    @Test
    public void testSetError() {
        String error = "test_error";
        BasicErrorInfo instance = new BasicErrorInfo();
        instance.setError(error);
        assertEquals(error, instance.getError());
    }

    /**
     * Test of getErrorDescription method, of class BasicErrorInfo.
     */
    @Test
    public void testGetErrorDescription() {
        BasicErrorInfo instance = new BasicErrorInfo();
        String result = instance.getErrorDescription();
        assertNull(result);
    }

    /**
     * Test of setErrorDescription method, of class BasicErrorInfo.
     */
    @Test
    public void testSetErrorDescription() {
        String errorDescription = "Test error description";
        BasicErrorInfo instance = new BasicErrorInfo();
        instance.setErrorDescription(errorDescription);
        assertEquals(errorDescription, instance.getErrorDescription());
    }

    /**
     * Test of getErrorUri method, of class BasicErrorInfo.
     */
    @Test
    public void testGetErrorUri() {
        BasicErrorInfo instance = new BasicErrorInfo();
        String result = instance.getErrorUri();
        assertNull(result);
    }

    /**
     * Test of setErrorUri method, of class BasicErrorInfo.
     */
    @Test
    public void testSetErrorUri() {
        String errorUri = "https://test/error";
        BasicErrorInfo instance = new BasicErrorInfo();
        instance.setErrorUri(errorUri);
        assertEquals(errorUri, instance.getErrorUri());
    }

}
