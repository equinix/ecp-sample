package com.equinix.ecp.model.workVisit;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

    @JsonProperty("OrderNumber")
    private String orderNumber;

    public Response() {}

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }


}
