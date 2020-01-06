package com.equinix.ecp.model.crossconnect;


import java.util.List;

public class CrossConnectExtended {

    private String customerReferenceNumber;
    private int quantityRequested;
    private boolean customerFollowUpRequired;
    private CrossConnectPurchaseOrder purchaseOrder;
    private List<CrossConnectContacts> contacts;
    private Schedule schedule;
    private CrossConnectServiceDetails serviceDetails;


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

    public String getCustomerReferenceNumber() {
        return customerReferenceNumber;
    }

    public void setCustomerReferenceNumber(String customerReferenceNumber) {
        this.customerReferenceNumber = customerReferenceNumber;
    }


    public CrossConnectPurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(CrossConnectPurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public List<CrossConnectContacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<CrossConnectContacts> contacts) {
        this.contacts = contacts;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public CrossConnectServiceDetails getServiceDetails() {
        return serviceDetails;
    }

    public void setServiceDetails(CrossConnectServiceDetails serviceDetails) {
        this.serviceDetails = serviceDetails;
    }


}
