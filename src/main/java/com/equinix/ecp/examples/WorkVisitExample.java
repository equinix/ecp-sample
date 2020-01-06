package com.equinix.ecp.examples;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.model.workVisit.LocationResponse;
import com.equinix.ecp.model.workVisit.WorkVisitResponse;
import com.equinix.ecp.service.WorkVisitAPIHandler;

public class WorkVisitExample {

    private static AuthenTokenResponse authenTokenResponse;

    public static void main(String[] args) {

        WorkVisitAPIHandler workVisitAPIHandler = new WorkVisitAPIHandler();

        try {
            authenTokenResponse = Util.createToken();
            System.out.println("Response is: \n" + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(authenTokenResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("authentication Response Error is " + e.getMessage());
        }

        try {
            LocationResponse workVisitLocation = workVisitAPIHandler.getWorkVisitLocation(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (workVisitLocation));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            WorkVisitResponse workVisitResponse = workVisitAPIHandler.getWorkVisitResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (workVisitResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }
        
    }
}
