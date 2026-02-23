package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.LicenseFields;
import com.tenduke.events.api.model.data.LicenseTransactionItemFields;
import com.tenduke.events.api.model.data.RequestFields;

/**
 * Event indicating that a license  was resumed from suspension..
 * @author janne
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseResumed extends LicenseTransactionItemFields, RequestFields, LicenseFields {
}
