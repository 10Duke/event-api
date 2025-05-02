package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for identifying an organization.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface OrganizationRoleFields extends OrganizationFields {

    /**
     * Gets the organization role id.
     * @return The organization role id.
     */
    String getOrganizationRoleId();
}
