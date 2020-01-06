package com.equinix.ecp.config.smartHands;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.*;
import com.equinix.ecp.model.smarthands.CrossConnect;
import com.equinix.ecp.model.smarthands.PurchaseOrder;
import com.equinix.ecp.model.smarthands.SmartHandsPatchCableInstall;
import com.equinix.ecp.model.smarthands.SmartHandsServiceDetails;
import com.equinix.ecp.model.troubleTicket.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class SmartHandsPatchCableInstallRequest {

    public static String request() throws JsonProcessingException{

        SmartHandsPatchCableInstall smartHandsPatchCableInstall=new SmartHandsPatchCableInstall();

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setPurchaseOrderType(SmartHandsPatchCableInstallRequestVariables.PURCHASE_ORDER_TYPE);
        smartHandsPatchCableInstall.setPurchaseOrder(purchaseOrder);

        List<String> cabinets = new ArrayList<>();
        cabinets.add(SmartHandsPatchCableInstallRequestVariables.CABINETS);
        CrossConnectCages cage = new CrossConnectCages();
        cage.setCage(SmartHandsPatchCableInstallRequestVariables.CAGE);
        cage.setAccountNumber(SmartHandsPatchCableInstallRequestVariables.ACCOUNT_NUMBER);
        cage.setCabinets(cabinets);

        List<CrossConnectCages> cageList = new ArrayList<>();
        cageList.add(cage);

        Ibxlocation ibxLocation = new Ibxlocation();
        ibxLocation.setIbx(SmartHandsPatchCableInstallRequestVariables.IBX);
        ibxLocation.setCages(cageList);
        smartHandsPatchCableInstall.setIbxLocation(ibxLocation);

        Contact contactOrdering = new Contact();
        contactOrdering.setContactType("ORDERING");
        contactOrdering.setName(SmartHandsPatchCableInstallRequestVariables.ORDERING_NAME);
        contactOrdering.setUserName(SmartHandsPatchCableInstallRequestVariables.ORDERING_USERNAME);
        contactOrdering.setEmail(SmartHandsPatchCableInstallRequestVariables.ORDERING_EMAIL);
        contactOrdering.setMobilePhone(SmartHandsPatchCableInstallRequestVariables.ORDERING_MOBILE_NO);
        contactOrdering.setWorkPhone(SmartHandsPatchCableInstallRequestVariables.ORDERING_WORK_PHONE);
        contactOrdering.setWorkPhoneCountryCode(SmartHandsPatchCableInstallRequestVariables.ORDERING_WORK_PHONE_COUNTRY_CODE);
        contactOrdering.setMobilePhoneCountryCode(SmartHandsPatchCableInstallRequestVariables.ORDERING_MOBILE_COUNTRY_CODE);

        Contact contactTechnical = new Contact();
        contactTechnical.setContactType("TECHNICAL");
        contactTechnical.setUserName(SmartHandsPatchCableInstallRequestVariables.TECHNICAL_USERNAME);
        contactTechnical.setName(SmartHandsPatchCableInstallRequestVariables.TECHNICAL_NAME);
        contactTechnical.setEmail(SmartHandsPatchCableInstallRequestVariables.TECHNICAL_EMAIL);
        contactTechnical.setWorkPhone(SmartHandsPatchCableInstallRequestVariables.TECHNICAL_WORK_PHONE);
        contactTechnical.setWorkPhoneCountryCode(SmartHandsPatchCableInstallRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        contactTechnical.setWorkPhonePrefToCall(SmartHandsPatchCableInstallRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        contactTechnical.setMobilePhone(SmartHandsPatchCableInstallRequestVariables.TECHNICAL_MOBILE_NO);
        contactTechnical.setMobilePhoneCountryCode(SmartHandsPatchCableInstallRequestVariables.TECHNICAL_MOBILE_COUNTRY_CODE);
        contactTechnical.setMobilePhonePrefToCall(SmartHandsPatchCableInstallRequestVariables.TECHNICAL_MOBILE_PREF_TO_CALL);

        Contact contactNotification = new Contact();
        contactNotification.setContactType("NOTIFICATION");
        contactNotification.setName(SmartHandsPatchCableInstallRequestVariables.NOTIFICATION_NAME);
        contactNotification.setEmail(SmartHandsPatchCableInstallRequestVariables.NOTIFICATION_EMAIL);
        contactNotification.setUserName(SmartHandsPatchCableInstallRequestVariables.NOTIFICATION_USERNAME);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contactOrdering);
        contacts.add(contactNotification);
        contacts.add(contactTechnical);
        smartHandsPatchCableInstall.setContacts(contacts);

        Schedule schedulesSmartHands = new Schedule();
        schedulesSmartHands.setScheduleType(SmartHandsPatchCableInstallRequestVariables.SCHEDULE_TYPE);
        schedulesSmartHands.setRequestedStartDate(SmartHandsPatchCableInstallRequestVariables.REQUESTED_START_DATE);
        schedulesSmartHands.setRequestedCompletionDate(SmartHandsPatchCableInstallRequestVariables.REQUESTED_COMPLETION_DATE);
        schedulesSmartHands.setIbxTimeZone(SmartHandsPatchCableInstallRequestVariables.IBX_TIMEZONE);
        smartHandsPatchCableInstall.setSchedule(schedulesSmartHands);

        CrossConnect crossConnect =new CrossConnect();
        crossConnect.setSerialNumber(SmartHandsPatchCableInstallRequestVariables.SERIAL_NUMBER);
        crossConnect.setDeviceCabinet(SmartHandsPatchCableInstallRequestVariables.DEVICE_CABINET);
        crossConnect.setDeviceConnectorType(SmartHandsPatchCableInstallRequestVariables.DEVICE_CONNECTOR_TYPE);
        crossConnect.setDeviceDetails(SmartHandsPatchCableInstallRequestVariables.DEVICE_DETAILS);
        crossConnect.setDevicePort(SmartHandsPatchCableInstallRequestVariables.DEVICE_PORT);
        crossConnect.setLightLinkVerification(SmartHandsPatchCableInstallRequestVariables.LIGHT_LINK_VERIFICATION);

        List<CrossConnect> crossConnectList =new ArrayList<>();
        crossConnectList.add(crossConnect);

        SmartHandsServiceDetails smartHandsServiceDetails=new SmartHandsServiceDetails();
        smartHandsServiceDetails.setCrossConnects(crossConnectList);
        smartHandsPatchCableInstall.setServiceDetails(smartHandsServiceDetails);

        String request= Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smartHandsPatchCableInstall);

        return request;

    }
}
