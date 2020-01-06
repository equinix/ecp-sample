package com.equinix.ecp.examples;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.PlaceOrderResponse;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.model.troubleTicket.LocationsResponse;
import com.equinix.ecp.model.troubleTicket.TroubleTicketTypes;
import com.equinix.ecp.service.TroubleTicketAPIHandler;

public class TroubleTicketExample {

    private static AuthenTokenResponse authenTokenResponse;

    public static void main(String[] args) {

        TroubleTicketAPIHandler troubleTicketAPIHandler = new TroubleTicketAPIHandler();

        try {
            authenTokenResponse = Util.createToken();
            System.out.println("Response is: \n" + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(authenTokenResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("authentication Response Error is " + e.getMessage());
        }


        try {
            TroubleTicketTypes troubleTicketTypesResponse = troubleTicketAPIHandler.getTroubleTicketTypesResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (troubleTicketTypesResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }


        try {
            LocationsResponse troubleTicketLocationsResponseResponse = troubleTicketAPIHandler.getTroubleTicketLocations(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (troubleTicketLocationsResponseResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }


        try {
            PlaceOrderResponse troubleTicketResponse = troubleTicketAPIHandler.getTroubleTicketResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (troubleTicketResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

    }
}

