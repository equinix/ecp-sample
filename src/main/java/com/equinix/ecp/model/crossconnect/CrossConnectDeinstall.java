package com.equinix.ecp.model.crossconnect;


import java.util.List;

public class CrossConnectDeinstall {

    private Ibxlocation ibxLocation;
    private String customerReferenceNumber;
    private int quantityRequested;
    private boolean customerFollowUpRequired;
    private CrossConnectPurchaseOrder purchaseOrder;
    private List<Object> attachments=null;
    private List<CrossConnectContacts> contacts;
    private CrossConnectServiceDetails serviceDetails;

    public String getCustomerReferenceNumber() {
        return customerReferenceNumber;
    }


    public void setCustomerReferenceNumber(String customerReferenceNumber) {
        this.customerReferenceNumber = customerReferenceNumber;
    }


    public int getQuantityRequested() {
        return quantityRequested;
    }

    public void setQuantityRequested(int quantityRequested) {
        this.quantityRequested = quantityRequested;
    }

    public boolean isCustomerFollowUpRequired() {
        return customerFollowUpRequired;
    }

    public void setCustomerFollowUpRequired(boolean customerFollowUpRequired) {
        this.customerFollowUpRequired = customerFollowUpRequired;
    }


    public CrossConnectPurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(CrossConnectPurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public CrossConnectServiceDetails getServiceDetails() {
        return serviceDetails;
    }

    public void setServiceDetails(CrossConnectServiceDetails serviceDetails) {
        this.serviceDetails = serviceDetails;
    }

    public List<CrossConnectContacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<CrossConnectContacts> contacts) {
        this.contacts = contacts;
    }


    public Ibxlocation getIbxLocation() {
        return ibxLocation;
    }

    public void setIbxLocation(Ibxlocation ibxLocation) {
        this.ibxLocation = ibxLocation;
    }

    public List<Object> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }


}
