package com.equinix.ecp.config.workVisit;


import com.equinix.ecp.Util;
import com.equinix.ecp.model.workVisit.CagePlaceOrder;
import com.equinix.ecp.model.workVisit.ContactInfo;
import com.equinix.ecp.model.workVisit.IbxLocation;
import com.equinix.ecp.model.workVisit.Schedule;
import com.equinix.ecp.model.workVisit.ServiceDetail;
import com.equinix.ecp.model.workVisit.Visitor;
import com.equinix.ecp.model.workVisit.WorkVisitRequest;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

import static com.equinix.ecp.config.workVisit.WorkVisitRequestExamplesVariables.*;

public class WorkVisitRequestConfig {

    public static String WorkVisitRequestBody() throws JsonProcessingException {

        WorkVisitRequest workVisitRequest = new WorkVisitRequest();
        List<ContactInfo> contactList = new ArrayList<ContactInfo>();

        ContactInfo orderingContact = new ContactInfo();
        orderingContact.setContactType("ORDERING");
        orderingContact.setUserName(ORDERING_USERNAME);
        orderingContact.setName(ORDERING_NAME);
        orderingContact.setEmail(ORDERING_EMAIL);
        orderingContact.setWorkPhone(ORDERING_WORK_PHONE);
        orderingContact.setWorkPhoneCountryCode(ORDERING_WORK_PHONE_COUNTRY_CODE);
        orderingContact.setMobilePhone(ORDERING_MOBILE_NO);
        orderingContact.setMobilePhoneCountryCode(ORDERING_WORK_PHONE_COUNTRY_CODE);
        contactList.add(orderingContact);

        ContactInfo notificationContact = new ContactInfo();
        notificationContact.setContactType("NOTIFICATION");
        notificationContact.setUserName(NOTIFICATION_USERNAME);
        notificationContact.setName(NOTIFICATION_NAME);
        notificationContact.setEmail(NOTIFICATION_EMAIL);
        contactList.add(notificationContact);

        IbxLocation ibxLocation = new IbxLocation();
        ibxLocation.setIbx(IBX);
        List<CagePlaceOrder> cagePlaceOrderList =new ArrayList<>();
        CagePlaceOrder cages =new CagePlaceOrder();

        cages.setAccountNumber(ACCOUNT_NUMBER);
        cages.setCage(CAGE);
        cagePlaceOrderList.add(cages);
        ibxLocation.setCages(cagePlaceOrderList);


        ServiceDetail serviceDetail = new ServiceDetail();

        Schedule schedule = new Schedule();
        schedule.setStartDateTime(SCHEDULE_START_TIME);
        schedule.setEndDateTime(SCHEDULE_END_TIME);
        serviceDetail.setSchedule(schedule);

        Visitor visitor = new Visitor();
        visitor.setUserName(VISITOR_USERNAME);
        visitor.setFirstName(VISITOR_FIRSTNAME);
        visitor.setLastName(VISITOR_LASTNAME);
        visitor.setCompany(VISITOR_COMPANY);
        List<Visitor> visitors = new ArrayList<>();
        visitors.add(visitor);
        serviceDetail.setVisitors(visitors);
        serviceDetail.setOpenCabinet(OPEN_CABINET);

        workVisitRequest.setContacts(contactList);
        workVisitRequest.setIbxLocation(ibxLocation);
        workVisitRequest.setServiceDetails(serviceDetail);

        String WorkVisitReqAsString = Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(workVisitRequest);

        return WorkVisitReqAsString;
    }
}
