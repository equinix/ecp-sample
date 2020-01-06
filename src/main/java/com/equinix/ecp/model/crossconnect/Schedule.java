package com.equinix.ecp.model.crossconnect;

public class Schedule {

    private String ibxTimeZone;
    private String scheduleType;
    private String requestedStartDate;
    private String requestedCompletionDate;

    public Schedule() {
    }

    public String getIbxTimeZone() {
        return ibxTimeZone;
    }

    public void setIbxTimeZone(String ibxTimeZone) {
        this.ibxTimeZone = ibxTimeZone;
    }

    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public String getRequestedStartDate() {
        return requestedStartDate;
    }

    public void setRequestedStartDate(String requestedStartDate) {
        this.requestedStartDate = requestedStartDate;
    }

    public String getRequestedCompletionDate() {
        return requestedCompletionDate;
    }

    public void setRequestedCompletionDate(String requestedCompletionDate) {
        this.requestedCompletionDate = requestedCompletionDate;
    }

    public Schedule(String ibxTimeZone, String scheduleType, String requestedStartDate, String requestedCompletionDate) {
        this.ibxTimeZone = ibxTimeZone;
        this.scheduleType = scheduleType;
        this.requestedStartDate = requestedStartDate;
        this.requestedCompletionDate = requestedCompletionDate;

    }
}
