package com.tenduke.events.api.model.data;

import java.util.List;

/**
 * Event data fields for license operations that contain lease data.
 * @author roope
 */
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
    List<Object> getLicenseAnchors();
}
