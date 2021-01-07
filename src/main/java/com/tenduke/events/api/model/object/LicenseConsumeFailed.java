package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.LicenseConsumptionFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * Event occurring when license consumption has failed.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseConsumeFailed extends
        LicenseConsumptionFields,
        UserIdFields,
        ErrorInfoFields,
        TimeFields,
        RequestFields {

    /**
     * Gets the result code clarifying why the consume failed.
     * @return the result code.
     */
    String getResultCode();
}
