package com.equinix.ecp.model.crossconnect;


import java.util.List;

public class CrossConnectTypesList {

    private List<CrossConnectTypesResponse> crossconnects;
    private List<InterconnectionServices> interconnectionservices;
    private List<NetworkPorts> networkports;


    public List<CrossConnectTypesResponse> getCrossconnects() {
        return crossconnects;
    }

    public void setCrossconnects(List<CrossConnectTypesResponse> crossconnects) {
        this.crossconnects = crossconnects;
    }

    public List<InterconnectionServices> getInterconnectionservices() {
        return interconnectionservices;
    }

    public void setInterconnectionservices(List<InterconnectionServices> interconnectionservices) {
        this.interconnectionservices = interconnectionservices;
    }

    public List<NetworkPorts> getNetworkports() {
        return networkports;
    }

    public void setNetworkports(List<NetworkPorts> networkports) {
        this.networkports = networkports;
    }
}
