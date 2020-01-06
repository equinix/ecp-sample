package com.equinix.ecp.model.smarthands;

import com.equinix.ecp.model.crossconnect.CrossConnectCages;

import java.util.List;

public class SmartHandsIbxlocation {

    private List<CrossConnectCages> cages;
    private String ibx;

    public List<CrossConnectCages> getCages() {
        return cages;
    }

    public void setCages(List<CrossConnectCages> cages) {
        this.cages = cages;
    }

    public String getIbx() {
        return ibx;
    }

    public void setIbx(String ibx) {
        this.ibx = ibx;
    }
}
