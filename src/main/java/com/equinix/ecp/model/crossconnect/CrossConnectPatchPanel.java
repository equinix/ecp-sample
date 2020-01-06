package com.equinix.ecp.model.crossconnect;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CrossConnectPatchPanel {

    private String name;
    private String portA;
    private String portB;


    public CrossConnectPatchPanel() {
    }


    public String getName() {
        return name;
    }

    public String getPortB() {
        return portB;
    }

    public void setPortB(String portB) {
        this.portB = portB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPortA() {
        return portA;
    }

    public void setPortA(String portA) {
        this.portA = portA;
    }


}
