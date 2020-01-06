package com.equinix.ecp.config.smartHands;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.CrossConnectCages;
import com.equinix.ecp.model.crossconnect.Schedule;
import com.equinix.ecp.model.crossconnect.Ibxlocation;
 import com.equinix.ecp.model.smarthands.PurchaseOrder;
import com.equinix.ecp.model.smarthands.SmartHandsCable;
import com.equinix.ecp.model.smarthands.SmartHandsServiceDetails;
import com.equinix.ecp.model.troubleTicket.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class SmartHandsCableRequest {

    public static String request() throws JsonProcessingException{

        SmartHandsCable smartHandsCable =new SmartHandsCable();

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setPurchaseOrderType(SmartHandsCableRequestVariable.PURCHASE_ORDER_TYPE);
        smartHandsCable.setPurchaseOrder(purchaseOrder);

        List<String> cabinets = new ArrayList<>();
        cabinets.add(SmartHandsCableRequestVariable.CABINETS);
        CrossConnectCages cage = new CrossConnectCages();
        cage.setCage(SmartHandsCableRequestVariable.CAGE);
        cage.setAccountNumber(SmartHandsCableRequestVariable.ACCOUNT_NUMBER);
        cage.setCabinets(cabinets);

        List<CrossConnectCages> cageList = new ArrayList<>();
        cageList.add(cage);

        Ibxlocation ibxLocation = new Ibxlocation();
        ibxLocation.setIbx(SmartHandsCableRequestVariable.IBX);
        ibxLocation.setCages(cageList);
        smartHandsCable.setIbxLocation(ibxLocation);

        Contact contactOrdering = new Contact();
        contactOrdering.setContactType("ORDERING");
        contactOrdering.setName(SmartHandsCableRequestVariable.ORDERING_NAME);
        contactOrdering.setUserName(SmartHandsCableRequestVariable.ORDERING_USERNAME);
        contactOrdering.setEmail(SmartHandsCableRequestVariable.ORDERING_EMAIL);
        contactOrdering.setMobilePhone(SmartHandsCableRequestVariable.ORDERING_MOBILE_NO);
        contactOrdering.setWorkPhone(SmartHandsCableRequestVariable.ORDERING_WORK_PHONE);
        contactOrdering.setWorkPhoneCountryCode(SmartHandsCableRequestVariable.ORDERING_WORK_PHONE_COUNTRY_CODE);
        contactOrdering.setMobilePhoneCountryCode(SmartHandsCableRequestVariable.ORDERING_MOBILE_COUNTRY_CODE);

        Contact contactTechnical = new Contact();
        contactTechnical.setContactType("TECHNICAL");
        contactTechnical.setUserName(SmartHandsCableRequestVariable.TECHNICAL_USERNAME);
        contactTechnical.setName(SmartHandsCableRequestVariable.TECHNICAL_NAME);
        contactTechnical.setEmail(SmartHandsCableRequestVariable.TECHNICAL_EMAIL);
        contactTechnical.setWorkPhone(SmartHandsCableRequestVariable.TECHNICAL_WORK_PHONE);
        contactTechnical.setWorkPhoneCountryCode(SmartHandsCableRequestVariable.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        contactTechnical.setWorkPhonePrefToCall(SmartHandsCableRequestVariable.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        contactTechnical.setMobilePhone(SmartHandsCableRequestVariable.TECHNICAL_MOBILE_NO);
        contactTechnical.setMobilePhoneCountryCode(SmartHandsCableRequestVariable.TECHNICAL_MOBILE_COUNTRY_CODE);
        contactTechnical.setMobilePhonePrefToCall(SmartHandsCableRequestVariable.TECHNICAL_MOBILE_PREF_TO_CALL);

        Contact contactNotification = new Contact();
        contactNotification.setContactType("NOTIFICATION");
        contactNotification.setName(SmartHandsCableRequestVariable.NOTIFICATION_NAME);
        contactNotification.setEmail(SmartHandsCableRequestVariable.NOTIFICATION_EMAIL);
        contactNotification.setUserName(SmartHandsCableRequestVariable.NOTIFICATION_USERNAME);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contactOrdering);
        contacts.add(contactNotification);
        contacts.add(contactTechnical);
        smartHandsCable.setContacts(contacts);

        Schedule schedulesSmartHands = new Schedule();
        schedulesSmartHands.setScheduleType(SmartHandsCableRequestVariable.SCHEDULE_TYPE);
        schedulesSmartHands.setRequestedStartDate(SmartHandsCableRequestVariable.REQUESTED_START_DATE);
        schedulesSmartHands.setRequestedCompletionDate(SmartHandsCableRequestVariable.REQUESTED_COMPLETION_DATE);
        schedulesSmartHands.setIbxTimeZone(SmartHandsCableRequestVariable.IBX_TIMEZONE);
        smartHandsCable.setSchedule(schedulesSmartHands);

        SmartHandsServiceDetails serviceDetailsSmartHands = new SmartHandsServiceDetails();
        serviceDetailsSmartHands.setQuantity(SmartHandsCableRequestVariable.QUANTITY);
        serviceDetailsSmartHands.setScopeOfWork(SmartHandsCableRequestVariable.MEDIA_TYPE);
        serviceDetailsSmartHands.setScopeOfWork(SmartHandsCableRequestVariable.CONNECTOR_TYPE);
        serviceDetailsSmartHands.setScopeOfWork(SmartHandsCableRequestVariable.LENGTH);
        serviceDetailsSmartHands.setScopeOfWork(SmartHandsCableRequestVariable.SCOPE_OF_WORK);
        smartHandsCable.setServiceDetails(serviceDetailsSmartHands);

        String request= Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smartHandsCable);

        return request;

    }
}
