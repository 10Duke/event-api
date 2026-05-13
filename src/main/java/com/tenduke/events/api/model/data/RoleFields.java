package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for identifying a role (a global internal role).
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface RoleFields {

    /**
     * Gets the role id.
     * @return The role id.
     */
    String getRoleId();
}
