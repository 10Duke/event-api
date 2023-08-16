package com.tenduke.events.api.model.object;

import com.tenduke.events.api.model.data.InvitationAccepted;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event occurring when user has accepted a user invitation.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface UserInvitationAccepted extends
        InvitationAccepted {
}
