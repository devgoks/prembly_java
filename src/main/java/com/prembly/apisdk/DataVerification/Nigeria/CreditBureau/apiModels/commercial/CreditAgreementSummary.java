package com.prembly.apisdk.DataVerification.Nigeria.CreditBureau.apiModels.commercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreditAgreementSummary {
    @JsonProperty("DateAccountOpened")
    private String dateAccountOpened;

    @JsonProperty("SubscriberName")
    private String subscriberName;

    @JsonProperty("AccountNo")
    private String accountNo;

    @JsonProperty("IndicatorDescription")
    private String indicatorDescription;

    @JsonProperty("OpeningBalanceAmt")
    private String openingBalanceAmt;

    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("CurrentBalanceDebitInd")
    private String currentBalanceDebitInd;

    @JsonProperty("CurrentBalanceAmt")
    private String currentBalanceAmt;

    @JsonProperty("InstalmentAmount")
    private String instalmentAmount;

    @JsonProperty("AmountOverdue")
    private String amountOverdue;

    @JsonProperty("ClosedDate")
    private String closedDate;

    @JsonProperty("LastUpdatedDate")
    private String lastUpdatedDate;

    @JsonProperty("PerformanceStatus")
    private String performanceStatus;

    @JsonProperty("AccountStatus")
    private String accountStatus;
}
