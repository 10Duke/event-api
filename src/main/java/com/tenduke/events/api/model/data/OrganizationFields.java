package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for organization events.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface OrganizationFields {

    /**
     * Gets the organization invitation id.
     * @return the invitation id.
     */
    String getInvitationId();

    /**
     * Gets the organization id.
     * @return organization id.
     */
    String getOrganizationId();
}
