package com.tenduke.events.api.model.object;

import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * User logged out.
 * @author jarkko
 */
public interface UserLoggedOut extends
        TimeFields,
        RequestFields,
        ErrorInfoFields,
        UserIdFields {
}
