package com.equinix.ecp.model.shipment;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OutboundServiceDetail {
    private OutboundShipmentDetails shipmentDetails;
    private String inboundRequestDescription;
    private String storageId;
    private String estimatedDateTime;

    public OutboundShipmentDetails getShipmentDetails() {
        return shipmentDetails;
    }

    public void setShipmentDetails(OutboundShipmentDetails shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

    public String getInboundRequestDescription() {
        return inboundRequestDescription;
    }

    public void setInboundRequestDescription(String inboundRequestDescription) {
        this.inboundRequestDescription = inboundRequestDescription;
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public String getEstimatedDateTime() {
        return estimatedDateTime;
    }

    public void setEstimatedDateTime(String estimatedDateTime) {
        this.estimatedDateTime = estimatedDateTime;
    }
}
