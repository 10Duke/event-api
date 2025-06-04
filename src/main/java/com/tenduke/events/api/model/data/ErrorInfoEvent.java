package com.tenduke.events.api.model.data;

import com.tenduke.events.api.model.data.ErrorInfo;
import com.tenduke.events.api.model.data.ErrorInfoFields;

/**
 * Event that contains {@link ErrorInfo}.
 * @author jarkko
 */
public interface ErrorInfoEvent extends ErrorInfoFields {

    /**
     * Sets error info.
     * @param errorInfo The {@link ErrorInfo} to set.
     */
    void setErrorInfo(ErrorInfo errorInfo);
}
