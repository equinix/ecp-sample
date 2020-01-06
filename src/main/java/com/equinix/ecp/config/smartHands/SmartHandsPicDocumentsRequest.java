package com.equinix.ecp.config.smartHands;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.CrossConnectCages;
import com.equinix.ecp.model.crossconnect.Schedule;
import com.equinix.ecp.model.crossconnect.Ibxlocation;
import com.equinix.ecp.model.smarthands.PurchaseOrder;
import com.equinix.ecp.model.smarthands.SmartHandsPicturesDocument;
import com.equinix.ecp.model.smarthands.SmartHandsServiceDetails;
import com.equinix.ecp.model.troubleTicket.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class SmartHandsPicDocumentsRequest {

    public static String request() throws JsonProcessingException{

        SmartHandsPicturesDocument smartHandsPictureDocument=new SmartHandsPicturesDocument();

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setPurchaseOrderType(SmartHandsPicDocumentsRequestVariables.PURCHASE_ORDER_TYPE);
        smartHandsPictureDocument.setPurchaseOrder(purchaseOrder);

        List<String> cabinets = new ArrayList<>();
        cabinets.add(SmartHandsPicDocumentsRequestVariables.CABINETS);
        CrossConnectCages cage = new CrossConnectCages();
        cage.setCage(SmartHandsPicDocumentsRequestVariables.CAGE);
        cage.setAccountNumber(SmartHandsPicDocumentsRequestVariables.ACCOUNT_NUMBER);
        cage.setCabinets(cabinets);

        List<CrossConnectCages> cageList = new ArrayList<>();
        cageList.add(cage);

        Ibxlocation ibxLocation = new Ibxlocation();
        ibxLocation.setIbx(SmartHandsPicDocumentsRequestVariables.IBX);
        ibxLocation.setCages(cageList);
        smartHandsPictureDocument.setIbxLocation(ibxLocation);

        Contact contactOrdering = new Contact();
        contactOrdering.setContactType("ORDERING");
        contactOrdering.setName(SmartHandsPicDocumentsRequestVariables.ORDERING_NAME);
        contactOrdering.setUserName(SmartHandsPicDocumentsRequestVariables.ORDERING_USERNAME);
        contactOrdering.setEmail(SmartHandsPicDocumentsRequestVariables.ORDERING_EMAIL);
        contactOrdering.setMobilePhone(SmartHandsPicDocumentsRequestVariables.ORDERING_MOBILE_NO);
        contactOrdering.setWorkPhone(SmartHandsPicDocumentsRequestVariables.ORDERING_WORK_PHONE);
        contactOrdering.setWorkPhoneCountryCode(SmartHandsPicDocumentsRequestVariables.ORDERING_WORK_PHONE_COUNTRY_CODE);
        contactOrdering.setMobilePhoneCountryCode(SmartHandsPicDocumentsRequestVariables.ORDERING_MOBILE_COUNTRY_CODE);

        Contact contactTechnical = new Contact();
        contactTechnical.setContactType("TECHNICAL");
        contactTechnical.setUserName(SmartHandsPicDocumentsRequestVariables.TECHNICAL_USERNAME);
        contactTechnical.setName(SmartHandsPicDocumentsRequestVariables.TECHNICAL_NAME);
        contactTechnical.setEmail(SmartHandsPicDocumentsRequestVariables.TECHNICAL_EMAIL);
        contactTechnical.setWorkPhone(SmartHandsPicDocumentsRequestVariables.TECHNICAL_WORK_PHONE);
        contactTechnical.setWorkPhoneCountryCode(SmartHandsPicDocumentsRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        contactTechnical.setWorkPhonePrefToCall(SmartHandsPicDocumentsRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        contactTechnical.setMobilePhone(SmartHandsPicDocumentsRequestVariables.TECHNICAL_MOBILE_NO);
        contactTechnical.setMobilePhoneCountryCode(SmartHandsPicDocumentsRequestVariables.TECHNICAL_MOBILE_COUNTRY_CODE);
        contactTechnical.setMobilePhonePrefToCall(SmartHandsPicDocumentsRequestVariables.TECHNICAL_MOBILE_PREF_TO_CALL);

        Contact contactNotification = new Contact();
        contactNotification.setContactType("NOTIFICATION");
        contactNotification.setName(SmartHandsPicDocumentsRequestVariables.NOTIFICATION_NAME);
        contactNotification.setEmail(SmartHandsPicDocumentsRequestVariables.NOTIFICATION_EMAIL);
        contactNotification.setUserName(SmartHandsPicDocumentsRequestVariables.NOTIFICATION_USERNAME);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contactOrdering);
        contacts.add(contactNotification);
        contacts.add(contactTechnical);
        smartHandsPictureDocument.setContacts(contacts);

        Schedule schedulesSmartHands = new Schedule();
        schedulesSmartHands.setScheduleType(SmartHandsPicDocumentsRequestVariables.SCHEDULE_TYPE);
        schedulesSmartHands.setRequestedStartDate(SmartHandsPicDocumentsRequestVariables.REQUESTED_START_DATE);
        schedulesSmartHands.setRequestedCompletionDate(SmartHandsPicDocumentsRequestVariables.REQUESTED_COMPLETION_DATE);
        schedulesSmartHands.setIbxTimeZone(SmartHandsPicDocumentsRequestVariables.IBX_TIMEZONE);
        smartHandsPictureDocument.setSchedule(schedulesSmartHands);

        SmartHandsServiceDetails serviceDetailsSmartHands = new SmartHandsServiceDetails();
        serviceDetailsSmartHands.setCameraProvidedBy(SmartHandsPicDocumentsRequestVariables.CAMERA_PROVIDED_BY);
        serviceDetailsSmartHands.setSpecificDateAndTime(SmartHandsPicDocumentsRequestVariables.SPECIFIC_DATE_AND_TIME);
        serviceDetailsSmartHands.setDocumentOnly(SmartHandsPicDocumentsRequestVariables.DOCUMENT_ONLY);
        serviceDetailsSmartHands.setDescription(SmartHandsPicDocumentsRequestVariables.PIC_DESCRIPTION);
        serviceDetailsSmartHands.setScopeOfWork(SmartHandsPicDocumentsRequestVariables.SCOPE_OF_WORK);
        smartHandsPictureDocument.setServiceDetails(serviceDetailsSmartHands);

        String request= Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smartHandsPictureDocument);

        return request;

    }
}
