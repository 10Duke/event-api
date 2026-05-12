package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.LicenseCreditsSplitOrMergedFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * Event occurring when license credits have been merged back to source license.
 * @author janne
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseCreditsMergedBack extends
        LicenseCreditsSplitOrMergedFields,
        UserIdFields,
        ErrorInfoFields,
        TimeFields,
        RequestFields {

    /**
     * Gets merged seat count.
     * @return merged seat count.
     */
    Integer getMergedSeatCount();
}
