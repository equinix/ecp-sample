package com.equinix.ecp.config.crossConnect;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.equinix.ecp.model.crossconnect.Ibxlocation;

import java.util.ArrayList;
import java.util.List;

public class CrossConnectFiberRequest {

    public static String request() throws JsonProcessingException{

        CrossConnectFiber crossConnectFiber =new CrossConnectFiber();

        List<Object> attachmentsList=new ArrayList<>();
        crossConnectFiber.setAttachments(attachmentsList);

        crossConnectFiber.setCustomerReferenceNumber(CrossConnectFiberRequestVariables.CUSTOMER_REFERENCE_NUMBER);
        crossConnectFiber.setQuantityRequested(CrossConnectFiberRequestVariables.QUANTITY_REQUESTED);
        crossConnectFiber.setCustomerFollowUpRequired(CrossConnectFiberRequestVariables.CUSTOMER_FOLLOW_UP_REQUIRED);

        CrossConnectPurchaseOrder crossConnectPurchaseOrder=new CrossConnectPurchaseOrder();
        crossConnectPurchaseOrder.setPurchaseOrderType(CrossConnectFiberRequestVariables.PURCHASE_ORDER_TYPE);
        crossConnectPurchaseOrder.setNumber(CrossConnectFiberRequestVariables.NUMBER);
        crossConnectFiber.setPurchaseOrder(crossConnectPurchaseOrder);

        CrossConnectContacts orderingContact=new CrossConnectContacts();
        orderingContact.setContactType("ORDERING");
        orderingContact.setUserName(CrossConnectFiberRequestVariables.ORDERING_USERNAME);

        CrossConnectContacts technicalContact=new CrossConnectContacts();
        technicalContact.setContactType("TECHNICAL");
        technicalContact.setUserName(CrossConnectFiberRequestVariables.TECHNICAL_USERNAME);
        technicalContact.setWorkPhoneCountryCode(CrossConnectFiberRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        technicalContact.setWorkPhone(CrossConnectFiberRequestVariables.TECHNICAL_WORK_PHONE);
        technicalContact.setWorkPhonePrefToCall(CrossConnectFiberRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);

        CrossConnectContacts notificationContact=new CrossConnectContacts();
        notificationContact.setContactType("NOTIFICATION");
        notificationContact.setUserName(CrossConnectFiberRequestVariables.NOTIFICATION_USERNAME);

        List<CrossConnectContacts> crossConnectContactsList=new ArrayList<>();
        crossConnectContactsList.add(orderingContact);
        crossConnectContactsList.add(technicalContact);
        crossConnectContactsList.add(notificationContact);
        crossConnectFiber.setContacts(crossConnectContactsList);

        Schedule schedule =new Schedule();
        schedule.setIbxTimeZone(CrossConnectFiberRequestVariables.IBX_TIMEZONE);
        schedule.setScheduleType(CrossConnectFiberRequestVariables.SCHEDULE_TYPE);
        schedule.setRequestedStartDate(CrossConnectFiberRequestVariables.REQUESTED_START_DATE);
        schedule.setRequestedCompletionDate(CrossConnectFiberRequestVariables.REQUESTED_COMPLETION_DATE);
        crossConnectFiber.setSchedule(schedule);

        CrossConnectServiceDetails crossConnectServiceDetails=new CrossConnectServiceDetails();
        crossConnectServiceDetails.setPatchEquipment(CrossConnectFiberRequestVariables.PATCH_EQUIPMENT);
        crossConnectServiceDetails.setConnectToOwnCageOrCabinet(CrossConnectFiberRequestVariables.CONNECT_TO_OWN_CAGE_OR_CABINET);
        crossConnectServiceDetails.setLightLinkVerificationRequired(CrossConnectFiberRequestVariables.LIGHT_LINK_VERIFICATION_REQUIRED);

        crossConnectFiber.setServiceDetails(crossConnectServiceDetails);

        CrossConnectCages crossConnectCages=new CrossConnectCages();
        crossConnectCages.setCage(CrossConnectFiberRequestVariables.ASIDE_CAGE);
        crossConnectCages.setAccountNumber(CrossConnectFiberRequestVariables.ASIDE_ACCOUNTNUMBER);


        CrossConnectPatchPanel crossConnectPatchPanelAside=new CrossConnectPatchPanel();
        crossConnectPatchPanelAside.setName(CrossConnectFiberRequestVariables.ASIDE_PATCHPANEL_NAME);
        crossConnectPatchPanelAside.setPortA(CrossConnectFiberRequestVariables.ASIDE_PORTA);
        crossConnectPatchPanelAside.setPortB(CrossConnectFiberRequestVariables.ASIDE_PORTB);

        Aside asides=new Aside();
        asides.setPatchpanel(crossConnectPatchPanelAside);
        asides.setConnectionService(CrossConnectFiberRequestVariables.ASIDE_CONNECTIONSERVICE);
        asides.setMediaType(CrossConnectFiberRequestVariables.ASIDE_MEDIATYPE);
        asides.setProceedIfMediaCoverterIsRequired(CrossConnectFiberRequestVariables.ASIDE_PROCEEDIFMEDIACOVERTERISREQUIRED);
        asides.setProtocolType(CrossConnectFiberRequestVariables.ASIDE_PROTOCOLTYPE);
        asides.setConnectorType(CrossConnectFiberRequestVariables.ASIDE_CONNECTORTYPE);


        Ibxlocation ibxlocationAside=new Ibxlocation();
        ibxlocationAside.setIbx(CrossConnectFiberRequestVariables.ASIDE_IBX);
        CrossConnectCages crossConnectCagesAside=new CrossConnectCages();
        crossConnectCagesAside.setAccountNumber(CrossConnectFiberRequestVariables.ASIDE_ACCOUNTNUMBER);
        crossConnectCagesAside.setCage(CrossConnectFiberRequestVariables.ASIDE_CAGE);
        List<CrossConnectCages> crossConnectCagesList=new ArrayList<>();
        crossConnectCagesList.add(crossConnectCagesAside);
        ibxlocationAside.setCages(crossConnectCagesList);

        asides.setIbxLocation(ibxlocationAside);
        crossConnectServiceDetails.setAside(asides);

        List<String> cabinetsList=new ArrayList<>();
        cabinetsList.add(CrossConnectFiberRequestVariables.ASIDE_CABINETS);

        crossConnectCagesAside.setCabinets(cabinetsList);
        List<CrossConnectCages> crossConnectCagesListAside=new ArrayList<>();

        crossConnectCagesListAside.add(crossConnectCagesAside);
        ibxlocationAside.setCages(crossConnectCagesListAside);
        crossConnectServiceDetails.setAside(asides);

        Zside zsides=new Zside();
        zsides.setConnectTo(CrossConnectFiberRequestVariables.ZSIDE_CONNECT_TO);
        zsides.setCustomer(CrossConnectFiberRequestVariables.ZSIDE_CUSTOMER);
        zsides.setCustomerAccount(CrossConnectFiberRequestVariables.ZSIDE_CUSTOMERACCOUNT);
        zsides.setConnectionService(CrossConnectFiberRequestVariables.ZSIDE_CONNECTIONSERVICE);
        zsides.setConnectorType(CrossConnectFiberRequestVariables.ZSIDE_CONNECTORTYPE);

        CrossConnectCages crossConnectCagesZside=new CrossConnectCages();
        crossConnectCagesZside.setCage(CrossConnectFiberRequestVariables.ZSIDE_CAGE);

        List<String> cabinetsListZside=new ArrayList<>();
        cabinetsListZside.add(CrossConnectFiberRequestVariables.ZSIDE_CABINET);

        crossConnectCagesZside.setAccountNumber(CrossConnectFiberRequestVariables.ZSIDE_ACCOUNT_NUMBER);
        crossConnectCagesZside.setCabinets(cabinetsListZside);
        List<CrossConnectCages> crossConnectCagesListZside=new ArrayList<>();
        crossConnectCagesListZside.add(crossConnectCagesZside);

        Ibxlocation ibxlocationZside=new Ibxlocation();
        ibxlocationZside.setIbx(CrossConnectFiberRequestVariables.ZSIDE_IBX);
        ibxlocationZside.setCages(crossConnectCagesListZside);
        zsides.setIbxLocation(ibxlocationZside);

        List<Object> attachmentsZside=new ArrayList<>();
        Loa loa=new Loa();
        loa.setAttachments(attachmentsZside);
        zsides.setLoa(loa);

        CrossConnectPatchPanel crossConnectPatchPanelZside=new CrossConnectPatchPanel();
        crossConnectPatchPanelZside.setName(CrossConnectFiberRequestVariables.ZSIDE_PATCHPANEL_NAME);
        crossConnectPatchPanelZside.setPortA(CrossConnectFiberRequestVariables.ZSIDE_PORTA);
        crossConnectPatchPanelZside.setPortB(CrossConnectFiberRequestVariables.ZSIDE_PORTB);
        zsides.setPatchpanel(crossConnectPatchPanelZside);

        zsides.setCircuitId(CrossConnectFiberRequestVariables.ZSIDE_CIRCUITID);
        zsides.setzSideContactEmail(CrossConnectFiberRequestVariables.ZSIDE_CONTACT_EMAIL);
        crossConnectServiceDetails.setZside(zsides);

        String request = Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(crossConnectFiber);
        System.out.println(request);

        return request;

    }
}
