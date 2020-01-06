package com.equinix.ecp.examples;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.model.shipment.ShipmentInboundResponse;
import com.equinix.ecp.model.shipment.ShipmentLocationResponse;
import com.equinix.ecp.model.shipment.ShipmentOutboundResponse;
import com.equinix.ecp.service.ShipmentAPIHandler;

public class ShipmentExample {

    private static AuthenTokenResponse authenTokenResponse;

    public static void main(String[] args){
        ShipmentAPIHandler shipmentAPIHandler = new ShipmentAPIHandler();

        try{
            authenTokenResponse = Util.createToken();
            System.out.println("Response is: \n" + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(authenTokenResponse));
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("authentication Response Error is " + e.getMessage());
        }

        try {
            ShipmentOutboundResponse shipmentOutbound = shipmentAPIHandler.getShipmentOutbound(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (shipmentOutbound));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            ShipmentLocationResponse shipmentLocation = shipmentAPIHandler.getShipmentLocation(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (shipmentLocation));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            ShipmentInboundResponse shipmentInbound = shipmentAPIHandler.getShipmentInbound(authenTokenResponse);
            System.out.println("Response is : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (shipmentInbound));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }
    }
}
