package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for invitations.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface InvitationFields {

    /**
     * Gets the invitation id.
     * @return the invitation id.
     */
    String getInvitationId();
}
