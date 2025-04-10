package com.tenduke.events.api.model.data;

/**
 * Event data fields common for all credential activation events.
 * @author jarkko
 * @since 10Duke Enterprise 6.0.0
 */
public interface CredentialActivationFields
        extends CredentialActivationStateFields {

    /**
     * Activating a new credential has been started by delivering a code to the
     * user ("forgot password" process, code usually sent by email).
     */
    String CREDENTIAL_ACTIVATION_PROCESS_RESET_CREDENTIAL = "ResetCredential";

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
