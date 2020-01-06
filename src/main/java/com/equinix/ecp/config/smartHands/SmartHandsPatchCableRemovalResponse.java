package com.equinix.ecp.config.smartHands;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.*;
import com.equinix.ecp.model.smarthands.CrossConnect;
import com.equinix.ecp.model.smarthands.PurchaseOrder;
import com.equinix.ecp.model.smarthands.SmartHandsPatchCableRemoval;
import com.equinix.ecp.model.smarthands.SmartHandsServiceDetails;
import com.equinix.ecp.model.troubleTicket.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class SmartHandsPatchCableRemovalResponse {

    public static String request() throws JsonProcessingException{

        SmartHandsPatchCableRemoval smartHandsPatchCableRemoval=new SmartHandsPatchCableRemoval();

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setPurchaseOrderType(SmartHandsPatchCableRemovalResponseVariables.PURCHASE_ORDER_TYPE);
        smartHandsPatchCableRemoval.setPurchaseOrder(purchaseOrder);

        List<String> cabinets = new ArrayList<>();
        cabinets.add(SmartHandsPatchCableRemovalResponseVariables.CABINETS);
        CrossConnectCages cage = new CrossConnectCages();
        cage.setCage(SmartHandsPatchCableRemovalResponseVariables.CAGE);
        cage.setAccountNumber(SmartHandsPatchCableRemovalResponseVariables.ACCOUNT_NUMBER);
        cage.setCabinets(cabinets);

        List<CrossConnectCages> cageList = new ArrayList<>();
        cageList.add(cage);

        Ibxlocation ibxLocation = new Ibxlocation();
        ibxLocation.setIbx(SmartHandsPatchCableRemovalResponseVariables.IBX);
        ibxLocation.setCages(cageList);
        smartHandsPatchCableRemoval.setIbxLocation(ibxLocation);

        Contact contactOrdering = new Contact();
        contactOrdering.setContactType("ORDERING");
        contactOrdering.setName(SmartHandsPatchCableRemovalResponseVariables.ORDERING_NAME);
        contactOrdering.setUserName(SmartHandsPatchCableRemovalResponseVariables.ORDERING_USERNAME);
        contactOrdering.setEmail(SmartHandsPatchCableRemovalResponseVariables.ORDERING_EMAIL);
        contactOrdering.setMobilePhone(SmartHandsPatchCableRemovalResponseVariables.ORDERING_MOBILE_NO);
        contactOrdering.setWorkPhone(SmartHandsPatchCableRemovalResponseVariables.ORDERING_WORK_PHONE);
        contactOrdering.setWorkPhoneCountryCode(SmartHandsPatchCableRemovalResponseVariables.ORDERING_WORK_PHONE_COUNTRY_CODE);
        contactOrdering.setMobilePhoneCountryCode(SmartHandsPatchCableRemovalResponseVariables.ORDERING_MOBILE_COUNTRY_CODE);

        Contact contactTechnical = new Contact();
        contactTechnical.setContactType("TECHNICAL");
        contactTechnical.setUserName(SmartHandsPatchCableRemovalResponseVariables.TECHNICAL_USERNAME);
        contactTechnical.setName(SmartHandsPatchCableRemovalResponseVariables.TECHNICAL_NAME);
        contactTechnical.setEmail(SmartHandsPatchCableRemovalResponseVariables.TECHNICAL_EMAIL);
        contactTechnical.setWorkPhone(SmartHandsPatchCableRemovalResponseVariables.TECHNICAL_WORK_PHONE);
        contactTechnical.setWorkPhoneCountryCode(SmartHandsPatchCableRemovalResponseVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        contactTechnical.setWorkPhonePrefToCall(SmartHandsPatchCableRemovalResponseVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        contactTechnical.setMobilePhone(SmartHandsPatchCableRemovalResponseVariables.TECHNICAL_MOBILE_NO);
        contactTechnical.setMobilePhoneCountryCode(SmartHandsPatchCableRemovalResponseVariables.TECHNICAL_MOBILE_COUNTRY_CODE);
        contactTechnical.setMobilePhonePrefToCall(SmartHandsPatchCableRemovalResponseVariables.TECHNICAL_MOBILE_PREF_TO_CALL);

        Contact contactNotification = new Contact();
        contactNotification.setContactType("NOTIFICATION");
        contactNotification.setName(SmartHandsPatchCableRemovalResponseVariables.NOTIFICATION_NAME);
        contactNotification.setEmail(SmartHandsPatchCableRemovalResponseVariables.NOTIFICATION_EMAIL);
        contactNotification.setUserName(SmartHandsPatchCableRemovalResponseVariables.NOTIFICATION_USERNAME);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contactOrdering);
        contacts.add(contactNotification);
        contacts.add(contactTechnical);
        smartHandsPatchCableRemoval.setContacts(contacts);

        Schedule schedulesSmartHands = new Schedule();
        schedulesSmartHands.setScheduleType(SmartHandsPatchCableRemovalResponseVariables.SCHEDULE_TYPE);
        schedulesSmartHands.setRequestedStartDate(SmartHandsPatchCableRemovalResponseVariables.REQUESTED_START_DATE);
        schedulesSmartHands.setRequestedCompletionDate(SmartHandsPatchCableRemovalResponseVariables.REQUESTED_COMPLETION_DATE);
        schedulesSmartHands.setIbxTimeZone(SmartHandsPatchCableRemovalResponseVariables.IBX_TIMEZONE);
        smartHandsPatchCableRemoval.setSchedule(schedulesSmartHands);

        CrossConnect crossConnect =new CrossConnect();
        crossConnect.setSerialNumber(SmartHandsPatchCableRemovalResponseVariables.SERIAL_NUMBER);
        crossConnect.setDeviceCabinet(SmartHandsPatchCableRemovalResponseVariables.DEVICE_CABINET);
        crossConnect.setDeviceConnectorType(SmartHandsPatchCableRemovalResponseVariables.DEVICE_CONNECTOR_TYPE);
        crossConnect.setDeviceDetails(SmartHandsPatchCableRemovalResponseVariables.DEVICE_DETAILS);
        crossConnect.setDevicePort(SmartHandsPatchCableRemovalResponseVariables.DEVICE_PORT);
        List<CrossConnect> crossConnectList =new ArrayList<>();
        crossConnectList.add(crossConnect);

        SmartHandsServiceDetails smartHandsServiceDetails=new SmartHandsServiceDetails();
        smartHandsServiceDetails.setCrossConnects(crossConnectList);
        smartHandsPatchCableRemoval.setServiceDetails(smartHandsServiceDetails);

        String request= Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smartHandsPatchCableRemoval);

        return request;

    }
}
