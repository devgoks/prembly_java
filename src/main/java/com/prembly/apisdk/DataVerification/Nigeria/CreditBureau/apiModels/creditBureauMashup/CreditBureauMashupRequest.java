package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.creditBureauMashup;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditBureauMashupRequest {
    private String number;
    @JsonProperty("customer_name")
    private String customerName;
    @JsonProperty("customer_reference")
    private String customerReference;
}
