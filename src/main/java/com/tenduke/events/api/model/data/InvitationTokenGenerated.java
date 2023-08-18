package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event occurring when an invitation token has been generated.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface InvitationTokenGenerated extends
        InvitationFields,
        UserIdFields,
        ErrorInfoFields,
        RequestFields,
        TimeFields {
}
