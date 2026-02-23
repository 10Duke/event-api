package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.LicenseFields;
import com.tenduke.events.api.model.data.LicenseTransactionItemFields;
import com.tenduke.events.api.model.data.RequestFields;

/**
 * Event indicating that a license  was suspended.
 * @author janne
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface LicenseSuspended extends LicenseTransactionItemFields, RequestFields, LicenseFields {
}
