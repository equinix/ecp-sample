package com.equinix.ecp.model.crossconnect;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Price {

    private String amount;
    private String trackingId;
    private boolean iAgree;

    public Price() {
    }

    public Price(String amount) {
        this.amount = amount;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public boolean isiAgree() {
        return iAgree;
    }

    public void setiAgree(boolean iAgree) {
        this.iAgree = iAgree;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
