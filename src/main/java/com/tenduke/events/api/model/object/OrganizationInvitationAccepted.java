package com.tenduke.events.api.model.object;

import com.tenduke.events.api.model.data.InvitationAccepted;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.OrganizationInvitationFields;

/**
 * Event occurring when organization invitation has been accepted.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface OrganizationInvitationAccepted extends
        InvitationAccepted,
        OrganizationInvitationFields {
}
