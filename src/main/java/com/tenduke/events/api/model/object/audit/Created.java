package com.tenduke.events.api.model.object.audit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ModifiedAuditFields;
import com.tenduke.events.api.model.data.ObjectFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * Resource created.
 * @param <R> Type of the tracked resource.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface Created<R> extends
        TimeFields,
        RequestFields,
        UserIdFields,
        ObjectFields,
        ModifiedAuditFields<R> {
}
