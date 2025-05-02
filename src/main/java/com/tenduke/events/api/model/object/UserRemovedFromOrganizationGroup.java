package com.tenduke.events.api.model.object;

import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.OrganizationGroupFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * User removed from an organization group.
 * @author jarkko
 */
public interface UserRemovedFromOrganizationGroup extends
        UserIdFields,
        OrganizationGroupFields,
        ErrorInfoFields,
        RequestFields,
        TimeFields {

}
