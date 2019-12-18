package com.tenduke.events.api.model.data;

/**
 * Event data fields related to a tenant in a multitenant system.
 * @author jarkko
 */
public interface TenantFields {

    /**
     * Gets id of the tenant.
     * @return The tenant id.
     */
    String getTenantId();
}
