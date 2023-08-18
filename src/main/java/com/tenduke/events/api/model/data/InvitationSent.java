package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event occurring when an invitation has been sent.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface InvitationSent extends
        InvitationFields,
        UserIdFields,
        ErrorInfoFields,
        RequestFields,
        TimeFields {
}
