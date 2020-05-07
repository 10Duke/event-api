package com.tenduke.events.api.model.data;

/**
 * Event data fields for resource validity.
 * @author jarkko
 */
public interface ValidityFields {

    /**
     * Gets resource validity start.
     * @return Validity start in milliseconds since the Epoch (1970-01-01T00:00:00Z),
     *      or {@code null} if validity not started (yet).
     */
    Long getValidFrom();

    /**
     * Gets resource expiration.
     * @return Expiration in milliseconds since the Epoch (1970-01-01T00:00:00Z),
     *      or {@code null} if valid indefinitely.
     */
    Long getValidUntil();
}
