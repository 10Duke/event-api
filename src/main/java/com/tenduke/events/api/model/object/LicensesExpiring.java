package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ExpiringLicenseFields;
import java.util.List;

/**
 * Expiring or expired licenses found.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicensesExpiring {

    /**
     * Gets time after which the licenses are expiring.
     * @return Start of the expiration check window
     *      in milliseconds since 1970-01-01T00:00:00Z (UTC), exclusive.
     */
    Long getExpiringAfter();

    /**
     * Gets time before which the licenses are expiring.
     * @return End of the expiration check window
     *      in milliseconds since 1970-01-01T00:00:00Z (UTC), inclusive.
     */
    Long getExpiringBefore();

    /**
     * Gets the expiration period for which license expiration was checked.
     * The reported licenses are new licenses found in the expiration check
     * window when checking expiration for this period.
     * @return The expiration period in ISO 8601 period format.
     *      The period is negative when checking for expired licenses.
     */
    String getExpirationPeriod();

    /**
     * Licenses expiring in the expiration check window.
     * @return List of {@link ExpiringLicenseFields licenses}.
     */
    List<ExpiringLicenseFields> getLicenses();
}
