package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.UUID;

/**
 * Event data fields common for all credential activation and deactivation events.
 * @author jarkko
 * @since 10Duke Enterprise 6.0.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface CredentialActivationStateFields extends
        TimeFields,
        RequestFields,
        ErrorInfoFields,
        UserIdFields {

    /**
     * Credential type "WebAuthnCredential".
     */
    String CREDENTIAL_TYPE_PASSKEY = "WebAuthnCredential";

    /**
     * Credential type "EmailAndPassword".
     */
    String CREDENTIAL_TYPE_PASSWORD = "EmailAndPassword";

    /**
     * Credential type "TimeBasedOTPCredential" (Time-based One-Time Password).
     */
    String CREDENTIAL_TYPE_TOTP = "TimeBasedOTPCredential";

    /**
     * Gets the credential type.
     * @return The credential type, one of the
     *      <code>CREDENTIAL_TYPE_</code> values declared by this
     *      interface.
     */
    String getCredentialType();

    /**
     * Gets id of credential object related to the event.
     * @return The credential object id.
     */
    UUID getCredentialObjectId();
}
