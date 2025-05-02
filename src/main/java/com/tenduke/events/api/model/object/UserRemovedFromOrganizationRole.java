package com.tenduke.events.api.model.object;

import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.OrganizationRoleFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * User removed from an organization role.
 * @author jarkko
 */
public interface UserRemovedFromOrganizationRole extends
        UserIdFields,
        OrganizationRoleFields,
        ErrorInfoFields,
        RequestFields,
        TimeFields {

}
