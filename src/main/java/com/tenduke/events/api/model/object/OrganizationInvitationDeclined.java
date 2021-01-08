package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.OrganizationFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * Event occurring when organization invitation has been declined.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface OrganizationInvitationDeclined extends
        OrganizationFields,
        UserIdFields,
        ErrorInfoFields,
        RequestFields,
        TimeFields {
}