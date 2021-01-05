package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields related to all licensing events.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseFields {

    /**
     * The license identifier.
     * @return the license id.
     */
    String getLicenseId();

    /**
     * Unique id of entitlement that the license belongs to.
     * @return the entitlement id.
     */
    String getEntitlementId();
}
