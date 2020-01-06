package com.equinix.ecp.model.workVisit;

import java.util.List;

public class LocationResponse {
    private List<Location> locations;

    public LocationResponse() {
    }

    public LocationResponse(List<Location> locations) {
        this.locations = locations;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
