package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;
import com.tenduke.events.api.model.data.ValidityFields;

/**
 * Email sent to user for the purpose of resetting password (forgot password).
 * @author jarkko
 * @deprecated Replaced by {@link ActivateCredentialStarted} that can describe
 *      all credential activation cases.
 */
@Deprecated
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface ForgotPasswordEmailSent extends
        TimeFields,
        RequestFields,
        ErrorInfoFields,
        UserIdFields,
        ValidityFields {
}
