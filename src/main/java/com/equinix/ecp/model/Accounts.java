package com.equinix.ecp.model;

import com.equinix.ecp.model.troubleTicket.Cabinet;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Accounts {

    private String number;
    private String name;
    private Boolean poTracking;
    private Boolean pricingEnabled;
    private Boolean pricingEnforced;
    private Boolean isCreditHold;
    private Boolean isPOBearing;
    private Boolean isMonetAccount;
    private List<Cabinet> cabinets;


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

    public Boolean getPoTracking() {
        return poTracking;
    }

    public void setPoTracking(Boolean poTracking) {
        this.poTracking = poTracking;
    }

    public Boolean getPricingEnabled() {
        return pricingEnabled;
    }

    public void setPricingEnabled(Boolean pricingEnabled) {
        this.pricingEnabled = pricingEnabled;
    }

    public Boolean getPricingEnforced() {
        return pricingEnforced;
    }

    public void setPricingEnforced(Boolean pricingEnforced) {
        this.pricingEnforced = pricingEnforced;
    }

    public Boolean getIsCreditHold() {
        return isCreditHold;
    }

    public void setIsCreditHold(Boolean creditHold) {
        isCreditHold = creditHold;
    }

    public Boolean getIsPOBearing() {
        return isPOBearing;
    }

    public void setIsPOBearing(Boolean POBearing) {
        isPOBearing = POBearing;
    }

    public Boolean getIsMonetAccount() {
        return isMonetAccount;
    }

    public void setIsMonetAccount(Boolean monetAccount) {
        isMonetAccount = monetAccount;
    }

    public List<Cabinet> getCabinets() {
        return cabinets;
    }

    public void setCabinets(List<Cabinet> cabinets) {
        this.cabinets = cabinets;
    }
}
