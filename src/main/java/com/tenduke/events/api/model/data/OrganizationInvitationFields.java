package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for organization invitations.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface OrganizationInvitationFields extends OrganizationFields, InvitationFields {

}
