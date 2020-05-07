package com.tenduke.events.api.model.object;

import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * User data updated.
 * @author jarkko
 */
public interface UserUpdated extends
        TimeFields,
        RequestFields,
        ErrorInfoFields,
        UserIdFields {

    /**
     * Gets the old user name or email before the update.
     * @return The user name / email.
     */
    String getOldUserName();
}
