package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields related to a tenant in a multitenant system.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface TenantFields {

    /**
     * Gets id of the tenant.
     * @return The tenant id.
     */
    String getTenantId();
}
