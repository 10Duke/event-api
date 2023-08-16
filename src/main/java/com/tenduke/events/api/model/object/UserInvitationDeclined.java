package com.tenduke.events.api.model.object;

import com.tenduke.events.api.model.data.InvitationDeclined;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event occurring when user has declined a user invitation.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface UserInvitationDeclined extends
        InvitationDeclined {
}
