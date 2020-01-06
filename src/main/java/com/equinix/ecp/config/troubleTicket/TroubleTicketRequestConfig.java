package com.equinix.ecp.config.troubleTicket;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.troubleTicket.*;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class TroubleTicketRequestConfig {

    public static String TroubleTicketRequestBody() throws JsonProcessingException{

        TroubleTicketRequest troubleTicketRequest = new TroubleTicketRequest();

        ServiceDetails serviceDetails = new ServiceDetails();
        Contact orderingContact = new Contact();
        Contact technicalContact = new Contact();
        Contact notificationContact = new Contact();

        Ibxlocation ibxlocation = new Ibxlocation();

        List<Contact> contactList = new ArrayList<Contact>();

        List<String> cabinetsList = new ArrayList<String>();
        cabinetsList.add(TroubleTicketExamplesVariables.CABINET);

        CagePlaceOrder cages=new CagePlaceOrder();
        Cabinet cabinet =new Cabinet();
        cabinet.setCabinet(TroubleTicketExamplesVariables.CABINET);
        List<String> cabinetList=new ArrayList<>();
        cabinetList.add(TroubleTicketExamplesVariables.CABINET);

        cages.setCabinets(cabinetList);
        cages.setAccountNumber(TroubleTicketExamplesVariables.ACCOUNT_NUMBER);
        cages.setCage(TroubleTicketExamplesVariables.CAGE);

        List<CagePlaceOrder> cagePlaceOrderList =new ArrayList<>();
        cagePlaceOrderList.add(cages);

        ibxlocation.setCages(cagePlaceOrderList);
        ibxlocation.setIbx(TroubleTicketExamplesVariables.IBX);

        troubleTicketRequest.setIbxLocation(ibxlocation);
        troubleTicketRequest.setContacts(contactList);

        serviceDetails.setIncidentDateTime(TroubleTicketExamplesVariables.INCIDENT_DATE_TIME);
        serviceDetails.setProblemDetailsCategory(TroubleTicketExamplesVariables.PROBLEM_DETAILS_CATEGORY);
        serviceDetails.setProblemCode(TroubleTicketExamplesVariables.PROBLEM_CODE);
        troubleTicketRequest.setServiceDetails(serviceDetails);

        orderingContact.setContactType("ORDERING");
        orderingContact.setUserName(TroubleTicketExamplesVariables.ORDERING_USERNAME);
        orderingContact.setName(TroubleTicketExamplesVariables.ORDERING_NAME);
        orderingContact.setEmail(TroubleTicketExamplesVariables.ORDERING_EMAIL);
        orderingContact.setWorkPhone(TroubleTicketExamplesVariables.ORDERING_WORK_PHONE);
        orderingContact.setWorkPhoneCountryCode(TroubleTicketExamplesVariables.ORDERING_WORK_PHONE_COUNTRY_CODE);
        orderingContact.setWorkPhonePrefToCall(TroubleTicketExamplesVariables.ORDERING_WORK_NUMBER_PREF_TO_CALL);
        orderingContact.setMobilePhone(TroubleTicketExamplesVariables.ORDERING_MOBILE_NO);
        orderingContact.setMobilePhoneCountryCode(TroubleTicketExamplesVariables.ORDERING_MOBILE_COUNTRY_CODE);
        orderingContact.setMobilePhonePrefToCall(TroubleTicketExamplesVariables.ORDERING_MOBILE_PREF_TO_CALL);
        contactList.add(orderingContact);

        technicalContact.setContactType("TECHNICAL");
        technicalContact.setUserName(TroubleTicketExamplesVariables.TECHNICAL_USERNAME);
        technicalContact.setName(TroubleTicketExamplesVariables.TECHNICAL_NAME);
        technicalContact.setEmail(TroubleTicketExamplesVariables.TECHNICAL_EMAIL);
        technicalContact.setWorkPhone(TroubleTicketExamplesVariables.TECHNICAL_WORK_PHONE);
        technicalContact.setWorkPhoneCountryCode(TroubleTicketExamplesVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        technicalContact.setMobilePhone(TroubleTicketExamplesVariables.TECHNICAL_MOBILE_NO);
        technicalContact.setWorkPhonePrefToCall(TroubleTicketExamplesVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        technicalContact.setMobilePhoneCountryCode(TroubleTicketExamplesVariables.TECHNICAL_MOBILE_COUNTRY_CODE);
        technicalContact.setMobilePhonePrefToCall(TroubleTicketExamplesVariables.TECHNICAL_MOBILE_PREF_TO_CALL);
        contactList.add(technicalContact);

        notificationContact.setContactType("NOTIFICATION");
        notificationContact.setUserName(TroubleTicketExamplesVariables.NOTIFICATION_USERNAME);
        notificationContact.setName(TroubleTicketExamplesVariables.NOTIFICATION_NAME);
        notificationContact.setEmail(TroubleTicketExamplesVariables.NOTIFICATION_EMAIL);
        contactList.add(notificationContact);

        String TroubleTicketReqAsString = Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(troubleTicketRequest);

        return TroubleTicketReqAsString;

    }
}
