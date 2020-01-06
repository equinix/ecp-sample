package com.equinix.ecp.examples;

import com.equinix.ecp.APIException;
import com.equinix.ecp.Util;
import com.equinix.ecp.model.PlaceOrderResponse;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.model.smarthands.*;
import com.equinix.ecp.service.SmartHandsAPIHandler;
import com.fasterxml.jackson.core.JsonProcessingException;

public class SmartHandsExample {

    private static AuthenTokenResponse authenTokenResponse;

    public static void main(String[] args) throws JsonProcessingException {

        SmartHandsAPIHandler smartHandsAPIHandler=new SmartHandsAPIHandler();

        try {
            authenTokenResponse = Util.createToken();
            System.out.println("Response is: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(authenTokenResponse));
        } catch (APIException ex) {
            ex.printStackTrace();
            System.out.println("authentication Error Response is " + ex.getMessage());
        }

        try {
            PlaceOrderResponse smartHandsMoveCables = smartHandsAPIHandler.getSmartHandsMoveCablesResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (smartHandsMoveCables));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse smartHandsLocatePackage = smartHandsAPIHandler.getSmartHandsLocatePackageResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (smartHandsLocatePackage));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse smartHandsPicturesDocument = smartHandsAPIHandler.getSmartHandsPicturesDocumentResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (smartHandsPicturesDocument));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse smartHandsPatchCableInstall = smartHandsAPIHandler.getSmartHandsPatchCableInstallResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (smartHandsPatchCableInstall));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse smartHandsPatchCableRemoval = smartHandsAPIHandler.getSmartHandsPatchCableRemovalResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (smartHandsPatchCableRemoval));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse getSmartHandsCableRequest = smartHandsAPIHandler.getSmartHandsCableRequest(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (getSmartHandsCableRequest));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse getSmartHandsRunCableRequest = smartHandsAPIHandler.getSmartHandsRunJumperCable(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (getSmartHandsRunCableRequest));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse equipmentInstallResponse = smartHandsAPIHandler.getEquipmentInstallResponse(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (equipmentInstallResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse placeOrderResponse = smartHandsAPIHandler.getCageCleanupResponse(authenTokenResponse);
            System.out.println("Response is :: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (placeOrderResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse cageEscortResponse = smartHandsAPIHandler.getCageEscortResponse(authenTokenResponse);
            System.out.println("Response is :: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (cageEscortResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse shipmentUnpackResponse = smartHandsAPIHandler.getShipmentUnpackResponse(authenTokenResponse);
            System.out.println("Response is :: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (shipmentUnpackResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            PlaceOrderResponse smartHandsOtherResponse = smartHandsAPIHandler.getSmartHandsOtherResponse(authenTokenResponse);
            System.out.println("Response is :: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (smartHandsOtherResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            LocationsList locationsResponse = smartHandsAPIHandler.getLocationResponse(authenTokenResponse);
            System.out.println("Response is :: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (locationsResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            SmartHandsList smartHandsList = smartHandsAPIHandler.getSmartHandsList(authenTokenResponse);
            System.out.println("Response is :: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (smartHandsList));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

    }
}