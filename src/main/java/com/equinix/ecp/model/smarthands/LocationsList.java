package com.equinix.ecp.model.smarthands;

import java.util.List;

public class LocationsList {

    public LocationsList() {
    }

    private List<Locations> locations;

    public LocationsList(List<Locations> locations) {
        this.locations = locations;
    }

    public List<Locations> getLocations() {
        return locations;
    }

    public void setLocations(List<Locations> locations) {
        this.locations = locations;
    }
}
