package com.equinix.ecp.model.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipmentInboundResponse {
    @JsonProperty("OrderReferenceId")
    private String orderReferenceId;

    @JsonProperty("OrderNumber")
    private String orderNumber;

    @JsonProperty("Id")
    private String id;

    @JsonProperty("SRNumber")
    private String srNumber;

    public String getOrderReferenceId() {
        return orderReferenceId;
    }

    public void setOrderReferenceId(String orderReferenceId) {
        this.orderReferenceId = orderReferenceId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getSrNumber() {
        return srNumber;
    }

    public void setSrNumber(String srNumber) {
        this.srNumber = srNumber;
    }
}
