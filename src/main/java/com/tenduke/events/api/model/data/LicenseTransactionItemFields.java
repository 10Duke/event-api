package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for license transaction item.
 * @author janne
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseTransactionItemFields extends LicenseTransactionFields {

    /**
     * Get license transaction item external id.
     * @return license transaction item external id.
     */
    String getTransactionItemExternalId();
}
