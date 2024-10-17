package com.tenduke.events.api.model.object.audit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ObjectFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * Resource deleted.
 * @param <R> Type of the tracked resource.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface Deleted<R> extends
        TimeFields,
        RequestFields,
        UserIdFields,
        ObjectFields {
    /**
     * Gets final state of the object prior to deletion.
     * @return The final state of the object prior to deletion.
     */
    R getOldFields();
}
