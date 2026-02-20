package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.LicenseCreditAndValidityFields;
import com.tenduke.events.api.model.data.LicenseProvisionFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * Event occurring when license has been provisioned.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseProvisioned extends
        LicenseProvisionFields,
        UserIdFields,
        ErrorInfoFields,
        TimeFields,
        RequestFields {

    /**
     * Gets activation code used to provision this license.
     * @return Activation code used to provision this license. Returns <code>null</code> if the license was not provisioned using activation
     * code.
     */
    String getActivationCode();

    /**
     * Gets previous state of the license.
     * @return Previous state of the license if an existing license was update, otherwise null.
     */
    LicenseCreditAndValidityFields getPreviousState();
}
