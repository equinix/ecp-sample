package com.equinix.ecp.model.workVisit;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WorkVisitResponseSuccess {
    private IbxLocationResponse ibxLocation;

    @JsonProperty("response")
    private Response response;

    public IbxLocationResponse getIbxLocation() {
        return ibxLocation;
    }

    public void setIbxLocation(IbxLocationResponse ibxLocation) {
        this.ibxLocation = ibxLocation;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
