package com.equinix.ecp.model.shipment;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ShipmentInboundRequest {
    private List<ContactInfo> contacts;
    private String customerReferenceNumber;
    private PurchaseOrder purchaseOrder;
    private IbxLocation ibxLocation;
    private List<Attachment> attachments;
    private InboundServiceDetail serviceDetails;
    private String serviceRequestNumber;
    private Price price;

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

    public InboundServiceDetail getServiceDetails() {
        return serviceDetails;
    }

    public void setServiceDetails(InboundServiceDetail serviceDetails) {
        this.serviceDetails = serviceDetails;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public String getServiceRequestNumber() {
        return serviceRequestNumber;
    }

    public void setServiceRequestNumber(String serviceRequestNumber) {
        this.serviceRequestNumber = serviceRequestNumber;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
