package com.equinix.ecp.model.crossconnect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Ibxlocation {

    private String ibx;
    private List<CrossConnectCages> cages;


    public String getIbx() {
        return ibx;
    }

    public void setIbx(String ibx) {
        this.ibx = ibx;
    }

    public List<CrossConnectCages> getCages() {
        return cages;
    }

    public void setCages(List<CrossConnectCages> cages) {
        this.cages = cages;
    }
}