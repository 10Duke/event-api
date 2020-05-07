package com.tenduke.events.api.model.object;

import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * User deleted.
 * @author jarkko
 */
public interface UserDeleted extends
        TimeFields,
        RequestFields,
        ErrorInfoFields,
        UserIdFields {
}
