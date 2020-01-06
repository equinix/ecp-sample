package com.equinix.ecp.model.troubleTicket;

import com.equinix.ecp.model.Accounts;

import java.util.List;

public class Cage {

    private String cage;
    private List<String> cageTypes;
    private List<Accounts> accounts;

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

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }
}
