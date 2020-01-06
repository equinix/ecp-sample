package com.equinix.ecp.model.workVisit;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ServiceDetail {
    private String additionalDetails;
    private Schedule schedule;
    private List<Visitor> visitors;
    private Boolean escortRequired;
    private Boolean openCabinet;

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public List<Visitor> getVisitors() {
        return visitors;
    }

    public void setVisitors(List<Visitor> visitors) {
        this.visitors = visitors;
    }

    public Boolean getEscortRequired() {
        return escortRequired;
    }

    public void setEscortRequired(Boolean escortRequired) {
        this.escortRequired = escortRequired;
    }

    public Boolean getOpenCabinet() {
        return openCabinet;
    }

    public void setOpenCabinet(Boolean openCabinet) {
        this.openCabinet = openCabinet;
    }

    @Override
    public String toString() {
        return "ServiceDetail{" +
                "additionalDetails='" + additionalDetails + '\'' +
                ", schedule=" + schedule +
                ", visitors=" + visitors +
                ", escortRequired=" + escortRequired +
                ", openCabinet=" + openCabinet +
                '}';
    }
}
