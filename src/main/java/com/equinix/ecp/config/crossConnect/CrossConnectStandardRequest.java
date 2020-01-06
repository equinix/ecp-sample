package com.equinix.ecp.config.crossConnect;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.*;
import com.equinix.ecp.model.crossconnect.Ibxlocation;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class CrossConnectStandardRequest {

    public static String Request() throws JsonProcessingException {

        CrossConnectStandard crossConnectStandard = new CrossConnectStandard();

        crossConnectStandard.setCustomerReferenceNumber(CrossConnectStandardRequestVariables.CUSTOMER_REFERENCE_NUMBER);
        crossConnectStandard.setQuantityRequested(CrossConnectStandardRequestVariables.QUANTITY_REQUESTED);
        crossConnectStandard.setCustomerFollowUpRequired(CrossConnectStandardRequestVariables.CUSTOMER_FOLLOW_UP_REQUIRED);
        
        CrossConnectPurchaseOrder crossConnectPurchaseOrder = new CrossConnectPurchaseOrder();
        crossConnectPurchaseOrder.setPurchaseOrderType(CrossConnectStandardRequestVariables.PURCHASE_ORDER_TYPE);
        crossConnectPurchaseOrder.setNumber(CrossConnectStandardRequestVariables.NUMBER);
        crossConnectStandard.setPurchaseOrder(crossConnectPurchaseOrder);
        
        CrossConnectContacts orderingContact = new CrossConnectContacts();
        orderingContact.setContactType("ORDERING");
        orderingContact.setUserName(CrossConnectStandardRequestVariables.ORDERING_USERNAME);

        CrossConnectContacts technicalContact = new CrossConnectContacts();
        technicalContact.setContactType("TECHNICAL");
        technicalContact.setUserName(CrossConnectStandardRequestVariables.TECHNICAL_USERNAME);
        technicalContact.setWorkPhoneCountryCode(CrossConnectStandardRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        technicalContact.setWorkPhone(CrossConnectStandardRequestVariables.TECHNICAL_WORK_PHONE);
        technicalContact.setWorkPhonePrefToCall(CrossConnectStandardRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);

        CrossConnectContacts notificationContact = new CrossConnectContacts();
        notificationContact.setContactType("NOTIFICATION");
        notificationContact.setUserName(CrossConnectStandardRequestVariables.NOTIFICATION_USERNAME);

        List<CrossConnectContacts> crossConnectContactsList = new ArrayList<>();
        crossConnectContactsList.add(orderingContact);
        crossConnectContactsList.add(technicalContact);
        crossConnectContactsList.add(notificationContact);
        crossConnectStandard.setContacts(crossConnectContactsList);

        Schedule schedule = new Schedule();
        schedule.setIbxTimeZone(CrossConnectStandardRequestVariables.IBX_TIMEZONE);
        schedule.setScheduleType(CrossConnectStandardRequestVariables.SCHEDULE_TYPE);
        schedule.setRequestedStartDate(CrossConnectStandardRequestVariables.REQUESTED_START_DATE);
        schedule.setRequestedCompletionDate(CrossConnectStandardRequestVariables.REQUESTED_COMPLETION_DATE);
        crossConnectStandard.setSchedule(schedule);

        CrossConnectServiceDetails crossConnectServiceDetails = new CrossConnectServiceDetails();
        crossConnectServiceDetails.setPatchEquipment(CrossConnectStandardRequestVariables.PATCH_EQUIPMENT);
        crossConnectServiceDetails.setBmmrRequired(CrossConnectStandardRequestVariables.BMMR_REQUIRED);
        crossConnectServiceDetails.setLightLinkVerificationRequired(CrossConnectStandardRequestVariables.LIGHT_LINK_VERIFICATION_REQUIRED);
        crossConnectServiceDetails.setNeedSupportFromASubmarineCableStationEngineer(CrossConnectStandardRequestVariables.NEED_SUPPORT_FROM_A_SUBMARINE_CABLE_STATION_ENGINEER);
        crossConnectStandard.setServiceDetails(crossConnectServiceDetails);

        CrossConnectCages crossConnectCages = new CrossConnectCages();
        crossConnectCages.setCage(CrossConnectStandardRequestVariables.ASIDE_CAGE);
        crossConnectCages.setAccountNumber(CrossConnectStandardRequestVariables.ASIDE_ACCOUNTNUMBER);

        CrossConnectPatchPanel crossConnectPatchPanelAside = new CrossConnectPatchPanel();
        crossConnectPatchPanelAside.setName(CrossConnectStandardRequestVariables.ASIDE_PATCHPANEL_NAME);
        crossConnectPatchPanelAside.setPortA(CrossConnectStandardRequestVariables.ASIDE_PORTA);
        crossConnectPatchPanelAside.setPortB(CrossConnectStandardRequestVariables.ASIDE_PORTB);

        Aside asides = new Aside();
        asides.setPatchpanel(crossConnectPatchPanelAside);
        asides.setConnectionService(CrossConnectStandardRequestVariables.ASIDE_CONNECTIONSERVICE);
        asides.setMediaType(CrossConnectStandardRequestVariables.ASIDE_MEDIATYPE);
        asides.setProceedIfMediaCoverterIsRequired(CrossConnectStandardRequestVariables.ASIDE_PROCEEDIFMEDIACOVERTERISREQUIRED);
        asides.setProtocolType(CrossConnectStandardRequestVariables.ASIDE_PROTOCOLTYPE);
        asides.setConnectorType(CrossConnectStandardRequestVariables.ASIDE_CONNECTORTYPE);

        Ibxlocation ibxlocationAside = new Ibxlocation();
        ibxlocationAside.setIbx(CrossConnectStandardRequestVariables.ASIDE_IBX);
        CrossConnectCages crossConnectCagesAside = new CrossConnectCages();
        crossConnectCagesAside.setAccountNumber(CrossConnectStandardRequestVariables.ASIDE_ACCOUNTNUMBER);
        crossConnectCagesAside.setCage(CrossConnectStandardRequestVariables.ASIDE_CAGE);
        List<CrossConnectCages> crossConnectCagesList = new ArrayList<>();
        crossConnectCagesList.add(crossConnectCagesAside);
        ibxlocationAside.setCages(crossConnectCagesList);

        asides.setIbxLocation(ibxlocationAside);
        crossConnectServiceDetails.setAside(asides);

        List<String> cabinetsList = new ArrayList<>();
        cabinetsList.add(CrossConnectStandardRequestVariables.ASIDE_CABINETS);

        crossConnectCagesAside.setCabinets(cabinetsList);
        List<CrossConnectCages> crossConnectCagesListAside = new ArrayList<>();

        crossConnectCagesListAside.add(crossConnectCagesAside);
        ibxlocationAside.setCages(crossConnectCagesListAside);
        crossConnectServiceDetails.setAside(asides);

        Devices device=new Devices();
        device.setCabinet(CrossConnectStandardRequestVariables.CABINET);
        device.setConnectorType(CrossConnectStandardRequestVariables.CONNECTOR_TYPE);
        device.setDetails(CrossConnectStandardRequestVariables.DETAILS);
        device.setPort(CrossConnectStandardRequestVariables.PORT);
        crossConnectServiceDetails.setDevice(device);

        Zside zsides = new Zside();
        zsides.setCustomer(CrossConnectStandardRequestVariables.ZSIDE_CUSTOMER);
        zsides.setCustomerAccount(CrossConnectStandardRequestVariables.ZSIDE_CUSTOMERACCOUNT);
        zsides.setConnectionService(CrossConnectStandardRequestVariables.ZSIDE_CONNECTIONSERVICE);
        zsides.setConnectorType(CrossConnectStandardRequestVariables.ZSIDE_CONNECTORTYPE);

        CrossConnectCages crossConnectCagesZside = new CrossConnectCages();
        crossConnectCagesZside.setCage(CrossConnectStandardRequestVariables.ZSIDE_CAGE);

        List<String> cabinetsListZside = new ArrayList<>();
        cabinetsListZside.add(CrossConnectStandardRequestVariables.ZSIDE_CABINET);

        crossConnectCagesZside.setCabinets(cabinetsListZside);
        List<CrossConnectCages> crossConnectCagesListZside = new ArrayList<>();

        crossConnectCagesListZside.add(crossConnectCagesZside);
        Ibxlocation ibxlocationZside = new Ibxlocation();
        ibxlocationZside.setIbx(CrossConnectStandardRequestVariables.ZSIDE_IBX);
        ibxlocationZside.setIbx(CrossConnectStandardRequestVariables.ZSIDE_IBX);
        ibxlocationZside.setCages(crossConnectCagesListZside);
        zsides.setIbxLocation(ibxlocationZside);

        List<Object> attachmentsZside = new ArrayList<>();
        Loa loa = new Loa();
        loa.setAttachments(attachmentsZside);
        zsides.setLoa(loa);

        CrossConnectPatchPanel crossConnectPatchPanelZside = new CrossConnectPatchPanel();
        crossConnectPatchPanelZside.setName(CrossConnectStandardRequestVariables.ZSIDE_PATCHPANEL_NAME);
        crossConnectPatchPanelZside.setPortA(CrossConnectStandardRequestVariables.ZSIDE_PORTA);
        crossConnectPatchPanelZside.setPortB(CrossConnectStandardRequestVariables.ZSIDE_PORTB);
        zsides.setPatchpanel(crossConnectPatchPanelZside);

        zsides.setCircuitId(CrossConnectStandardRequestVariables.ZSIDE_CIRCUITID);
        zsides.setNotifyZsideUponCompletion(CrossConnectStandardRequestVariables.NOTIFY_Z_SIDE_UPON_COMPLETION);
        zsides.setzSideContactEmail(CrossConnectStandardRequestVariables.ZSIDE_CONTACT_EMAIL);
        crossConnectServiceDetails.setZside(zsides);

        String request = Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(crossConnectStandard);

        return request;


    }

}
