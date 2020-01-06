package com.equinix.ecp.config.smartHands;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.CrossConnectCages;
import com.equinix.ecp.model.crossconnect.Schedule;
import com.equinix.ecp.model.crossconnect.Ibxlocation;
import com.equinix.ecp.model.smarthands.PurchaseOrder;
import com.equinix.ecp.model.smarthands.SmartHandsServiceDetails;
import com.equinix.ecp.model.smarthands.SmartHandsOther;
import com.equinix.ecp.model.troubleTicket.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class SmartHandsOtherRequest {

    public static String request() throws JsonProcessingException {

        SmartHandsOther smartHandsOther =new SmartHandsOther();

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setPurchaseOrderType(SmartHandsCommon.PURCHASE_ORDER_TYPE);

        smartHandsOther.setPurchaseOrder(purchaseOrder);

        List<String> cabinets = new ArrayList<>();
        cabinets.add(SmartHandsCommon.CABINETS);
        CrossConnectCages cage = new CrossConnectCages();
        cage.setCage(SmartHandsCommon.CAGE);
        cage.setAccountNumber(SmartHandsCommon.ACCOUNT_NUMBER);
        cage.setCabinets(cabinets);

        List<CrossConnectCages> cageList = new ArrayList<>();
        cageList.add(cage);

        Ibxlocation ibxLocation = new Ibxlocation();
        ibxLocation.setIbx(SmartHandsCommon.IBX);
        ibxLocation.setCages(cageList);
        smartHandsOther.setIbxLocation(ibxLocation);

        Contact contactOrdering = new Contact();
        contactOrdering.setContactType("ORDERING");
        contactOrdering.setName(SmartHandsCommon.ORDERING_NAME);
        contactOrdering.setUserName(SmartHandsCommon.ORDERING_USERNAME);
        contactOrdering.setEmail(SmartHandsCommon.ORDERING_EMAIL);
        contactOrdering.setMobilePhone(SmartHandsCommon.ORDERING_MOBILE_NO);
        contactOrdering.setWorkPhone(SmartHandsCommon.ORDERING_WORK_PHONE);
        contactOrdering.setWorkPhoneCountryCode(SmartHandsCommon.ORDERING_WORK_PHONE_COUNTRY_CODE);
        contactOrdering.setMobilePhoneCountryCode(SmartHandsCommon.ORDERING_MOBILE_COUNTRY_CODE);

        Contact contactTechnical = new Contact();
        contactTechnical.setContactType("TECHNICAL");
        contactTechnical.setUserName(SmartHandsCommon.TECHNICAL_USERNAME);
        contactTechnical.setName(SmartHandsCommon.TECHNICAL_NAME);
        contactTechnical.setEmail(SmartHandsCommon.TECHNICAL_EMAIL);
        contactTechnical.setWorkPhone(SmartHandsCommon.TECHNICAL_WORK_PHONE);
        contactTechnical.setWorkPhoneCountryCode(SmartHandsCommon.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        contactTechnical.setWorkPhonePrefToCall(SmartHandsCommon.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        contactTechnical.setMobilePhone(SmartHandsCommon.TECHNICAL_MOBILE_NO);
        contactTechnical.setMobilePhoneCountryCode(SmartHandsCommon.TECHNICAL_MOBILE_COUNTRY_CODE);
        contactTechnical.setMobilePhonePrefToCall(SmartHandsCommon.TECHNICAL_MOBILE_PREF_TO_CALL);

        Contact contactNotification = new Contact();
        contactNotification.setContactType("NOTIFICATION");
        contactNotification.setName(SmartHandsCommon.NOTIFICATION_NAME);
        contactNotification.setEmail(SmartHandsCommon.NOTIFICATION_EMAIL);
        contactNotification.setUserName(SmartHandsCommon.NOTIFICATION_USERNAME);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contactOrdering);
        contacts.add(contactNotification);
        contacts.add(contactTechnical);
        smartHandsOther.setContacts(contacts);

        Schedule schedulesSmartHands = new Schedule();
        schedulesSmartHands.setScheduleType(SmartHandsCommon.SCHEDULE_TYPE);
        schedulesSmartHands.setRequestedStartDate(SmartHandsCommon.REQUESTED_START_DATE);
        schedulesSmartHands.setRequestedCompletionDate(SmartHandsCommon.REQUESTED_COMPLETION_DATE);
        schedulesSmartHands.setIbxTimeZone(SmartHandsCommon.IBX_TIMEZONE);
        smartHandsOther.setSchedule(schedulesSmartHands);

        SmartHandsServiceDetails serviceDetailsSmartHands = new SmartHandsServiceDetails();
        serviceDetailsSmartHands.setScopeOfWork(SmartHandsCommon.SCOPE_OF_WORK);
        smartHandsOther.setServiceDetails(serviceDetailsSmartHands);

        String request= Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smartHandsOther);

        return request;

    }
}
