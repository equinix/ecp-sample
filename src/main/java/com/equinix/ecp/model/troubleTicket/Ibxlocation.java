package com.equinix.ecp.model.troubleTicket;

import java.util.List;

public class Ibxlocation {

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
