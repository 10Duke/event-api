package com.tenduke.events.api.model.data;

/**
 * Event data fields for license transaction item.
 * @author janne
 */
public interface LicenseTransactionItemFields extends LicenseTransactionFields {

    /**
     * Get license transaction item external id.
     * @return license transaction item external id.
     */
    String getTransactionItemExternalId();
}
