package com.equinix.ecp.model.troubleTicket;

import java.util.List;

public class LocationsResponse {

    private List<Locations> locations;

    public LocationsResponse() {
    }

    public LocationsResponse(List<Locations> locations) {
        this.locations = locations;
    }

    public List<Locations> getLocations() {
        return locations;
    }

    public void setLocations(List<Locations> locations) {
        this.locations = locations;
    }
}
