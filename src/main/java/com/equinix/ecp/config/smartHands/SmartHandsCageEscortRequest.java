package com.equinix.ecp.config.smartHands;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.CrossConnectCages;
import com.equinix.ecp.model.crossconnect.Schedule;
import com.equinix.ecp.model.crossconnect.Ibxlocation;
import com.equinix.ecp.model.smarthands.PurchaseOrder;
import com.equinix.ecp.model.smarthands.SmartHandsCageEscort;
import com.equinix.ecp.model.smarthands.SmartHandsServiceDetails;
import com.equinix.ecp.model.troubleTicket.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class SmartHandsCageEscortRequest {

    public static String request() throws JsonProcessingException{

        SmartHandsCageEscort smartHandsCageEscortRequest=new SmartHandsCageEscort();

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setPurchaseOrderType(SmartHandsCageEscortRequestVariables.PURCHASE_ORDER_TYPE);
        smartHandsCageEscortRequest.setPurchaseOrder(purchaseOrder);

        List<String> cabinets = new ArrayList<>();
        cabinets.add(SmartHandsCageEscortRequestVariables.CABINETS);
        CrossConnectCages cage = new CrossConnectCages();
        cage.setCage(SmartHandsCageEscortRequestVariables.CAGE);
        cage.setAccountNumber(SmartHandsCageEscortRequestVariables.ACCOUNT_NUMBER);
        cage.setCabinets(cabinets);

        List<CrossConnectCages> cageList = new ArrayList<>();
        cageList.add(cage);

        Ibxlocation ibxLocation = new Ibxlocation();
        ibxLocation.setIbx(SmartHandsCageEscortRequestVariables.IBX);
        ibxLocation.setCages(cageList);
        smartHandsCageEscortRequest.setIbxLocation(ibxLocation);

        Contact contactOrdering = new Contact();
        contactOrdering.setContactType("ORDERING");
        contactOrdering.setName(SmartHandsCageEscortRequestVariables.ORDERING_NAME);
        contactOrdering.setUserName(SmartHandsCageEscortRequestVariables.ORDERING_USERNAME);
        contactOrdering.setEmail(SmartHandsCageEscortRequestVariables.ORDERING_EMAIL);
        contactOrdering.setMobilePhone(SmartHandsCageEscortRequestVariables.ORDERING_MOBILE_NO);
        contactOrdering.setWorkPhone(SmartHandsCageEscortRequestVariables.ORDERING_WORK_PHONE);
        contactOrdering.setWorkPhoneCountryCode(SmartHandsCageEscortRequestVariables.ORDERING_WORK_PHONE_COUNTRY_CODE);
        contactOrdering.setMobilePhoneCountryCode(SmartHandsCageEscortRequestVariables.ORDERING_MOBILE_COUNTRY_CODE);

        Contact contactTechnical = new Contact();
        contactTechnical.setContactType("TECHNICAL");
        contactTechnical.setUserName(SmartHandsCageEscortRequestVariables.TECHNICAL_USERNAME);
        contactTechnical.setName(SmartHandsCageEscortRequestVariables.TECHNICAL_NAME);
        contactTechnical.setEmail(SmartHandsCageEscortRequestVariables.TECHNICAL_EMAIL);
        contactTechnical.setWorkPhone(SmartHandsCageEscortRequestVariables.TECHNICAL_WORK_PHONE);
        contactTechnical.setWorkPhoneCountryCode(SmartHandsCageEscortRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        contactTechnical.setWorkPhonePrefToCall(SmartHandsCageEscortRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        contactTechnical.setMobilePhone(SmartHandsCageEscortRequestVariables.TECHNICAL_MOBILE_NO);
        contactTechnical.setMobilePhoneCountryCode(SmartHandsCageEscortRequestVariables.TECHNICAL_MOBILE_COUNTRY_CODE);
        contactTechnical.setMobilePhonePrefToCall(SmartHandsCageEscortRequestVariables.TECHNICAL_MOBILE_PREF_TO_CALL);

        Contact contactNotification = new Contact();
        contactNotification.setContactType("NOTIFICATION");
        contactNotification.setName(SmartHandsCageEscortRequestVariables.NOTIFICATION_NAME);
        contactNotification.setEmail(SmartHandsCageEscortRequestVariables.NOTIFICATION_EMAIL);
        contactNotification.setUserName(SmartHandsCageEscortRequestVariables.NOTIFICATION_USERNAME);
        List<Contact> contacts = new ArrayList<>();
        contacts.add(contactOrdering);
        contacts.add(contactNotification);
        contacts.add(contactTechnical);
        smartHandsCageEscortRequest.setContacts(contacts);

        Schedule schedulesSmartHands = new Schedule();
        schedulesSmartHands.setScheduleType(SmartHandsCageEscortRequestVariables.SCHEDULE_TYPE);
        schedulesSmartHands.setRequestedStartDate(SmartHandsCageEscortRequestVariables.REQUESTED_START_DATE);
        schedulesSmartHands.setRequestedCompletionDate(SmartHandsCageEscortRequestVariables.REQUESTED_COMPLETION_DATE);
        schedulesSmartHands.setIbxTimeZone(SmartHandsCageEscortRequestVariables.IBX_TIMEZONE);

        smartHandsCageEscortRequest.setSchedule(schedulesSmartHands);

        SmartHandsServiceDetails serviceDetailsSmartHands = new SmartHandsServiceDetails();
        serviceDetailsSmartHands.setScopeOfWork(SmartHandsCageEscortRequestVariables.SCOPE_OF_WORK);
        serviceDetailsSmartHands.setOpenCabinetForVisitor(SmartHandsCageEscortRequestVariables.OPEN_CABINET_FOR_VISITOR);
        serviceDetailsSmartHands.setDurationVisit(SmartHandsCageEscortRequestVariables.DURATION_VISIT);
        serviceDetailsSmartHands.setWorkVisitOrderNumber(SmartHandsCageEscortRequestVariables.WORK_VISIT_ORDER_NUMBER);
        serviceDetailsSmartHands.setSupervisionReqForVisitor(SmartHandsCageEscortRequestVariables.SUPERVISION_REQ_FOR_VISITOR);

        smartHandsCageEscortRequest.setServiceDetails(serviceDetailsSmartHands);

        String request= Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smartHandsCageEscortRequest);


        return request;




    }
}
