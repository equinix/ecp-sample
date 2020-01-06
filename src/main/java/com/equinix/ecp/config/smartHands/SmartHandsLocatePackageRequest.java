package com.equinix.ecp.config.smartHands;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.CrossConnectCages;
import com.equinix.ecp.model.crossconnect.Schedule;
import com.equinix.ecp.model.crossconnect.Ibxlocation;
import com.equinix.ecp.model.smarthands.PurchaseOrder;
import com.equinix.ecp.model.smarthands.SmartHandsServiceDetails;
import com.equinix.ecp.model.smarthands.SmartHandsLocatePackage;
import com.equinix.ecp.model.troubleTicket.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class SmartHandsLocatePackageRequest {

    public static String request() throws JsonProcessingException{

        SmartHandsLocatePackage smartHandsLocatePackage=new SmartHandsLocatePackage();

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setPurchaseOrderType(SmartHandsLocatePackageRequestVariables.PURCHASE_ORDER_TYPE);
        smartHandsLocatePackage.setPurchaseOrder(purchaseOrder);

        List<String> cabinets = new ArrayList<>();
        cabinets.add(SmartHandsLocatePackageRequestVariables.CABINETS);
        CrossConnectCages cage = new CrossConnectCages();
        cage.setCage(SmartHandsLocatePackageRequestVariables.CAGE);
        cage.setAccountNumber(SmartHandsLocatePackageRequestVariables.ACCOUNT_NUMBER);
        cage.setCabinets(cabinets);

        List<CrossConnectCages> cageList = new ArrayList<>();
        cageList.add(cage);

        Ibxlocation ibxLocation = new Ibxlocation();
        ibxLocation.setIbx(SmartHandsLocatePackageRequestVariables.IBX);
        ibxLocation.setCages(cageList);
        smartHandsLocatePackage.setIbxLocation(ibxLocation);

        Contact contactOrdering = new Contact();
        contactOrdering.setContactType("ORDERING");
        contactOrdering.setName(SmartHandsLocatePackageRequestVariables.ORDERING_NAME);
        contactOrdering.setUserName(SmartHandsLocatePackageRequestVariables.ORDERING_USERNAME);
        contactOrdering.setEmail(SmartHandsLocatePackageRequestVariables.ORDERING_EMAIL);
        contactOrdering.setMobilePhone(SmartHandsLocatePackageRequestVariables.ORDERING_MOBILE_NO);
        contactOrdering.setWorkPhone(SmartHandsLocatePackageRequestVariables.ORDERING_WORK_PHONE);
        contactOrdering.setWorkPhoneCountryCode(SmartHandsLocatePackageRequestVariables.ORDERING_WORK_PHONE_COUNTRY_CODE);
        contactOrdering.setMobilePhoneCountryCode(SmartHandsLocatePackageRequestVariables.ORDERING_MOBILE_COUNTRY_CODE);

        Contact contactTechnical = new Contact();
        contactTechnical.setContactType("TECHNICAL");
        contactTechnical.setUserName(SmartHandsLocatePackageRequestVariables.TECHNICAL_USERNAME);
        contactTechnical.setName(SmartHandsLocatePackageRequestVariables.TECHNICAL_NAME);
        contactTechnical.setEmail(SmartHandsLocatePackageRequestVariables.TECHNICAL_EMAIL);
        contactTechnical.setWorkPhone(SmartHandsLocatePackageRequestVariables.TECHNICAL_WORK_PHONE);
        contactTechnical.setWorkPhoneCountryCode(SmartHandsLocatePackageRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        contactTechnical.setWorkPhonePrefToCall(SmartHandsLocatePackageRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        contactTechnical.setMobilePhone(SmartHandsLocatePackageRequestVariables.TECHNICAL_MOBILE_NO);
        contactTechnical.setMobilePhoneCountryCode(SmartHandsLocatePackageRequestVariables.TECHNICAL_MOBILE_COUNTRY_CODE);
        contactTechnical.setMobilePhonePrefToCall(SmartHandsLocatePackageRequestVariables.TECHNICAL_MOBILE_PREF_TO_CALL);

        Contact contactNotification = new Contact();
        contactNotification.setContactType("NOTIFICATION");
        contactNotification.setName(SmartHandsLocatePackageRequestVariables.NOTIFICATION_NAME);
        contactNotification.setEmail(SmartHandsLocatePackageRequestVariables.NOTIFICATION_EMAIL);
        contactNotification.setUserName(SmartHandsLocatePackageRequestVariables.NOTIFICATION_USERNAME);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contactOrdering);
        contacts.add(contactNotification);
        contacts.add(contactTechnical);
        smartHandsLocatePackage.setContacts(contacts);

        Schedule schedulesSmartHands = new Schedule();
        schedulesSmartHands.setScheduleType(SmartHandsLocatePackageRequestVariables.SCHEDULE_TYPE);
        schedulesSmartHands.setRequestedStartDate(SmartHandsLocatePackageRequestVariables.REQUESTED_START_DATE);
        schedulesSmartHands.setRequestedCompletionDate(SmartHandsLocatePackageRequestVariables.REQUESTED_COMPLETION_DATE);
        schedulesSmartHands.setIbxTimeZone(SmartHandsLocatePackageRequestVariables.IBX_TIMEZONE);
        smartHandsLocatePackage.setSchedule(schedulesSmartHands);

        SmartHandsServiceDetails serviceDetailsSmartHands = new SmartHandsServiceDetails();
        serviceDetailsSmartHands.setShipmentOrderNumber(SmartHandsLocatePackageRequestVariables.SHIPMENT_ORDER_NUMBER);
        serviceDetailsSmartHands.setTrackingNumber(SmartHandsLocatePackageRequestVariables.TRACKING_NUMBER);
        serviceDetailsSmartHands.setPossibleLocation(SmartHandsLocatePackageRequestVariables.POSSIBLE_LOCATION);
        serviceDetailsSmartHands.setPackageDescription(SmartHandsLocatePackageRequestVariables.PACKAGE_DESCRIPTION);
        serviceDetailsSmartHands.setScopeOfWork(SmartHandsLocatePackageRequestVariables.SCOPE_OF_WORK);

        smartHandsLocatePackage.setServiceDetails(serviceDetailsSmartHands);

        String request= Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smartHandsLocatePackage);

        return request;



    }
}
