package com.equinix.ecp.model.crossconnect;


import java.util.List;

public class ProtocolType {

    private String name;
    private List<String> connectorType;

    public ProtocolType() {
    }

    public String getName() {
        return name;
    }

    public List<String> getConnectorType() {
        return connectorType;
    }

    public void setConnectorType(List<String> connectorType) {
        this.connectorType = connectorType;
    }

    public void setName(String name) {
        this.name = name;
    }

}
