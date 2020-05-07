package com.tenduke.events.api.model.object;

import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * User registered.
 * @author jarkko
 */
public interface UserRegistered extends
        TimeFields,
        RequestFields,
        ErrorInfoFields,
        UserIdFields {
}
