package com.equinix.ecp.model.shipment;

import java.util.List;

public class IbxLocation {
    private String ibx;
    private List<ShipmentCage> cages;

    public String getIbx() {
        return ibx;
    }

    public void setIbx(String ibx) {
        this.ibx = ibx;
    }

    public List<ShipmentCage> getCages() {
        return cages;
    }

    public void setCages(List<ShipmentCage> cages) {
        this.cages = cages;
    }
}
