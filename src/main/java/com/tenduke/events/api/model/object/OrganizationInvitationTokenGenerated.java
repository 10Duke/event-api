package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.InvitationTokenGenerated;
import com.tenduke.events.api.model.data.OrganizationInvitationFields;

/**
 * Event occurring when organization invitation token has been generated.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface OrganizationInvitationTokenGenerated extends
        InvitationTokenGenerated,
        OrganizationInvitationFields {
}
