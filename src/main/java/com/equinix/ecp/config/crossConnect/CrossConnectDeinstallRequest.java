package com.equinix.ecp.config.crossConnect;

import com.equinix.ecp.Util;
import com.equinix.ecp.model.crossconnect.*;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class CrossConnectDeinstallRequest {

    public static String request() throws JsonProcessingException {

        CrossConnectDeinstall crossConnectDeinstall = new CrossConnectDeinstall();

        CrossConnectCages crossConnectCages = new CrossConnectCages();
        crossConnectCages.setAccountNumber(CrossConnectDeinstallRequestVariables.IBX_LOCATION_ACCOUNT_NUMBER);
        crossConnectCages.setCage(CrossConnectDeinstallRequestVariables.IBX_LOCATION_CAGE);

        List<String> cabinetsList = new ArrayList<>();
        cabinetsList.add(CrossConnectDeinstallRequestVariables.CABINET);
        crossConnectCages.setCabinets(cabinetsList);

        List<CrossConnectCages> crossConnectCagesList = new ArrayList<>();
        crossConnectCagesList.add(crossConnectCages);

        Ibxlocation ibxlocation = new Ibxlocation();
        ibxlocation.setCages(crossConnectCagesList);
        ibxlocation.setIbx(CrossConnectDeinstallRequestVariables.IBX_LOCATION_IBX);
        crossConnectDeinstall.setIbxLocation(ibxlocation);

        List<Object> attachmentsList = new ArrayList<>();
        crossConnectDeinstall.setAttachments(attachmentsList);

        crossConnectDeinstall.setCustomerReferenceNumber(CrossConnectDeinstallRequestVariables.CUSTOMER_REFERENCE_NUMBER);
        crossConnectDeinstall.setQuantityRequested(CrossConnectDeinstallRequestVariables.QUANTITY_REQUESTED);
        crossConnectDeinstall.setCustomerFollowUpRequired(CrossConnectDeinstallRequestVariables.CUSTOMER_FOLLOW_UP_REQUIRED);

        CrossConnectPurchaseOrder crossConnectPurchaseOrder = new CrossConnectPurchaseOrder();
        crossConnectPurchaseOrder.setPurchaseOrderType(CrossConnectDeinstallRequestVariables.PURCHASE_ORDER_TYPE);
        crossConnectPurchaseOrder.setNumber(CrossConnectDeinstallRequestVariables.NUMBER);
        crossConnectDeinstall.setPurchaseOrder(crossConnectPurchaseOrder);

        CrossConnectContacts orderingContacts = new CrossConnectContacts();
        orderingContacts.setContactType("ORDERING");
        orderingContacts.setUserName(CrossConnectDeinstallRequestVariables.ORDERING_USERNAME);

        CrossConnectContacts technicalContacts = new CrossConnectContacts();
        technicalContacts.setContactType("TECHNICAL");
        technicalContacts.setUserName(CrossConnectDeinstallRequestVariables.TECHNICAL_USERNAME);
        technicalContacts.setWorkPhoneCountryCode(CrossConnectDeinstallRequestVariables.TECHNICAL_WORK_PHONE_COUNTRY_CODE);
        technicalContacts.setWorkPhone(CrossConnectDeinstallRequestVariables.TECHNICAL_WORK_PHONE);
        technicalContacts.setWorkPhonePrefToCall(CrossConnectDeinstallRequestVariables.TECHNICAL_WORK_PHONE_PREF_TO_CALL);

        CrossConnectContacts notificationContact = new CrossConnectContacts();
        notificationContact.setContactType("NOTIFICATION");
        notificationContact.setUserName(CrossConnectDeinstallRequestVariables.NOTIFICATION_USERNAME);

        List<CrossConnectContacts> crossConnectContactsList = new ArrayList<>();
        crossConnectContactsList.add(orderingContacts);
        crossConnectContactsList.add(technicalContacts);
        crossConnectContactsList.add(notificationContact);
        crossConnectDeinstall.setContacts(crossConnectContactsList);

        CrossConnectServiceDetails crossConnectServiceDetails = new CrossConnectServiceDetails();
        Assets assets = new Assets();
        assets.setAssetId(CrossConnectDeinstallRequestVariables.ASSET_ID);
        assets.setSerialNumber(CrossConnectDeinstallRequestVariables.SERIAL_NO);
        assets.setDescription(CrossConnectDeinstallRequestVariables.ASSET_DESCRIPTION);
        assets.setBillingAgreement(CrossConnectDeinstallRequestVariables.ASSET_BILLING_AGREEMENT);
        assets.setInternalReferenceNumber(CrossConnectDeinstallRequestVariables.INTERNAL_REFERENCE_NO);
        assets.setLiveTraffic(CrossConnectDeinstallRequestVariables.LIVE_TRAFFIC);
        assets.setPatchCable(CrossConnectDeinstallRequestVariables.PATCH_CABLE);
        List<Assets> assetsList = new ArrayList<>();
        assetsList.add(assets);

        crossConnectServiceDetails.setAsset(assetsList);
        crossConnectServiceDetails.setRemovalDate(CrossConnectDeinstallRequestVariables.REMOVAL_DATE);
        crossConnectDeinstall.setServiceDetails(crossConnectServiceDetails);

        String request = Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(crossConnectDeinstall);
        System.out.println(request);

        return request;


    }


}
