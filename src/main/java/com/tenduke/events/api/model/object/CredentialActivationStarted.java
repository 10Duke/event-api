package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;
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
        TimeFields,
        RequestFields,
        ErrorInfoFields,
        UserIdFields,
        ValidityFields {

    /**
     * Activating a new password has been started by delivering a code to the
     * user ("forgot password" process, code usually sent by email).
     */
    String CREDENTIAL_ACTIVATION_PROCESS_RESET_PASSWORD = "ResetPassword";

    /**
     * Activating user account has been started by delivering a code to the
     * user (usually by email). The user may activate the account by setting
     * up any credentials allowed in the system, for example a password or
     * a passkey.
     */
    String CREDENTIAL_ACTIVATION_PROCESS_ACTIVATE_USER = "ActivateUser";

    /**
     * Gets name of the credential activation process.
     * @return The activation process name, one of the
     *      <code>CREDENTIAL_ACTIVATION_PROCESS_</code> values declared by this
     *      interface, or a custom value if a customized activation process is
     *      used.
     */
    String getActivationProcess();
}
