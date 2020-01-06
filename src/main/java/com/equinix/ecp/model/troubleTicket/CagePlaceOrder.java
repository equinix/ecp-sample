package com.equinix.ecp.model.troubleTicket;

import java.util.List;

public class CagePlaceOrder {

    private String cage;
    private List<String> cabinets;
    private String accountNumber;

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    public List<String> getCabinets() {
        return cabinets;
    }

    public void setCabinets(List<String> cabinets) {
        this.cabinets = cabinets;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
