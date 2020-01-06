package com.equinix.ecp.config.smartHands;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.CrossConnectCages;
import com.equinix.ecp.model.crossconnect.Schedule;
import com.equinix.ecp.model.crossconnect.Ibxlocation;
import com.equinix.ecp.model.smarthands.PurchaseOrder;
import com.equinix.ecp.model.smarthands.SmartHandsServiceDetails;
import com.equinix.ecp.model.smarthands.SmartHandsShipmentUnpack;
import com.equinix.ecp.model.troubleTicket.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class SmartHandsShipmentUnpackRequest {

    public static String request() throws JsonProcessingException {

        SmartHandsShipmentUnpack smartHandsShipmentUnpack = new SmartHandsShipmentUnpack();

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setPurchaseOrderType(SmartHandsShipmentUnpackRequestVariables.PURCHASE_ORDER_TYPE);
        smartHandsShipmentUnpack.setPurchaseOrder(purchaseOrder);

        List<String> cabinets = new ArrayList<>();
        cabinets.add(SmartHandsShipmentUnpackRequestVariables.CABINETS);
        CrossConnectCages cage = new CrossConnectCages();
        cage.setCage(SmartHandsShipmentUnpackRequestVariables.CAGE);
        cage.setAccountNumber(SmartHandsShipmentUnpackRequestVariables.ACCOUNT_NUMBER);
        cage.setCabinets(cabinets);

        List<CrossConnectCages> cageList = new ArrayList<>();
        cageList.add(cage);

        Ibxlocation ibxLocation = new Ibxlocation();
        ibxLocation.setIbx(SmartHandsShipmentUnpackRequestVariables.IBX);
        ibxLocation.setCages(cageList);
        smartHandsShipmentUnpack.setIbxLocation(ibxLocation);

        Contact contactOrdering = new Contact();
        contactOrdering.setContactType("ORDERING");
        contactOrdering.setName(SmartHandsShipmentUnpackRequestVariables.ORDERING_NAME);
        contactOrdering.setUserName(SmartHandsShipmentUnpackRequestVariables.ORDERING_USERNAME);
        contactOrdering.setEmail(SmartHandsShipmentUnpackRequestVariables.ORDERING_EMAIL);
        contactOrdering.setMobilePhone(SmartHandsShipmentUnpackRequestVariables.ORDERING_MOBILE_NO);
        contactOrdering.setWorkPhone(SmartHandsShipmentUnpackRequestVariables.ORDERING_WORK_PHONE);
        contactOrdering.setWorkPhoneCountryCode(SmartHandsShipmentUnpackRequestVariables.ORDERING_WORK_PHONE_COUNTRY_CODE);
        contactOrdering.setMobilePhoneCountryCode(SmartHandsShipmentUnpackRequestVariables.ORDERING_MOBILE_COUNTRY_CODE);

        Contact contactTechnical = new Contact();
        contactTechnical.setContactType("TECHNICAL");
        contactTechnical.setUserName(SmartHandsShipmentUnpackRequestVariables.TECHNICAL_USERNAME);
        contactTechnical.setName(SmartHandsShipmentUnpackRequestVariables.TECHNICAL_NAME);
        contactTechnical.setEmail(SmartHandsShipmentUnpackRequestVariables.TECHNICAL_EMAIL);
        contactTechnical.setWorkPhone(SmartHandsShipmentUnpackRequestVariables.TECHNICAL_WORK_PHONE);
        contactTechnical.setWorkPhoneCountryCode(SmartHandsShipmentUnpackRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        contactTechnical.setWorkPhonePrefToCall(SmartHandsShipmentUnpackRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        contactTechnical.setMobilePhone(SmartHandsShipmentUnpackRequestVariables.TECHNICAL_MOBILE_NO);
        contactTechnical.setMobilePhoneCountryCode(SmartHandsShipmentUnpackRequestVariables.TECHNICAL_MOBILE_COUNTRY_CODE);
        contactTechnical.setMobilePhonePrefToCall(SmartHandsShipmentUnpackRequestVariables.TECHNICAL_MOBILE_PREF_TO_CALL);

        Contact contactNotification = new Contact();
        contactNotification.setContactType("NOTIFICATION");
        contactNotification.setName(SmartHandsShipmentUnpackRequestVariables.NOTIFICATION_NAME);
        contactNotification.setEmail(SmartHandsShipmentUnpackRequestVariables.NOTIFICATION_EMAIL);
        contactNotification.setUserName(SmartHandsShipmentUnpackRequestVariables.NOTIFICATION_USERNAME);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contactOrdering);
        contacts.add(contactNotification);
        contacts.add(contactTechnical);
        smartHandsShipmentUnpack.setContacts(contacts);

        Schedule schedulesSmartHands = new Schedule();
        schedulesSmartHands.setScheduleType(SmartHandsShipmentUnpackRequestVariables.SCHEDULE_TYPE);
        schedulesSmartHands.setRequestedStartDate(SmartHandsShipmentUnpackRequestVariables.REQUESTED_START_DATE);
        schedulesSmartHands.setRequestedCompletionDate(SmartHandsShipmentUnpackRequestVariables.REQUESTED_COMPLETION_DATE);
        schedulesSmartHands.setIbxTimeZone(SmartHandsShipmentUnpackRequestVariables.IBX_TIMEZONE);
        smartHandsShipmentUnpack.setSchedule(schedulesSmartHands);

        SmartHandsServiceDetails serviceDetailsSmartHands = new SmartHandsServiceDetails();
        serviceDetailsSmartHands.setScopeOfWork(SmartHandsShipmentUnpackRequestVariables.SCOPE_OF_WORK);
        serviceDetailsSmartHands.setInboundShipmentOrderNumber(SmartHandsShipmentUnpackRequestVariables.INBOUND_SHIPMENT_ORDER_NUMBER);
        serviceDetailsSmartHands.setCopyOfPackingSlipNeeded(SmartHandsShipmentUnpackRequestVariables.COPY_OF_PACKING_SLIP_NEEDED);
        serviceDetailsSmartHands.setDiscardShipmentMaterial(SmartHandsShipmentUnpackRequestVariables.DISCARD_SHIPMENT_MATERIAL);
        smartHandsShipmentUnpack.setServiceDetails(serviceDetailsSmartHands);

        String request = Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smartHandsShipmentUnpack);


        return request;


    }
}
