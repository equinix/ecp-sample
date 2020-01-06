package com.equinix.ecp.model.troubleTicket;

import java.util.List;

public class AdditionalDetails {

     private List<String> subCategories;
     private List<String> enabledIBXs;

    public AdditionalDetails() {
    }

    public List<String> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<String> subCategories) {
        this.subCategories = subCategories;
    }

    public List<String> getEnabledIBXs() {
        return enabledIBXs;
    }

    public void setEnabledIBXs(List<String> enabledIBXs) {
        this.enabledIBXs = enabledIBXs;
    }
}
