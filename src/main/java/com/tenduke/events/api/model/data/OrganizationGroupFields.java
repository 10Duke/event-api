package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for identifying an organization group.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface OrganizationGroupFields extends OrganizationFields {

    /**
     * Gets the organization group id.
     * @return The organization group id.
     */
    String getOrganizationGroupId();

    /**
     * Gets the organization group type.
     * @return The organization group type.
     */
    String getOrganizationGroupType();
}
