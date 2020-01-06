package com.equinix.ecp.model.shipment;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Price {

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int number;
    private String trackingId;
    private boolean iAgree;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
}
