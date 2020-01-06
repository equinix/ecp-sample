package com.equinix.ecp.config.shipment;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.shipment.ContactInfo;
import com.equinix.ecp.model.shipment.IbxLocation;
import com.equinix.ecp.model.shipment.InboundServiceDetail;
import com.equinix.ecp.model.shipment.ShipmentCage;
import com.equinix.ecp.model.shipment.Price;
import com.equinix.ecp.model.shipment.InboundShipmentDetails;
import com.equinix.ecp.model.shipment.ShipmentInboundRequest;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.equinix.ecp.config.shipment.InboundShipmentExampleVariables.*;

public class InBoundShipmentRequestConfig {
    public static String ShipmentRequestBody() throws JsonProcessingException{
        ShipmentInboundRequest shipmentInboundRequest = new ShipmentInboundRequest();

        IbxLocation ibxLocation = new IbxLocation();
        ibxLocation.setIbx(IBX);
        ShipmentCage cage = new ShipmentCage();
        cage.setCage(CAGE);
        cage.setAccountNumber(ACCOUNT_NUMBER);
        ibxLocation.setCages(new ArrayList<>(Collections.singleton(cage)));

        InboundServiceDetail inboundServiceDetail = new InboundServiceDetail();
        inboundServiceDetail.setEstimatedDateTime(ESTIMATED_DATE_TIME);
        InboundShipmentDetails inboundShipmentDetails = new InboundShipmentDetails();
        inboundShipmentDetails.setInboundType(SHIPMENT_INBOUND_TYPE);
        inboundShipmentDetails.setNoOfBoxes(NO_OF_BOXES);
        inboundServiceDetail.setShipmentDetails(inboundShipmentDetails);

        ContactInfo orderingContact = new ContactInfo();
        orderingContact.setContactType("ORDERING");
        orderingContact.setUserName(ORDERING_USER_NAME);
        orderingContact.setName(ORDERING_NAME);
        orderingContact.setEmail(ORDERING_EMAIL);
        orderingContact.setWorkPhone(ORDERING_WORK_PHONE);
        orderingContact.setWorkPhoneCountryCode(ORDERING_WORK_PHONE_COUNTRY_CODE);
        orderingContact.setMobilePhone(ORDERING_MOBILE_NO);
        orderingContact.setMobilePhoneCountryCode(ORDERING_MOBILE_COUNTRY_CODE);
        ContactInfo notificationContact = new ContactInfo();
        notificationContact.setContactType("NOTIFICATION");
        notificationContact.setUserName(NOTIFICATION_USERNAME);
        notificationContact.setName(NOTIFICATION_NAME);
        notificationContact.setEmail(NOTIFICATION_EMAIL);
        List<ContactInfo> contactInfoList = new ArrayList<>();
        contactInfoList.add(orderingContact);
        contactInfoList.add(notificationContact);

        Price price = new Price();
        price.setTrackingId(TRACKING_ID);
        price.setiAgree(I_AGREE);

        shipmentInboundRequest.setIbxLocation(ibxLocation);
        shipmentInboundRequest.setServiceDetails(inboundServiceDetail);
        shipmentInboundRequest.setContacts(contactInfoList);
        shipmentInboundRequest.setPrice(price);

        return Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(shipmentInboundRequest);
    }
}
