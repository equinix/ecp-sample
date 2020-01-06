package com.equinix.ecp.model.crossconnect;

public class NetworkPorts {

    private String type;
    private String typeDescription;
    private String disabled;

    public NetworkPorts() {
    }

    public NetworkPorts(String type, String typeDescription, String disabled) {
        this.type = type;
        this.typeDescription = typeDescription;
        this.disabled = disabled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }
}
