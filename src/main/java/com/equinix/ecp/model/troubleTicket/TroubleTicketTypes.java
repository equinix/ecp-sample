package com.equinix.ecp.model.troubleTicket;


import java.util.List;

public class TroubleTicketTypes {

     private List<TroubleTicketTypesResponse> troubleticketTypes;

    public TroubleTicketTypes() {
    }

    public TroubleTicketTypes(List<TroubleTicketTypesResponse> troubleticketTypes) {
        this.troubleticketTypes = troubleticketTypes;
    }

    public List<TroubleTicketTypesResponse> getTroubleticketTypes() {
        return troubleticketTypes;
    }

    public void setTroubleticketTypes(List<TroubleTicketTypesResponse> troubleticketTypes) {
        this.troubleticketTypes = troubleticketTypes;
    }
}
