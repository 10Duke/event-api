package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ClientFields;
import com.tenduke.events.api.model.data.DurationFields;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.HttpRequestFields;
import com.tenduke.events.api.model.data.ProviderFields;
import com.tenduke.events.api.model.data.TenantFields;
import com.tenduke.events.api.model.data.UserFields;

/**
 * Request has been processed.
 * @author jarkko
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface RequestProcessed extends
        HttpRequestFields,
        UserFields,
        ClientFields,
        ProviderFields,
        DurationFields,
        TenantFields,
        ErrorInfoFields {
}
