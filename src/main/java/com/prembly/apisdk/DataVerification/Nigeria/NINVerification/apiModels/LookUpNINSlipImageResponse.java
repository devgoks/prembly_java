package com.prembly.apisdk.DataVerification.Nigeria.NINVerification.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LookUpNINSlipImageResponse {
    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("response_code")
    private String responseCode;

    @JsonProperty("nin_data")
    private NinData ninData;
}
