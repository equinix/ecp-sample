package com.equinix.ecp.model.shipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ShipmentOutboundRequest {
    private List<ContactInfo> contacts;
    private String customerReferenceNumber;
    private PurchaseOrder purchaseOrder;
    private String serviceRequestNumber;
    private IbxLocation ibxLocation;
    private OutboundServiceDetail serviceDetails;
    private List<Attachment> attachments;

    public List<ContactInfo> getContacts() {
        return contacts;
    }

    public void setContacts(List<ContactInfo> contacts) {
        this.contacts = contacts;
    }

    public String getCustomerReferenceNumber() {
        return customerReferenceNumber;
    }

    public void setCustomerReferenceNumber(String customerReferenceNumber) {
        this.customerReferenceNumber = customerReferenceNumber;
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public IbxLocation getIbxLocation() {
        return ibxLocation;
    }

    public void setIbxLocation(IbxLocation ibxLocation) {
        this.ibxLocation = ibxLocation;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public OutboundServiceDetail getServiceDetails() {
        return serviceDetails;
    }

    public void setServiceDetails(OutboundServiceDetail serviceDetails) {
        this.serviceDetails = serviceDetails;
    }

    public String getServiceRequestNumber() {
        return serviceRequestNumber;
    }

    public void setServiceRequestNumber(String serviceRequestNumber) {
        this.serviceRequestNumber = serviceRequestNumber;
    }
}
