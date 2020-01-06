package com.equinix.ecp.config.crossConnect;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.*;
import com.fasterxml.jackson.core.JsonProcessingException;


import java.util.ArrayList;
import java.util.List;

public class CrossConnectExtendedRequest {

    public static String RequestBody() throws JsonProcessingException {

        CrossConnectExtended crossConnectExtended = new CrossConnectExtended();

        crossConnectExtended.setCustomerReferenceNumber(CrossConnectExtendedRequestVariables.CUSTOMER_REFERENCE_NUMBER);
        crossConnectExtended.setQuantityRequested(CrossConnectExtendedRequestVariables.QUANTITY_REQUESTED);
        crossConnectExtended.setCustomerFollowUpRequired(CrossConnectExtendedRequestVariables.CUSTOMER_FOLLOW_UP_REQUIRED);

        CrossConnectPurchaseOrder crossConnectPurchaseOrder = new CrossConnectPurchaseOrder();
        crossConnectPurchaseOrder.setPurchaseOrderType(CrossConnectExtendedRequestVariables.PURCHASE_ORDER_TYPE);
        crossConnectExtended.setPurchaseOrder(crossConnectPurchaseOrder);

        List<CrossConnectContacts> crossConnectContactsList = new ArrayList<>();
        CrossConnectContacts orderingContacts = new CrossConnectContacts();

        orderingContacts.setContactType("ORDERING");
        orderingContacts.setUserName(CrossConnectExtendedRequestVariables.ORDERING_USERNAME);
        crossConnectContactsList.add(orderingContacts);

        CrossConnectContacts technicalContact = new CrossConnectContacts();
        technicalContact.setContactType("TECHNICAL");
        technicalContact.setUserName(CrossConnectExtendedRequestVariables.TECHNICAL_USERNAME);
        technicalContact.setWorkPhoneCountryCode(CrossConnectExtendedRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        technicalContact.setWorkPhone(CrossConnectExtendedRequestVariables.TECHNICAL_WORK_PHONE);
        technicalContact.setWorkPhonePrefToCall(CrossConnectExtendedRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);
        crossConnectContactsList.add(technicalContact);

        CrossConnectContacts notificationContact = new CrossConnectContacts();
        notificationContact.setContactType("NOTIFICATION");
        notificationContact.setUserName(CrossConnectExtendedRequestVariables.NOTIFICATION_USERNAME);
        crossConnectExtended.setContacts(crossConnectContactsList);
        crossConnectContactsList.add(notificationContact);


        Schedule schedule = new Schedule();
        schedule.setIbxTimeZone(CrossConnectExtendedRequestVariables.IBX_TIMEZONE);
        schedule.setScheduleType(CrossConnectExtendedRequestVariables.SCHEDULE_TYPE);
        schedule.setRequestedStartDate(CrossConnectExtendedRequestVariables.REQUESTED_START_DATE);
        schedule.setRequestedCompletionDate(CrossConnectExtendedRequestVariables.REQUESTED_COMPLETION_DATE);
        crossConnectExtended.setSchedule(schedule);

        CrossConnectServiceDetails crossConnectServiceDetails = new CrossConnectServiceDetails();

        Aside asides = new Aside();
        Ibxlocation ibxlocation = new Ibxlocation();
        ibxlocation.setIbx(CrossConnectExtendedRequestVariables.ASIDE_IBX);
        List<CrossConnectCages> crossConnectCagesList = new ArrayList<>();
        CrossConnectCages crossConnectCagesAside = new CrossConnectCages();
        crossConnectCagesAside.setCage(CrossConnectExtendedRequestVariables.ASIDE_CAGE);
        crossConnectCagesAside.setAccountNumber(CrossConnectExtendedRequestVariables.ASIDE_ACCOUNTNUMBER);

        List<String> cabinetsList = new ArrayList<>();
        cabinetsList.add(CrossConnectExtendedRequestVariables.ASIDE_CABINETS);
        crossConnectCagesAside.setCabinets(cabinetsList);

        crossConnectCagesList.add(crossConnectCagesAside);
        ibxlocation.setCages(crossConnectCagesList);
        asides.setIbxLocation(ibxlocation);
        asides.setConnectionService(CrossConnectExtendedRequestVariables.ASIDE_CONNECTIONSERVICE);
        asides.setMediaType(CrossConnectExtendedRequestVariables.ASIDE_MEDIATYPE);
        asides.setProceedIfMediaCoverterIsRequired(CrossConnectExtendedRequestVariables.ASIDE_PROCEEDIFMEDIACOVERTERISREQUIRED);
        asides.setProtocolType(CrossConnectExtendedRequestVariables.ASIDE_PROTOCOLTYPE);
        asides.setConnectorType(CrossConnectExtendedRequestVariables.ASIDE_CONNECTORTYPE);
        CrossConnectPatchPanel crossConnectPatchPanel = new CrossConnectPatchPanel();
        crossConnectPatchPanel.setName(CrossConnectExtendedRequestVariables.ASIDE_PATCHPANEL_NAME);
        crossConnectPatchPanel.setPortA(CrossConnectExtendedRequestVariables.ASIDE_PORTA);
        crossConnectPatchPanel.setPortB(CrossConnectExtendedRequestVariables.ASIDE_PORTB);
        asides.setPatchpanel(crossConnectPatchPanel);

        Zside zsides = new Zside();
        Ibxlocation ibxlocation1 = new Ibxlocation();
        ibxlocation1.setIbx(CrossConnectExtendedRequestVariables.ZSIDE_IBX);
        zsides.setIbxLocation(ibxlocation1);
        zsides.setCircuitId(CrossConnectExtendedRequestVariables.ZSIDE_CIRCUITID);
        zsides.setNotifyZsideUponCompletion(CrossConnectExtendedRequestVariables.NOTIFY_Z_SIDE_UPON_COMPLETION);
        zsides.setzSideContactEmail(CrossConnectExtendedRequestVariables.Z_SIDE_CONTACT_EMAIL);
        zsides.setBmmrInformation(CrossConnectExtendedRequestVariables.BMMR_INFORMATION);


        List<Object> attachmentsList = new ArrayList<>();
        Loa loa = new Loa();
        loa.setAttachments(attachmentsList);
        zsides.setLoa(loa);

        crossConnectServiceDetails.setAside(asides);
        crossConnectServiceDetails.setZside(zsides);
        crossConnectServiceDetails.setPatchEquipment(CrossConnectExtendedRequestVariables.PATCH_EQUIPMENT);
        crossConnectServiceDetails.setBmmrRequired(CrossConnectExtendedRequestVariables.BMMR_REQUIRED);
        crossConnectServiceDetails.setLightLinkVerificationRequired(CrossConnectExtendedRequestVariables.LIGHT_LINK_VERIFICATION_REQUIRED);
        crossConnectExtended.setServiceDetails(crossConnectServiceDetails);

        String result = Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(crossConnectExtended);

        return result;
    }
}
