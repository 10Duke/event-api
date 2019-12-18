package com.tenduke.events.api.model.data;

/**
 * Event data fields related to an external identity provider (in practice OpenID Connect
 * or SAML identity provider).
 * @author jarkko
 */
public interface ProviderFields {

    /**
     * <p>
     * Gets identifier of an external identity provider related to the event.
     * </p>
     * <p>
     * It is recommended that a permanent id used by the event sender system is used
     * as the value of this field, and not e.g. OAuth {@code client_id}.
     * </p>
     * @return Identifier of the external provider in the event sender system.
     */
    String getProviderId();

    /**
     * Gets type of the external identity provider. This field may be used in addition to
     * {@code providerId} if necessary.
     * @return Type of the external identity provider, as described in the event sender system.
     */
    String getProviderType();
}
