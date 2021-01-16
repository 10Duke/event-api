package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for identifying a license anchor.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseAnchorIdFields {

    /**
     * Gets the license anchor type.
     * @return The license anchor object type name.
     */
    String getLicenseAnchorType();

    /**
     * Gets identifier of the license anchor.
     * @return The license anchor object id.
     */
    String getLicenseAnchorId();
}
