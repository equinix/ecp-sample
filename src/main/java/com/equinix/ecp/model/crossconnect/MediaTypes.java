package com.equinix.ecp.model.crossconnect;


import java.util.List;

public class MediaTypes {

     private String name;
     private List<ProtocolType> protocolType;
     private List<Integer> circuitCounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProtocolType> getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(List<ProtocolType> protocolType) {
        this.protocolType = protocolType;
    }

    public List<Integer> getCircuitCounts() {
        return circuitCounts;
    }

    public void setCircuitCounts(List<Integer> circuitCounts) {
        this.circuitCounts = circuitCounts;
    }
}
