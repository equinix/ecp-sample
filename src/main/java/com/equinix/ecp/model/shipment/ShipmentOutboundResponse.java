package com.equinix.ecp.model.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipmentOutboundResponse {
    @JsonProperty("OrderReferenceId")
    private String orderReferenceId;

    @JsonProperty("OrderNumber")
    private String orderNumber;

    @JsonProperty("Id")
    private String id;

    @JsonProperty("SRNumber")
    private String srNumber;

    @JsonProperty("OrderReferenceId")
    public String getOrderReferenceId() {
        return orderReferenceId;
    }

    @JsonProperty("OrderReferenceId")
    public void setOrderReferenceId(String orderReferenceId) {
        this.orderReferenceId = orderReferenceId;
    }

    @JsonProperty("OrderNumber")
    public String getOrderNumber() {
        return orderNumber;
    }

    @JsonProperty("OrderNumber")
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("SRNumber")
    public String getSrNumber() {
        return srNumber;
    }

    @JsonProperty("SRNumber")
    public void setSrNumber(String srNumber) {
        this.srNumber = srNumber;
    }
}
