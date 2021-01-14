package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;
import com.tenduke.events.api.model.data.OrganizationInvitationFields;

/**
 * Event occurring when user has been invited and preregistered.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface UserInvitedAndPreRegistered extends
        OrganizationInvitationFields,
        UserIdFields,
        ErrorInfoFields,
        RequestFields,
        TimeFields {
}
