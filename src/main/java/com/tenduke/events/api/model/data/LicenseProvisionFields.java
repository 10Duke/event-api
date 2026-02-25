package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for license operations that contain creation and provision data.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseProvisionFields extends LicenseFields, LicenseCreditAndValidityFields, LicenseTransactionItemFields {

    /**
     * Gets name of licensed item the license was provisioned for.
     * @return Name of licensed item the license was provisioned for.
     */
    String getLicensedItemName();
}
