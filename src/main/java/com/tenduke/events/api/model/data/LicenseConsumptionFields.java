package com.tenduke.events.api.model.data;

/**
 * Event data fields for license operations that contain consumption data.
 * @author roope
 */
public interface LicenseConsumptionFields extends LicenseLeaseFields {

    /**
     * Gets consumption id.
     * @return consumption id.
     */
    String getConsumptionId();

    /**
     * Gets license consumption mode that indicates how the license consumer consumes the assigned license.
     * @return Consumption mode
     */
    String getConsumptionMode();

    /**
     * Feature version consumed by this consumption.
     * @return version consumed.
     */
    String getConsumedVersion();

    /**
     * Gets the licensed item name.
     * @return the licensed item name.
     */
    String getLicensedItemName();
}
