package com.equinix.ecp.model.workVisit;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CagePlaceOrderResponse {
    private String cage;
    private String cageUSID;
    private String systemName;
    private String accountNumber;
    private List<Cabinet> cabinets;
    private List<Note> notes;
    private Boolean multiCabinet;

    public CagePlaceOrderResponse() {
    }

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    public String getCageUSID() {
        return cageUSID;
    }

    public void setCageUSID(String cageUSID) {
        this.cageUSID = cageUSID;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<Cabinet> getCabinets() {
        return cabinets;
    }

    public void setCabinets(List<Cabinet> cabinets) {
        this.cabinets = cabinets;
    }

    public boolean isMultiCabinet() {
        return multiCabinet;
    }

    public void setMultiCabinet(boolean multiCabinet) {
        this.multiCabinet = multiCabinet;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
