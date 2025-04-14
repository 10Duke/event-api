package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * User password created.
 * @author roope
 * @deprecated Replaced by {@link CredentialActivated} that is used for all
 *      all credential activation cases.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Deprecated
public interface UserPasswordCreated extends
        TimeFields,
        RequestFields,
        ErrorInfoFields,
        UserIdFields {
}
