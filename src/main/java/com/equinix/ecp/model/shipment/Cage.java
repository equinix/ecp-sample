package com.equinix.ecp.model.shipment;

import java.util.List;

public class Cage {
    private String cage;
    private List<String> cageTypes;
    private List<Account> accounts;

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    public List<String> getCageTypes() {
        return cageTypes;
    }

    public void setCageTypes(List<String> cageTypes) {
        this.cageTypes = cageTypes;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
