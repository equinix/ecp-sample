package com.equinix.ecp.model.workVisit;

import java.util.List;

public class WorkVisitResponse {
    private List<WorkVisitResponseSuccess> successes;

    public List<WorkVisitResponseSuccess> getSuccesses() {
        return successes;
    }

    public void setSuccesses(List<WorkVisitResponseSuccess> successes) {
        this.successes = successes;
    }
}
