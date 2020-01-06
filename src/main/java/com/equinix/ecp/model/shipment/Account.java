package com.equinix.ecp.model.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Account {
    private String number;
    private String name;
    private boolean poTracking;
    private boolean pricingEnabled;
    private boolean pricingEnforced;
    private List<Cabinet> cabinets;
    @JsonProperty("isCreditHold")
    private boolean creditHold;
    @JsonProperty("isPOBearing")
    private boolean poBearing;
    @JsonProperty("isMonetAccount")
    private boolean monetAccount;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPoTracking() {
        return poTracking;
    }

    public void setPoTracking(boolean poTracking) {
        this.poTracking = poTracking;
    }

    public boolean isPricingEnabled() {
        return pricingEnabled;
    }

    public void setPricingEnabled(boolean pricingEnabled) {
        this.pricingEnabled = pricingEnabled;
    }

    public boolean isPricingEnforced() {
        return pricingEnforced;
    }

    public void setPricingEnforced(boolean pricingEnforced) {
        this.pricingEnforced = pricingEnforced;
    }

    public List<Cabinet> getCabinets() {
        return cabinets;
    }

    public void setCabinets(List<Cabinet> cabinets) {
        this.cabinets = cabinets;
    }

    public boolean isCreditHold() {
        return creditHold;
    }

    public void setCreditHold(boolean creditHold) {
        this.creditHold = creditHold;
    }

    public boolean isPoBearing() {
        return poBearing;
    }

    public void setPoBearing(boolean poBearing) {
        this.poBearing = poBearing;
    }

    public boolean isMonetAccount() {
        return monetAccount;
    }

    public void setMonetAccount(boolean monetAccount) {
        this.monetAccount = monetAccount;
    }
}
