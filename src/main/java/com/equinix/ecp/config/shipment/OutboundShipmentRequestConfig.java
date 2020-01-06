package com.equinix.ecp.config.shipment;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.shipment.ContactInfo;
import com.equinix.ecp.model.shipment.IbxLocation;
import com.equinix.ecp.model.shipment.OutboundServiceDetail;
import com.equinix.ecp.model.shipment.OutboundShipmentDetails;
import com.equinix.ecp.model.shipment.ShipmentCage;
import com.equinix.ecp.model.shipment.ShipmentOutboundRequest;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.equinix.ecp.config.shipment.OutboundShipmentExampleVariables.*;

public class OutboundShipmentRequestConfig {
    public static String ShipmentRequestBody() throws JsonProcessingException {
        ShipmentOutboundRequest shipmentOutboundRequest = new ShipmentOutboundRequest();

        IbxLocation ibxLocation = new IbxLocation();
        ibxLocation.setIbx(IBX);
        ShipmentCage cage = new ShipmentCage();
        cage.setCage(CAGE);
        cage.setAccountNumber(ACCOUNT_NUMBER);
        ibxLocation.setCages(new ArrayList<>(Collections.singleton(cage)));

        OutboundServiceDetail outboundServiceDetail = new OutboundServiceDetail();
        outboundServiceDetail.setEstimatedDateTime(ESTIMATED_DATE_TIME);
        OutboundShipmentDetails shipmentDetails = new OutboundShipmentDetails();
        shipmentDetails.setOutboundType(SHIPMENT_OUTBOUND_TYPE);
        shipmentDetails.setNoOfBoxes(NO_OF_BOXES);
        outboundServiceDetail.setShipmentDetails(shipmentDetails);

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

        shipmentOutboundRequest.setIbxLocation(ibxLocation);
        shipmentOutboundRequest.setServiceDetails(outboundServiceDetail);
        shipmentOutboundRequest.setContacts(contactInfoList);

        return Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(shipmentOutboundRequest);
    }
}
