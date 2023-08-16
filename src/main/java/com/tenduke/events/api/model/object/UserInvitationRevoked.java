package com.tenduke.events.api.model.object;

import com.tenduke.events.api.model.data.InvitationRevoked;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event occurring when a user invitation has been revoked.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface UserInvitationRevoked extends
        InvitationRevoked {
}
