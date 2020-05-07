package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * User has reset her password (forgot password).
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface ForgotPasswordReset extends
        TimeFields,
        RequestFields,
        ErrorInfoFields,
        UserIdFields {
}
