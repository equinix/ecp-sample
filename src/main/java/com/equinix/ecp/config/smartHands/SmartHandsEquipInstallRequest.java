package com.equinix.ecp.config.smartHands;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.CrossConnectCages;
import com.equinix.ecp.model.crossconnect.Schedule;
import com.equinix.ecp.model.smarthands.PurchaseOrder;
import com.equinix.ecp.model.smarthands.SmartHandsEquipInstall;
import com.equinix.ecp.model.smarthands.SmartHandsServiceDetails;
import com.equinix.ecp.model.troubleTicket.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class SmartHandsEquipInstallRequest {

    public static String request() throws JsonProcessingException {

        SmartHandsEquipInstall smartHandsEquipInstall = new SmartHandsEquipInstall();

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setPurchaseOrderType(SmartHandsEquipInstallRequestVariables.PURCHASE_ORDER_TYPE);
        smartHandsEquipInstall.setPurchaseOrder(purchaseOrder);

        List<String> cabinets = new ArrayList<>();
        cabinets.add(SmartHandsEquipInstallRequestVariables.CABINETS);
        CrossConnectCages cage = new CrossConnectCages();
        cage.setCage(SmartHandsEquipInstallRequestVariables.CAGE);
        cage.setAccountNumber(SmartHandsEquipInstallRequestVariables.ACCOUNT_NUMBER);
        cage.setCabinets(cabinets);

        List<CrossConnectCages> cageList = new ArrayList<>();
        cageList.add(cage);

        com.equinix.ecp.model.crossconnect.Ibxlocation ibxLocation = new com.equinix.ecp.model.crossconnect.Ibxlocation();
        ibxLocation.setIbx(SmartHandsEquipInstallRequestVariables.IBX);
        ibxLocation.setCages(cageList);
        smartHandsEquipInstall.setIbxLocation(ibxLocation);

        Contact contactOrdering = new Contact();
        contactOrdering.setContactType("ORDERING");
        contactOrdering.setName(SmartHandsEquipInstallRequestVariables.ORDERING_NAME);
        contactOrdering.setUserName(SmartHandsEquipInstallRequestVariables.ORDERING_USERNAME);
        contactOrdering.setEmail(SmartHandsEquipInstallRequestVariables.ORDERING_EMAIL);
        contactOrdering.setMobilePhone(SmartHandsEquipInstallRequestVariables.ORDERING_MOBILE_NO);
        contactOrdering.setWorkPhone(SmartHandsEquipInstallRequestVariables.ORDERING_WORK_PHONE);
        contactOrdering.setWorkPhoneCountryCode(SmartHandsEquipInstallRequestVariables.ORDERING_WORK_PHONE_COUNTRY_CODE);
        contactOrdering.setMobilePhoneCountryCode(SmartHandsEquipInstallRequestVariables.ORDERING_MOBILE_COUNTRY_CODE);

        Contact contactTechnical = new Contact();
        contactTechnical.setContactType("TECHNICAL");
        contactTechnical.setUserName(SmartHandsEquipInstallRequestVariables.TECHNICAL_USERNAME);
        contactTechnical.setName(SmartHandsEquipInstallRequestVariables.TECHNICAL_NAME);
        contactTechnical.setEmail(SmartHandsEquipInstallRequestVariables.TECHNICAL_EMAIL);
        contactTechnical.setWorkPhone(SmartHandsEquipInstallRequestVariables.TECHNICAL_WORK_PHONE);
        contactTechnical.setWorkPhoneCountryCode(SmartHandsEquipInstallRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        contactTechnical.setWorkPhonePrefToCall(SmartHandsEquipInstallRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        contactTechnical.setMobilePhone(SmartHandsEquipInstallRequestVariables.TECHNICAL_MOBILE_NO);
        contactTechnical.setMobilePhoneCountryCode(SmartHandsEquipInstallRequestVariables.TECHNICAL_MOBILE_COUNTRY_CODE);
        contactTechnical.setMobilePhonePrefToCall(SmartHandsEquipInstallRequestVariables.TECHNICAL_MOBILE_PREF_TO_CALL);

        Contact contactNotification = new Contact();
        contactNotification.setContactType("NOTIFICATION");
        contactNotification.setName(SmartHandsEquipInstallRequestVariables.NOTIFICATION_NAME);
        contactNotification.setEmail(SmartHandsEquipInstallRequestVariables.NOTIFICATION_EMAIL);
        contactNotification.setUserName(SmartHandsEquipInstallRequestVariables.NOTIFICATION_USERNAME);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contactOrdering);
        contacts.add(contactNotification);
        contacts.add(contactTechnical);
        smartHandsEquipInstall.setContacts(contacts);

        Schedule schedulesSmartHands = new Schedule();
        schedulesSmartHands.setScheduleType(SmartHandsEquipInstallRequestVariables.SCHEDULE_TYPE);
        schedulesSmartHands.setRequestedStartDate(SmartHandsEquipInstallRequestVariables.REQUESTED_START_DATE);
        schedulesSmartHands.setRequestedCompletionDate(SmartHandsEquipInstallRequestVariables.REQUESTED_COMPLETION_DATE);
        schedulesSmartHands.setIbxTimeZone(SmartHandsEquipInstallRequestVariables.IBX_TIMEZONE);
        smartHandsEquipInstall.setSchedule(schedulesSmartHands);

        SmartHandsServiceDetails serviceDetailsSmartHands = new SmartHandsServiceDetails();
        serviceDetailsSmartHands.setDeviceLocation(SmartHandsEquipInstallRequestVariables.DEVICE_LOCATION);
        serviceDetailsSmartHands.setElevationDrawingAttached(SmartHandsEquipInstallRequestVariables.ELEVATION_DRAWING_ATTACHED);
        serviceDetailsSmartHands.setInstallationPoint(SmartHandsEquipInstallRequestVariables.INSTALLATION_POINT);
        serviceDetailsSmartHands.setInstalledEquipmentPhotoRequired(SmartHandsEquipInstallRequestVariables.INSTALLED_EQUIPMENT_PHOTO_REQUIRED);
        serviceDetailsSmartHands.setMountHardwareIncluded(SmartHandsEquipInstallRequestVariables.MOUNT_HARDWARE_INCLUDED);
        serviceDetailsSmartHands.setPatchDevices(SmartHandsEquipInstallRequestVariables.PATCH_DEVICES);
        serviceDetailsSmartHands.setPatchingInfo(SmartHandsEquipInstallRequestVariables.PATCHING_INFO);
        serviceDetailsSmartHands.setPowerItOn(SmartHandsEquipInstallRequestVariables.POWER_IT_ON);
        serviceDetailsSmartHands.setNeedSupportFromASubmarineCableStationEngineer(SmartHandsEquipInstallRequestVariables.NEED_SUPPORT_FROM_A_SUBMARINE_CABLE_STATION_ENGINEER);
        serviceDetailsSmartHands.setScopeOfWork(SmartHandsEquipInstallRequestVariables.SCOPE_OF_WORK);

        smartHandsEquipInstall.setServiceDetails(serviceDetailsSmartHands);

        String request = Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(smartHandsEquipInstall);


        return request;


    }
}
