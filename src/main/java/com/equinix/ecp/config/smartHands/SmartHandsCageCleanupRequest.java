package com.equinix.ecp.config.smartHands;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.CrossConnectCages;
import com.equinix.ecp.model.crossconnect.Schedule;
import com.equinix.ecp.model.crossconnect.Ibxlocation;
import com.equinix.ecp.model.smarthands.PurchaseOrder;
import com.equinix.ecp.model.smarthands.SmartHandsCageCleanup;
import com.equinix.ecp.model.smarthands.SmartHandsServiceDetails;
import com.equinix.ecp.model.troubleTicket.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class SmartHandsCageCleanupRequest {

    public static String request() throws JsonProcessingException {

        SmartHandsCageCleanup cageCleanupRequest=new SmartHandsCageCleanup();

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setPurchaseOrderType(SmartHandsCageCleanupRequestVariables.PURCHASE_ORDER_TYPE);
        cageCleanupRequest.setPurchaseOrder(purchaseOrder);

        List<String> cabinets = new ArrayList<>();
        cabinets.add(SmartHandsCageCleanupRequestVariables.CABINETS);
        CrossConnectCages cage = new CrossConnectCages();
        cage.setCage(SmartHandsCageCleanupRequestVariables.CAGE);
        cage.setAccountNumber(SmartHandsCageCleanupRequestVariables.ACCOUNT_NUMBER);
        cage.setCabinets(cabinets);

        List<CrossConnectCages> cageList = new ArrayList<>();
        cageList.add(cage);

        Ibxlocation ibxLocation = new Ibxlocation();
        ibxLocation.setIbx(SmartHandsCageCleanupRequestVariables.IBX);
        ibxLocation.setCages(cageList);
        cageCleanupRequest.setIbxLocation(ibxLocation);

        Contact contactOrdering = new Contact();
        contactOrdering.setContactType("ORDERING");
        contactOrdering.setName(SmartHandsCageCleanupRequestVariables.ORDERING_NAME);
        contactOrdering.setUserName(SmartHandsCageCleanupRequestVariables.ORDERING_USERNAME);
        contactOrdering.setEmail(SmartHandsCageCleanupRequestVariables.ORDERING_EMAIL);
        contactOrdering.setMobilePhone(SmartHandsCageCleanupRequestVariables.ORDERING_MOBILE_NO);
        contactOrdering.setWorkPhone(SmartHandsCageCleanupRequestVariables.ORDERING_WORK_PHONE);
        contactOrdering.setWorkPhoneCountryCode(SmartHandsCageCleanupRequestVariables.ORDERING_WORK_PHONE_COUNTRY_CODE);
        contactOrdering.setMobilePhoneCountryCode(SmartHandsCageCleanupRequestVariables.ORDERING_MOBILE_COUNTRY_CODE);

        Contact contactTechnical = new Contact();
        contactTechnical.setContactType("TECHNICAL");
        contactTechnical.setUserName(SmartHandsCageCleanupRequestVariables.TECHNICAL_USERNAME);
        contactTechnical.setName(SmartHandsCageCleanupRequestVariables.TECHNICAL_NAME);
        contactTechnical.setEmail(SmartHandsCageCleanupRequestVariables.TECHNICAL_EMAIL);
        contactTechnical.setWorkPhone(SmartHandsCageCleanupRequestVariables.TECHNICAL_WORK_PHONE);
        contactTechnical.setWorkPhoneCountryCode(SmartHandsCageCleanupRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        contactTechnical.setWorkPhonePrefToCall(SmartHandsCageCleanupRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        contactTechnical.setMobilePhone(SmartHandsCageCleanupRequestVariables.TECHNICAL_MOBILE_NO);
        contactTechnical.setMobilePhoneCountryCode(SmartHandsCageCleanupRequestVariables.TECHNICAL_MOBILE_COUNTRY_CODE);
        contactTechnical.setMobilePhonePrefToCall(SmartHandsCageCleanupRequestVariables.TECHNICAL_MOBILE_PREF_TO_CALL);

        Contact contactNotification = new Contact();
        contactNotification.setContactType("NOTIFICATION");
        contactNotification.setName(SmartHandsCageCleanupRequestVariables.NOTIFICATION_NAME);
        contactNotification.setEmail(SmartHandsCageCleanupRequestVariables.NOTIFICATION_EMAIL);
        contactNotification.setUserName(SmartHandsCageCleanupRequestVariables.NOTIFICATION_USERNAME);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contactOrdering);
        contacts.add(contactNotification);
        contacts.add(contactTechnical);
        cageCleanupRequest.setContacts(contacts);

        Schedule schedulesSmartHands = new Schedule();
        schedulesSmartHands.setScheduleType(SmartHandsCageCleanupRequestVariables.SCHEDULE_TYPE);
        schedulesSmartHands.setRequestedStartDate(SmartHandsCageCleanupRequestVariables.REQUESTED_START_DATE);
        schedulesSmartHands.setRequestedCompletionDate(SmartHandsCageCleanupRequestVariables.REQUESTED_COMPLETION_DATE);
        schedulesSmartHands.setIbxTimeZone(SmartHandsCageCleanupRequestVariables.IBX_TIMEZONE);
        cageCleanupRequest.setSchedule(schedulesSmartHands);

        SmartHandsServiceDetails serviceDetailsSmartHands = new SmartHandsServiceDetails();
        serviceDetailsSmartHands.setScopeOfWork(SmartHandsCageCleanupRequestVariables.SCOPE_OF_WORK);
        serviceDetailsSmartHands.setPermissionToDiscardBoxes(SmartHandsCageCleanupRequestVariables.PERMISSION_TO_DISCARD_BOXES);
        serviceDetailsSmartHands.setDampMoistMopRequired(SmartHandsCageCleanupRequestVariables.DAMP_MOIST_MOP_REQUIRED);

        cageCleanupRequest.setServiceDetails(serviceDetailsSmartHands);

        String request= Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(cageCleanupRequest);

        return request;
    }
}
