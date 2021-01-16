package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields related and included to all licensing events.
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
     * The licensed item identifier.
     * @return the licensed item id.
     */
    String getLicensedItemId();

    /**
     * Unique id of entitlement that the license belongs to.
     * @return the entitlement id.
     */
    String getEntitlementId();

    /**
     * <p>
     * Id of organization owning the license.
     * </p>
     * <p>
     * License owner organization and license owner user are mutually exclusive,
     * only one of them is set.
     * </p>
     * @return the organization id.
     */
    String getLicenseOwnerOrganizationId();

    /**
     * <p>
     * Id of user owning the license.
     * </p>
     * <p>
     * License owner organization and license owner user are mutually exclusive,
     * only one of them is set.
     * </p>
     */
    String getLicenseOwnerUserId();
}
