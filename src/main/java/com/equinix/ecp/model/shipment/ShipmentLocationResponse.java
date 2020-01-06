package com.equinix.ecp.model.shipment;

import java.util.List;

public class ShipmentLocationResponse {
    public ShipmentLocationResponse() {
    }

    private List<Location> locations;

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
