package com.equinix.ecp.config.smartHands;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.CrossConnectCages;
import com.equinix.ecp.model.crossconnect.Schedule;
import com.equinix.ecp.model.crossconnect.Ibxlocation;
import com.equinix.ecp.model.smarthands.DeviceDetail;
import com.equinix.ecp.model.smarthands.PurchaseOrder;
import com.equinix.ecp.model.smarthands.SmartHandsRunJumperCable;
import com.equinix.ecp.model.smarthands.SmartHandsServiceDetails;
import com.equinix.ecp.model.troubleTicket.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class SmartHandsRunJumperCableRequest {

    public static String request() throws JsonProcessingException{

        SmartHandsRunJumperCable smartHandsRunJumperCable=new SmartHandsRunJumperCable();

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setPurchaseOrderType(SmartHandsRunJumperCableRequestVariables.PURCHASE_ORDER_TYPE);
        smartHandsRunJumperCable.setPurchaseOrder(purchaseOrder);

        List<String> cabinets = new ArrayList<>();
        cabinets.add(SmartHandsRunJumperCableRequestVariables.CABINETS);
        CrossConnectCages cage = new CrossConnectCages();
        cage.setCage(SmartHandsRunJumperCableRequestVariables.CAGE);
        cage.setAccountNumber(SmartHandsRunJumperCableRequestVariables.ACCOUNT_NUMBER);
        cage.setCabinets(cabinets);

        List<CrossConnectCages> cageList = new ArrayList<>();
        cageList.add(cage);

        Ibxlocation ibxLocation = new Ibxlocation();
        ibxLocation.setIbx(SmartHandsRunJumperCableRequestVariables.IBX);
        ibxLocation.setCages(cageList);
        smartHandsRunJumperCable.setIbxLocation(ibxLocation);

        Contact contactOrdering = new Contact();
        contactOrdering.setContactType("ORDERING");
        contactOrdering.setName(SmartHandsRunJumperCableRequestVariables.ORDERING_NAME);
        contactOrdering.setUserName(SmartHandsRunJumperCableRequestVariables.ORDERING_USERNAME);
        contactOrdering.setEmail(SmartHandsRunJumperCableRequestVariables.ORDERING_EMAIL);
        contactOrdering.setMobilePhone(SmartHandsRunJumperCableRequestVariables.ORDERING_MOBILE_NO);
        contactOrdering.setWorkPhone(SmartHandsRunJumperCableRequestVariables.ORDERING_WORK_PHONE);
        contactOrdering.setWorkPhoneCountryCode(SmartHandsRunJumperCableRequestVariables.ORDERING_WORK_PHONE_COUNTRY_CODE);
        contactOrdering.setMobilePhoneCountryCode(SmartHandsRunJumperCableRequestVariables.ORDERING_MOBILE_COUNTRY_CODE);

        Contact contactTechnical = new Contact();
        contactTechnical.setContactType("TECHNICAL");
        contactTechnical.setUserName(SmartHandsRunJumperCableRequestVariables.TECHNICAL_USERNAME);
        contactTechnical.setName(SmartHandsRunJumperCableRequestVariables.TECHNICAL_NAME);
        contactTechnical.setEmail(SmartHandsRunJumperCableRequestVariables.TECHNICAL_EMAIL);
        contactTechnical.setWorkPhone(SmartHandsRunJumperCableRequestVariables.TECHNICAL_WORK_PHONE);
        contactTechnical.setWorkPhoneCountryCode(SmartHandsRunJumperCableRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        contactTechnical.setWorkPhonePrefToCall(SmartHandsRunJumperCableRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        contactTechnical.setMobilePhone(SmartHandsRunJumperCableRequestVariables.TECHNICAL_MOBILE_NO);
        contactTechnical.setMobilePhoneCountryCode(SmartHandsRunJumperCableRequestVariables.TECHNICAL_MOBILE_COUNTRY_CODE);
        contactTechnical.setMobilePhonePrefToCall(SmartHandsRunJumperCableRequestVariables.TECHNICAL_MOBILE_PREF_TO_CALL);

        Contact contactNotification = new Contact();
        contactNotification.setContactType("NOTIFICATION");
        contactNotification.setName(SmartHandsRunJumperCableRequestVariables.NOTIFICATION_NAME);
        contactNotification.setEmail(SmartHandsRunJumperCableRequestVariables.NOTIFICATION_EMAIL);
        contactNotification.setUserName(SmartHandsRunJumperCableRequestVariables.NOTIFICATION_USERNAME);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contactOrdering);
        contacts.add(contactNotification);
        contacts.add(contactTechnical);
        smartHandsRunJumperCable.setContacts(contacts);

        Schedule schedulesSmartHands = new Schedule();
        schedulesSmartHands.setScheduleType(SmartHandsRunJumperCableRequestVariables.SCHEDULE_TYPE);
        schedulesSmartHands.setRequestedStartDate(SmartHandsRunJumperCableRequestVariables.REQUESTED_START_DATE);
        schedulesSmartHands.setRequestedCompletionDate(SmartHandsRunJumperCableRequestVariables.REQUESTED_COMPLETION_DATE);
        schedulesSmartHands.setIbxTimeZone(SmartHandsRunJumperCableRequestVariables.IBX_TIMEZONE);
        smartHandsRunJumperCable.setSchedule(schedulesSmartHands);

        SmartHandsServiceDetails serviceDetailsSmartHands = new SmartHandsServiceDetails();
        serviceDetailsSmartHands.setQuantity(SmartHandsRunJumperCableRequestVariables.QUANTITY);
        serviceDetailsSmartHands.setJumperType(SmartHandsRunJumperCableRequestVariables.JUMPER_TYPE);
        serviceDetailsSmartHands.setMediaType(SmartHandsRunJumperCableRequestVariables.MEDIA_TYPE);
        serviceDetailsSmartHands.setConnector(SmartHandsRunJumperCableRequestVariables.CONNECTOR);
        serviceDetailsSmartHands.setCableId(SmartHandsRunJumperCableRequestVariables.CABLE_ID);
        serviceDetailsSmartHands.setProvideTxRxLightLevels(SmartHandsRunJumperCableRequestVariables.PROVIDE_TX_RX_LIGHT_LEVELS);
        serviceDetailsSmartHands.setScopeOfWork(SmartHandsRunJumperCableRequestVariables.SCOPE_OF_WORK);

        DeviceDetail deviceDetail =new DeviceDetail();
        deviceDetail.setName(SmartHandsRunJumperCableRequestVariables.NEW_DEVICE_NAME);
        deviceDetail.setSlot(SmartHandsRunJumperCableRequestVariables.NEW_DEVICE_SLOT);
        deviceDetail.setPort(SmartHandsRunJumperCableRequestVariables.NEW_DEVICE_PORT);

        List<DeviceDetail> deviceDetailList =new ArrayList<>();
        deviceDetailList.add(deviceDetail);

        serviceDetailsSmartHands.setDeviceDetails(deviceDetailList);

        smartHandsRunJumperCable.setServiceDetails(serviceDetailsSmartHands);

        String request= Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smartHandsRunJumperCable);

        return request;

    }
}
