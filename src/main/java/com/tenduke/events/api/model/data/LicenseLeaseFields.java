package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 * Event data fields for license operations that contain lease data.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseLeaseFields extends LicenseFields {

    /**
     * Gets the lease id returned in token reflecting this consumption.
     * @return lease id.
     */
    String getLeaseId();

    /**
     * Gets the license anchors that a license can be tied to.
     * @return the license anchors.
     */
    List<LicenseAnchorIdFields> getLicenseAnchors();
}
