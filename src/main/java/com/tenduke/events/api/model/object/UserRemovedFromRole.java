package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.RoleFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * User removed from a role (from a global internal role).
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface UserRemovedFromRole extends
        UserIdFields,
        RoleFields,
        ErrorInfoFields,
        RequestFields,
        TimeFields {

}
