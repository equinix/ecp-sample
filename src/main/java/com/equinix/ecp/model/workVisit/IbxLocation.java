package com.equinix.ecp.model.workVisit;

import java.util.List;

public class IbxLocation {
    private String ibx;
    private List<CagePlaceOrder> cages;

    public String getIbx() {
        return ibx;
    }

    public void setIbx(String ibx) {
        this.ibx = ibx;
    }

    public List<CagePlaceOrder> getCages() {
        return cages;
    }

    public void setCages(List<CagePlaceOrder> cages) {
        this.cages = cages;
    }
}
