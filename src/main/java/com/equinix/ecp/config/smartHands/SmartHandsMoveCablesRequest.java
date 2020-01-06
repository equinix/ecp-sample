package com.equinix.ecp.config.smartHands;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.CrossConnectCages;
import com.equinix.ecp.model.crossconnect.Schedule;
import com.equinix.ecp.model.crossconnect.Ibxlocation;
import com.equinix.ecp.model.smarthands.DeviceDetail;
import com.equinix.ecp.model.smarthands.PurchaseOrder;
import com.equinix.ecp.model.smarthands.SmartHandsMoveCables;
import com.equinix.ecp.model.smarthands.SmartHandsServiceDetails;
import com.equinix.ecp.model.troubleTicket.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class SmartHandsMoveCablesRequest {

    public static String request() throws JsonProcessingException {

        SmartHandsMoveCables smartHandsMoveCables=new SmartHandsMoveCables();

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setPurchaseOrderType(SmartHandsMoveCablesRequestVariables.PURCHASE_ORDER_TYPE);
        smartHandsMoveCables.setPurchaseOrder(purchaseOrder);

        List<String> cabinets = new ArrayList<>();
        cabinets.add(SmartHandsMoveCablesRequestVariables.CABINETS);
        CrossConnectCages cage = new CrossConnectCages();
        cage.setCage(SmartHandsMoveCablesRequestVariables.CAGE);
        cage.setAccountNumber(SmartHandsMoveCablesRequestVariables.ACCOUNT_NUMBER);
        cage.setCabinets(cabinets);

        List<CrossConnectCages> cageList = new ArrayList<>();
        cageList.add(cage);

        Ibxlocation ibxLocation = new Ibxlocation();
        ibxLocation.setIbx(SmartHandsMoveCablesRequestVariables.IBX);
        ibxLocation.setCages(cageList);
        smartHandsMoveCables.setIbxLocation(ibxLocation);

        Contact contactOrdering = new Contact();
        contactOrdering.setContactType("ORDERING");
        contactOrdering.setName(SmartHandsMoveCablesRequestVariables.ORDERING_NAME);
        contactOrdering.setUserName(SmartHandsMoveCablesRequestVariables.ORDERING_USERNAME);
        contactOrdering.setEmail(SmartHandsMoveCablesRequestVariables.ORDERING_EMAIL);
        contactOrdering.setMobilePhone(SmartHandsMoveCablesRequestVariables.ORDERING_MOBILE_NO);
        contactOrdering.setWorkPhone(SmartHandsMoveCablesRequestVariables.ORDERING_WORK_PHONE);
        contactOrdering.setWorkPhoneCountryCode(SmartHandsMoveCablesRequestVariables.ORDERING_WORK_PHONE_COUNTRY_CODE);
        contactOrdering.setMobilePhoneCountryCode(SmartHandsMoveCablesRequestVariables.ORDERING_MOBILE_COUNTRY_CODE);

        Contact contactTechnical = new Contact();
        contactTechnical.setContactType("TECHNICAL");
        contactTechnical.setUserName(SmartHandsMoveCablesRequestVariables.TECHNICAL_USERNAME);
        contactTechnical.setName(SmartHandsMoveCablesRequestVariables.TECHNICAL_NAME);
        contactTechnical.setEmail(SmartHandsMoveCablesRequestVariables.TECHNICAL_EMAIL);
        contactTechnical.setWorkPhone(SmartHandsMoveCablesRequestVariables.TECHNICAL_WORK_PHONE);
        contactTechnical.setWorkPhoneCountryCode(SmartHandsMoveCablesRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        contactTechnical.setWorkPhonePrefToCall(SmartHandsMoveCablesRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        contactTechnical.setMobilePhone(SmartHandsMoveCablesRequestVariables.TECHNICAL_MOBILE_NO);
        contactTechnical.setMobilePhoneCountryCode(SmartHandsMoveCablesRequestVariables.TECHNICAL_MOBILE_COUNTRY_CODE);
        contactTechnical.setMobilePhonePrefToCall(SmartHandsMoveCablesRequestVariables.TECHNICAL_MOBILE_PREF_TO_CALL);

        Contact contactNotification = new Contact();
        contactNotification.setContactType("NOTIFICATION");
        contactNotification.setName(SmartHandsMoveCablesRequestVariables.NOTIFICATION_NAME);
        contactNotification.setEmail(SmartHandsMoveCablesRequestVariables.NOTIFICATION_EMAIL);
        contactNotification.setUserName(SmartHandsMoveCablesRequestVariables.NOTIFICATION_USERNAME);
        List<Contact> contacts = new ArrayList<>();
        contacts.add(contactOrdering);
        contacts.add(contactNotification);
        contacts.add(contactTechnical);
        smartHandsMoveCables.setContacts(contacts);

        Schedule schedulesSmartHands = new Schedule();
        schedulesSmartHands.setScheduleType(SmartHandsMoveCablesRequestVariables.SCHEDULE_TYPE);
        schedulesSmartHands.setRequestedStartDate(SmartHandsMoveCablesRequestVariables.REQUESTED_START_DATE);
        schedulesSmartHands.setRequestedCompletionDate(SmartHandsMoveCablesRequestVariables.REQUESTED_COMPLETION_DATE);
        schedulesSmartHands.setIbxTimeZone(SmartHandsMoveCablesRequestVariables.IBX_TIMEZONE);
        smartHandsMoveCables.setSchedule(schedulesSmartHands);

        DeviceDetail deviceDetail =new DeviceDetail();
        deviceDetail.setName(SmartHandsMoveCablesRequestVariables.NEW_DEVICE_NAME);
        deviceDetail.setSlot(SmartHandsMoveCablesRequestVariables.NEW_DEVICE_SLOT);
        deviceDetail.setPort(SmartHandsMoveCablesRequestVariables.NEW_DEVICE_PORT);

        DeviceDetail currentDeviceDetail =new DeviceDetail();
        currentDeviceDetail.setName(SmartHandsMoveCablesRequestVariables.CURRENT_DEVICE_NAME);
        currentDeviceDetail.setSlot(SmartHandsMoveCablesRequestVariables.CURRENT_DEVICE_SLOT);
        currentDeviceDetail.setPort(SmartHandsMoveCablesRequestVariables.CURRENT_DEVICE_PORT);

        SmartHandsServiceDetails serviceDetailsSmartHands = new SmartHandsServiceDetails();
        serviceDetailsSmartHands.setQuantity(SmartHandsMoveCablesRequestVariables.QUANTITY);
        serviceDetailsSmartHands.setCableId(SmartHandsMoveCablesRequestVariables.CABLE_ID);
        serviceDetailsSmartHands.setScopeOfWork(SmartHandsMoveCablesRequestVariables.SCOPE_OF_WORK);
        List<DeviceDetail> deviceDetailList =new ArrayList<>();
        deviceDetailList.add(deviceDetail);
        serviceDetailsSmartHands.setDeviceDetails(deviceDetailList);
        serviceDetailsSmartHands.setCurrentDeviceDetail(currentDeviceDetail);

        smartHandsMoveCables.setServiceDetails(serviceDetailsSmartHands);

        String request= Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smartHandsMoveCables);

        return request;



    }
}
