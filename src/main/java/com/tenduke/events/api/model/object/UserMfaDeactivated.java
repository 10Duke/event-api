package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * User multi factor authentication deactivated.
 * @author roope
 * @deprecated Replaced by {@link CredentialDeactivated} that is used for all
 *      all credential deactivation cases.
 */
@Deprecated
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface UserMfaDeactivated extends
        TimeFields,
        RequestFields,
        ErrorInfoFields,
        UserIdFields {
}
