package com.prembly.apisdk.DataVerification.Nigeria.DriverLicense.apiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DriversLicenseFaceValidationResponse {
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("detail")
    private String detail;
    @JsonProperty("response_code")
    private String responseCode;
    @JsonProperty("frsc_data")
    private FrscDataLFV frscData;
    @JsonProperty("face_data")
    private FaceData faceData;
}
