package com.equinix.ecp.model.smarthands;

import com.equinix.ecp.model.Accounts;
import com.equinix.ecp.model.troubleTicket.Cage;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Cages {

    private String cage;
    private List<Cage> cages;
    private List<Accounts> accounts;

    public Cages(String cage, List<Cage> cages, List<Accounts> accounts) {
        this.cage = cage;
        this.cages = cages;
        this.accounts = accounts;
    }

    public Cages() {
    }

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    public List<Cage> getCages() {
        return cages;
    }

    public void setCages(List<Cage> cages) {
        this.cages = cages;
    }

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }
}
