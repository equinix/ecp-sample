package com.equinix.ecp.examples;

import com.equinix.ecp.APIException;
import com.equinix.ecp.Util;
import com.equinix.ecp.model.PlaceOrderResponse;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.model.crossconnect.*;
import com.equinix.ecp.model.smarthands.LocationsList;
import com.equinix.ecp.service.CrossConnectAPIHandler;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public class CrossConnectsExample {

    private static AuthenTokenResponse authenTokenResponse;

    public static void main(String[] args) throws JsonProcessingException {

        CrossConnectAPIHandler crossConnectAPIHandler=new CrossConnectAPIHandler();

        try {
            authenTokenResponse = Util.createToken();
            System.out.println("Response is: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(authenTokenResponse));
        } catch (APIException ex) {
            ex.printStackTrace();
            System.out.println("Error Response " + ex.getMessage());
        }

        try {
            List<CrossConnectProviders> crossConnectProviders = crossConnectAPIHandler.getCrossConnectProvidersResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (crossConnectProviders));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            LocationsList locationsList = crossConnectAPIHandler.getLocationsList(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (locationsList));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            CrossConnectTypesList crossConnectTypesList  = crossConnectAPIHandler.getCrossConnectTypesList(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (crossConnectTypesList));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            List<ConnectionServicesResponse> connectionServicesResponse = crossConnectAPIHandler.getConnectionServicesResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (connectionServicesResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PatchPanel patchPanel = crossConnectAPIHandler.getPatchPanelResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (patchPanel));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse crossConnectStandardResponse = crossConnectAPIHandler.getCrossConnectStandardResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (crossConnectStandardResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse crossConnectIntracustomerResponse = crossConnectAPIHandler.getCrossConnectIntracustomerResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (crossConnectIntracustomerResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse crossConnectExtendedResponse = crossConnectAPIHandler.getCrossConnectExtendedResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (crossConnectExtendedResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse crossConnectFiberResponse = crossConnectAPIHandler.getCrossConnectFiberResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (crossConnectFiberResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse crossConnectDeinstallResponse = crossConnectAPIHandler.getCrossConnectDeinstallResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (crossConnectDeinstallResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }


    }

}
