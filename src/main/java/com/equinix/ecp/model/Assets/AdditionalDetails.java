package com.equinix.ecp.model.Assets;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AdditionalDetails {

    private String cabinetNumber;
    private String customerOrCarrierCircuitID;


    public String getCabinetNumber() {
        return cabinetNumber;
    }

    public void setCabinetNumber(String cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }

    public String getCustomerOrCarrierCircuitID() {
        return customerOrCarrierCircuitID;
    }

    public void setCustomerOrCarrierCircuitID(String customerOrCarrierCircuitID) {
        this.customerOrCarrierCircuitID = customerOrCarrierCircuitID;
    }

}
