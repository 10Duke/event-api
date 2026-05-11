package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.LicenseCreditsSplitOrMergedFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * Event occurring when license credits has been split from source license.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseCreditsSplit extends
        LicenseCreditsSplitOrMergedFields,
        UserIdFields,
        ErrorInfoFields,
        TimeFields,
        RequestFields {

    /**
     * Gets split seat count.
     * @return split seat count.
     */
    Integer getSplitSeatCount();
}
