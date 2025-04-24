package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ActivationCodeBlockingStatusFields;

/**
 * An activation code blocked so that it can not be used for license provisioning.
 * @author jarkko
 * @since 10Duke Enterprise 6.0.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface ActivationCodeBlocked extends ActivationCodeBlockingStatusFields {

}
