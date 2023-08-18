package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event occurring when user has declined an invitation.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface InvitationDeclined extends
        InvitationFields,
        UserIdFields,
        ErrorInfoFields,
        RequestFields,
        TimeFields {
}
