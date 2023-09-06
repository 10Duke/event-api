package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.LicenseAssignmentFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * Event occurring when license reservation has been removed
 * @author janne
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseReservationRemoved extends
        LicenseAssignmentFields,
        UserIdFields,
        ErrorInfoFields,
        TimeFields,
        RequestFields {
}
