package com.tenduke.events.api.model.object.audit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ModifiedAuditFields;

/**
 * Resource created.
 * @param <R> Type of the tracked resource.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface Created<R> extends ModifiedAuditFields<R> {
}
