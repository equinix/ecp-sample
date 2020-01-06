package com.equinix.ecp.model.troubleTicket;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ServiceDetails {

    private String incidentDateTime;
    private String problemDetailsCategory;
    private String problemCode;
    private String serviceName;
    private boolean callFromCage;
    private String additionalDetails;


    public String getIncidentDateTime() {
        return incidentDateTime;
    }

    public void setIncidentDateTime(String incidentDateTime) {
        this.incidentDateTime = incidentDateTime;
    }

    public String getProblemCode() {
        return problemCode;
    }

    public void setProblemCode(String problemCode) {
        this.problemCode = problemCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean isCallFromCage() {
        return callFromCage;
    }

    public String getProblemDetailsCategory() {
        return problemDetailsCategory;
    }

    public void setProblemDetailsCategory(String problemDetailsCategory) {
        this.problemDetailsCategory = problemDetailsCategory;
    }

    public void setCallFromCage(boolean callFromCage) {
        this.callFromCage = callFromCage;
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    @Override
    public String toString() {
        return "ServiceDetails{" +
                "incidentDateTime='" + incidentDateTime + '\'' +
                ", problemCode='" + problemCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", callFromCage=" + callFromCage +
                ", additionalDetails='" + additionalDetails + '\'' +
                '}';
    }
}
