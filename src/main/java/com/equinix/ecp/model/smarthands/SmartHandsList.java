package com.equinix.ecp.model.smarthands;

import java.util.List;

public class SmartHandsList {

    public SmartHandsList() {
    }

    public SmartHandsList(List<SmartHandsResponse> smarthands) {
        this.smarthands = smarthands;
    }

    private List<SmartHandsResponse> smarthands;

    public List<SmartHandsResponse> getSmarthands() {
        return smarthands;
    }

    public void setSmarthands(List<SmartHandsResponse> smarthands) {
        this.smarthands = smarthands;
    }
}
