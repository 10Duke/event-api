package com.tenduke.events.api.model.object.audit;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Resource read.
 * @param <R> Type of the tracked resource.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface Read<R> {
}
