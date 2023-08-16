package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event occurring when an invitation has been revoked.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface InvitationRevoked extends
        InvitationFields,
        UserIdFields,
        ErrorInfoFields,
        RequestFields,
        TimeFields {
}
