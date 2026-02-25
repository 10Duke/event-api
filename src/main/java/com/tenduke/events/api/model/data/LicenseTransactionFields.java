package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for license transaction.
 * @author janne
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseTransactionFields {

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
}
