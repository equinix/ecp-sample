package com.equinix.ecp.model.crossconnect;


import java.util.List;

public class CrossConnectFiber {

    private String customerReferenceNumber;
    private int quantityRequested;
    private boolean customerFollowUpRequired;
    private Schedule schedule;
    private CrossConnectPurchaseOrder purchaseOrder;
    private List<Object> attachments=null;
    private List<CrossConnectContacts> contacts;
    private CrossConnectServiceDetails serviceDetails;
    private Price price;

    public String getCustomerReferenceNumber() {
        return customerReferenceNumber;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
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

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
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


    public List<Object> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }



}
