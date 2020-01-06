package com.equinix.ecp.model.crossconnect;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CrossConnectCages {

    private String cage;
    private String accountNumber;
    private List<String> cabinets;

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<String> getCabinets() {
        return cabinets;
    }

    public void setCabinets(List<String> cabinets) {
        this.cabinets = cabinets;
    }
}
