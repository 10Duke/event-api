package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.LicenseAssignmentFields;
import com.tenduke.events.api.model.data.LicenseConsumptionFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * Event occurring when license has been checked. License check failure is communicated through
 * error fields.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseChecked extends
        LicenseAssignmentFields,
        LicenseConsumptionFields,
        UserIdFields,
        ErrorInfoFields,
        TimeFields,
        RequestFields {
}
