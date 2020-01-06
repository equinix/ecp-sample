package com.equinix.ecp.model.shipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OutboundShipmentDetails {
    private Integer noOfBoxes;
    private boolean isOverSized;
    private String description;
    private List<String> trackingNumber;
    private String outboundType;
    private String carrierType;
    private String otherCarrierType;

    public int getNoOfBoxes() {
        return noOfBoxes;
    }

    public void setNoOfBoxes(Integer noOfBoxes) {
        this.noOfBoxes = noOfBoxes;
    }

    public boolean isOverSized() {
        return isOverSized;
    }

    public void setOverSized(boolean overSized) {
        isOverSized = overSized;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(List<String> trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getOutboundType() {
        return outboundType;
    }

    public void setOutboundType(String outboundType) {
        this.outboundType = outboundType;
    }

    public String getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(String carrierType) {
        this.carrierType = carrierType;
    }

    public String getOtherCarrierType() {
        return otherCarrierType;
    }

    public void setOtherCarrierType(String otherCarrierType) {
        this.otherCarrierType = otherCarrierType;
    }
}
