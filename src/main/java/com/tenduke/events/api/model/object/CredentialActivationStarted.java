package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.CredentialActivationFields;
import com.tenduke.events.api.model.data.ValidityFields;

/**
 * Process for activating a new credential started. Examples of cases when new
 * credential activation is started are sending email to reset password (end
 * user self-service) or sending email to user for setting up a passkey or
 * password after their organization has initialized their data in the system.
 * @author jarkko
 * @since 10Duke Enterprise 6.0.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface CredentialActivationStarted extends
        CredentialActivationFields,
        ValidityFields {

}
