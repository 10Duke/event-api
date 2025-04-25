package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ActivationCodeBlockingStatusFields;

/**
 * An activation code unblocked so that it can be used again for license provisioning.
 * @author jarkko
 * @since 10Duke Enterprise 6.0.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface ActivationCodeUnblocked extends ActivationCodeBlockingStatusFields {

}
