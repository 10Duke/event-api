package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for identifying an organization.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface OrganizationFields {

    /**
     * Gets the organization id.
     * @return The organization id.
     */
    String getOrganizationId();
}
