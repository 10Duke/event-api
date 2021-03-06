package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for license operations that contain assignment data.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseAssignmentFields extends LicenseFields {

    /**
     * Gets unique id of the object.
     * @return The assignment identifier.
     */
    String getAssignmentId();

    /**
     * Gets reservation type defined for the assignment.
     * @return Reservation type.
     */
    String getReservationType();
}
