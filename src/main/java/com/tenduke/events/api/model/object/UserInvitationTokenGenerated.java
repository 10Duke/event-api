package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.InvitationTokenGenerated;

/**
 * Event occurring when a user invitation token has been generated.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface UserInvitationTokenGenerated extends
        InvitationTokenGenerated {
}
