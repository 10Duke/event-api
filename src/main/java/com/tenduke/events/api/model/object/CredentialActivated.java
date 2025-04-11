package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.CredentialActivationFields;

/**
 * Credential activated. For example, user has set up a new password
 * ("forgot password" process), user has activated a new user account by
 * setting up a passkey, or user has enabled TOTP 2nd factor authentication.
 * @author jarkko
 * @since 10Duke Enterprise 6.0.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface CredentialActivated extends
        CredentialActivationFields {

    /**
     * Credential has been activated in user registration.
     */
    String CREDENTIAL_ACTIVATION_PROCESS_REGISTER_USER = "UserRegistered";

    /**
     * Credential has been activated in user creation.
     */
    String CREDENTIAL_ACTIVATION_PROCESS_CREATE_USER = "UserCreated";
}
