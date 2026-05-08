package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for license operations that contain information on license credits merged back.
 * @author janne
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseCreditsSplitOrMergedFields extends LicenseFields, LicenseCreditAndValidityFields {

    /**
     * Gets name of licensed item the license credits were split for,
     * @return Name of licensed item the license credits were split for.
     */
    String getLicensedItemName();

    /**
     * Gets id of source license i.e. the license where credits credits were split from / merged back to.
     * @return id of source license.
     */
    String getSourceLicenseId();
}
