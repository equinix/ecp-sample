package com.equinix.ecp.model.shipment;

import java.util.List;

public class Location {
    private String ibx;
    private List<Cage> cages;

    public String getIbx() {
        return ibx;
    }

    public void setIbx(String ibx) {
        this.ibx = ibx;
    }

    public List<Cage> getCages() {
        return cages;
    }

    public void setCages(List<Cage> cages) {
        this.cages = cages;
    }
}
