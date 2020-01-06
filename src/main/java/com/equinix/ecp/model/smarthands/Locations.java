package com.equinix.ecp.model.smarthands;

import java.util.List;

public class Locations {

    private String ibx;
    private List<Cages> cages;

    public String getIbx() {
        return ibx;
    }

    public void setIbx(String ibx) {
        this.ibx = ibx;
    }

    public List<Cages> getCages() {
        return cages;
    }

    public void setCages(List<Cages> cages) {
        this.cages = cages;
    }


}
