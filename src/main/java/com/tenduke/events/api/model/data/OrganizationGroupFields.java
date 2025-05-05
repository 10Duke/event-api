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
     * <p>
     * Gets the organization group type.
     * </p>
     * <p>
     * This field gets only populated if group type information exists in the context
     * where event is triggered. In most cases this is left unpopulated.
     * </p>
     * @return The organization group type.
     */
    String getOrganizationGroupType();
}
