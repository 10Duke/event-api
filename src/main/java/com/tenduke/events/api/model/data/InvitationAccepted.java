package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event occurring when user has accepted an invitation.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface InvitationAccepted extends
        InvitationFields,
        UserIdFields,
        ErrorInfoFields,
        RequestFields,
        TimeFields {
}
