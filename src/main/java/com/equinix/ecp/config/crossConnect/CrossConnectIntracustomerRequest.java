package com.equinix.ecp.config.crossConnect;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.equinix.ecp.model.crossconnect.Ibxlocation;

import java.util.ArrayList;
import java.util.List;

public class CrossConnectIntracustomerRequest {

   public static String Request() throws JsonProcessingException {

        CrossConnectIntracustomer crossConnectIntracustomerRequests=new CrossConnectIntracustomer();

        List<Object> attachmentsList=new ArrayList<>();
        crossConnectIntracustomerRequests.setAttachments(attachmentsList);

        crossConnectIntracustomerRequests.setCustomerReferenceNumber(CrossConnectIntracustomerRequestVariables.CUSTOMER_REFERENCE_NUMBER);
        crossConnectIntracustomerRequests.setQuantityRequested(CrossConnectIntracustomerRequestVariables.QUANTITY_REQUESTED);
        crossConnectIntracustomerRequests.setCustomerFollowUpRequired(CrossConnectIntracustomerRequestVariables.CUSTOMER_FOLLOW_UP_REQUIRED);

        CrossConnectPurchaseOrder crossConnectPurchaseOrder=new CrossConnectPurchaseOrder();
        crossConnectPurchaseOrder.setPurchaseOrderType(CrossConnectIntracustomerRequestVariables.PURCHASE_ORDER_TYPE);
        crossConnectPurchaseOrder.setNumber(CrossConnectIntracustomerRequestVariables.NUMBER);
        crossConnectIntracustomerRequests.setPurchaseOrder(crossConnectPurchaseOrder);

        CrossConnectContacts orderingContact=new CrossConnectContacts();
        orderingContact.setContactType("ORDERING");
        orderingContact.setUserName(CrossConnectIntracustomerRequestVariables.ORDERING_USERNAME);

        CrossConnectContacts technicalContact=new CrossConnectContacts();
        technicalContact.setContactType("TECHNICAL");
        technicalContact.setUserName(CrossConnectIntracustomerRequestVariables.TECHNICAL_USERNAME);
        technicalContact.setWorkPhoneCountryCode(CrossConnectIntracustomerRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        technicalContact.setWorkPhone(CrossConnectIntracustomerRequestVariables.TECHNICAL_WORK_PHONE);
        technicalContact.setWorkPhonePrefToCall(CrossConnectIntracustomerRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);

        CrossConnectContacts notificationContact=new CrossConnectContacts();
        notificationContact.setContactType("NOTIFICATION");
        notificationContact.setUserName(CrossConnectIntracustomerRequestVariables.NOTIFICATION_USERNAME);

        List<CrossConnectContacts> crossConnectContactsList=new ArrayList<>();
        crossConnectContactsList.add(orderingContact);
        crossConnectContactsList.add(technicalContact);
        crossConnectContactsList.add(notificationContact);
        crossConnectIntracustomerRequests.setContacts(crossConnectContactsList);

        Schedule schedule =new Schedule();
        schedule.setIbxTimeZone(CrossConnectIntracustomerRequestVariables.IBX_TIMEZONE);
        schedule.setScheduleType(CrossConnectIntracustomerRequestVariables.SCHEDULE_TYPE);
        schedule.setRequestedStartDate(CrossConnectIntracustomerRequestVariables.REQUESTED_START_DATE);
        schedule.setRequestedCompletionDate(CrossConnectIntracustomerRequestVariables.REQUESTED_COMPLETION_DATE);
        crossConnectIntracustomerRequests.setSchedule(schedule);

        CrossConnectServiceDetails crossConnectServiceDetails=new CrossConnectServiceDetails();
        crossConnectServiceDetails.setPatchEquipment(CrossConnectIntracustomerRequestVariables.PATCH_EQUIPMENT);
        crossConnectServiceDetails.setBmmrRequired(CrossConnectIntracustomerRequestVariables.BMMR_REQUIRED);
        crossConnectServiceDetails.setLightLinkVerificationRequired(CrossConnectIntracustomerRequestVariables.LIGHT_LINK_VERIFICATION_REQUIRED);
        crossConnectIntracustomerRequests.setServiceDetails(crossConnectServiceDetails);

        CrossConnectCages crossConnectCages=new CrossConnectCages();
        crossConnectCages.setCage(CrossConnectIntracustomerRequestVariables.ASIDE_CAGE);
        crossConnectCages.setAccountNumber(CrossConnectIntracustomerRequestVariables.ASIDE_ACCOUNTNUMBER);

        CrossConnectPatchPanel crossConnectPatchPanelAside=new CrossConnectPatchPanel();
        crossConnectPatchPanelAside.setName(CrossConnectIntracustomerRequestVariables.ASIDE_PATCHPANEL_NAME);
        crossConnectPatchPanelAside.setPortA(CrossConnectIntracustomerRequestVariables.ASIDE_PORTA);
        crossConnectPatchPanelAside.setPortB(CrossConnectIntracustomerRequestVariables.ASIDE_PORTB);

        Aside asides=new Aside();
        asides.setPatchpanel(crossConnectPatchPanelAside);
        asides.setConnectionService(CrossConnectIntracustomerRequestVariables.ASIDE_CONNECTIONSERVICE);
        asides.setMediaType(CrossConnectIntracustomerRequestVariables.ASIDE_MEDIATYPE);
        asides.setProceedIfMediaCoverterIsRequired(CrossConnectIntracustomerRequestVariables.ASIDE_PROCEEDIFMEDIACOVERTERISREQUIRED);
        asides.setProtocolType(CrossConnectIntracustomerRequestVariables.ASIDE_PROTOCOLTYPE);
        asides.setConnectorType(CrossConnectIntracustomerRequestVariables.ASIDE_CONNECTORTYPE);

        List<String> cabinetList=new ArrayList<>();
        cabinetList.add(CrossConnectIntracustomerRequestVariables.ASIDE_CABINETS);


        Ibxlocation ibxlocationAside=new Ibxlocation();
        ibxlocationAside.setIbx(CrossConnectIntracustomerRequestVariables.ASIDE_IBX);
        CrossConnectCages crossConnectCagesAside=new CrossConnectCages();
        crossConnectCagesAside.setAccountNumber(CrossConnectIntracustomerRequestVariables.ASIDE_ACCOUNTNUMBER);
        crossConnectCagesAside.setCage(CrossConnectIntracustomerRequestVariables.ASIDE_CAGE);
        List<CrossConnectCages> crossConnectCagesList=new ArrayList<>();
        crossConnectCagesList.add(crossConnectCagesAside);
        ibxlocationAside.setCages(crossConnectCagesList);

        asides.setIbxLocation(ibxlocationAside);
        crossConnectServiceDetails.setAside(asides);

        crossConnectCagesAside.setCabinets(cabinetList);
        List<CrossConnectCages> crossConnectCagesListAside=new ArrayList<>();

        crossConnectCagesListAside.add(crossConnectCagesAside);
        ibxlocationAside.setCages(crossConnectCagesListAside);
        crossConnectServiceDetails.setAside(asides);

        Devices device=new Devices();
        device.setCabinet(CrossConnectStandardRequestVariables.CABINET);
        device.setConnectorType(CrossConnectStandardRequestVariables.CONNECTOR_TYPE);
        device.setDetails(CrossConnectStandardRequestVariables.DETAILS);
        device.setPort(CrossConnectStandardRequestVariables.PORT);
        crossConnectServiceDetails.setDevice(device);

        Zside zsides=new Zside();
        zsides.setCustomer(CrossConnectIntracustomerRequestVariables.ZSIDE_CUSTOMER);
        zsides.setCustomerAccount(CrossConnectIntracustomerRequestVariables.ZSIDE_ACCOUNT_NUMBER);
        zsides.setConnectionService(CrossConnectIntracustomerRequestVariables.ZSIDE_CONNECTIONSERVICE);
        zsides.setConnectorType(CrossConnectIntracustomerRequestVariables.ZSIDE_CONNECTORTYPE);

        CrossConnectCages crossConnectCagesZside=new CrossConnectCages();
        crossConnectCagesZside.setCage(CrossConnectIntracustomerRequestVariables.ZSIDE_CAGE);

        List<String> cabinetsListZside=new ArrayList<>();
        cabinetsListZside.add(CrossConnectIntracustomerRequestVariables.ZSIDE_CABINET);

        crossConnectCagesZside.setAccountNumber(CrossConnectIntracustomerRequestVariables.ZSIDE_ACCOUNT_NUMBER);
        crossConnectCagesZside.setCabinets(cabinetsListZside);
        List<CrossConnectCages> crossConnectCagesListZside=new ArrayList<>();
        crossConnectCagesListZside.add(crossConnectCagesZside);

        Ibxlocation ibxlocationZside=new Ibxlocation();
        ibxlocationZside.setIbx(CrossConnectIntracustomerRequestVariables.ZSIDE_IBX);
        ibxlocationZside.setCages(crossConnectCagesListZside);
        zsides.setIbxLocation(ibxlocationZside);

        List<Object> attachmentsZside=new ArrayList<>();
        Loa loa=new Loa();
        loa.setAttachments(attachmentsZside);
        zsides.setLoa(loa);

        CrossConnectPatchPanel crossConnectPatchPanelZside=new CrossConnectPatchPanel();
        crossConnectPatchPanelZside.setName(CrossConnectIntracustomerRequestVariables.ZSIDE_PATCHPANEL_NAME);
        crossConnectPatchPanelZside.setPortA(CrossConnectIntracustomerRequestVariables.ZSIDE_PORTA);
        crossConnectPatchPanelZside.setPortB(CrossConnectIntracustomerRequestVariables.ZSIDE_PORTB);
        zsides.setPatchpanel(crossConnectPatchPanelZside);

        zsides.setCircuitId(CrossConnectIntracustomerRequestVariables.ZSIDE_CIRCUITID);
        zsides.setNotifyZsideUponCompletion(CrossConnectIntracustomerRequestVariables.NOTIFY_Z_SIDE_UPON_COMPLETION);
        zsides.setzSideContactEmail(CrossConnectIntracustomerRequestVariables.ZSIDE_CONTACT_EMAIL);

        crossConnectServiceDetails.setZside(zsides);

        String request = Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(crossConnectIntracustomerRequests);
        System.out.println(request);

        return request;
    }
}
