package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.creditBureau;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Verification {
    @JsonProperty("status")
    private String status;
    @JsonProperty("reference")
    private String reference;
}
