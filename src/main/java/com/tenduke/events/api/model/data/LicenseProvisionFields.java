package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;

/**
 * Event data fields for license operations that contain creation and provision data.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseProvisionFields extends LicenseFields {

    /**
     * Gets number of license seats.
     * @return Number of license seats licensed by this object, <code>null</code> for unlimited number of seats.
     */
    Integer getSeatCount();

    /**
     * Gets maximum aggregate use time of licenses that users may consume together.
     * @return maximum aggregate use time of licenses that users may consume together.
     */
    Long getUseTime();

    /**
     * Gets the maximum number of times a license can be used.
     * @return The maximum use count.
     */
    Long getUseCount();

    /**
     * Gets the number of seat reservations granted.
     * @return The number of seat reservations granted.
     */
    Long getSeatReservations();

    /**
     * Gets the license validity start date.
     * @return License validity start date. If <code>null</code>, the license is not considered valid.
     */
    Date getValidFrom();

    /**
     * Gets the license validity end date.
     * @return License end date. If <code>null</code>, the license is considered perpetual (no fixed end date).
     */
    Date getValidUntil();

    /**
     * Gets name of licensed item the license was provisioned for.
     * @return Name of licensed item the license was provisioned for.
     */
    String getLicensedItemName();
}
