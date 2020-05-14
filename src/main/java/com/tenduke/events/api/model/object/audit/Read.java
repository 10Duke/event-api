package com.tenduke.events.api.model.object.audit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;

/**
 * Resource read.
 * @param <R> Type of the tracked resource.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface Read<R> extends TimeFields, RequestFields {
}