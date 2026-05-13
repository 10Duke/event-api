package com.tenduke.events.api.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event data fields for identifying a client role.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface ClientRoleFields extends ClientFields {

    /**
     * Gets the client role id.
     * @return The client role id.
     */
    String getClientRoleId();
}
