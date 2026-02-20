package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for license operations that contain creation and provision data.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseProvisionFields extends LicenseFields, LicenseCreditAndValidityFields {

    /**
     * Gets name of licensed item the license was provisioned for.
     * @return Name of licensed item the license was provisioned for.
     */
    String getLicensedItemName();

    /**
     * Get license transaction external id.
     * @return license transaction external id.
     */
    String getTransactionExternalId();

    /**
     * Get license transaction type.
     * @return license transaction type.
     */
    String getTransactionType();

    /**
     * Get license transaction item external id.
     * @return license transaction item external id.
     */
    String getTransactionItemExternalId();
}
