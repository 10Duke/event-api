package com.tenduke.events.api.model.object;

import com.tenduke.events.api.model.data.InvitationSent;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event occurring when a user invitation has been sent.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface UserInvitationSent extends
        InvitationSent {
}
