package com.tenduke.events.api.model.data;

/**
 * License fields for describing an expiring or expired license.
 * @author jarkko
 */
public interface ExpiringLicenseFields extends LicenseFields {

    /**
     * Gets license validity end time.
     * @return The license validity end time in milliseconds since 1970-01-01T00:00:00Z (UTC).
     */
    Long getValidUntil();
}
