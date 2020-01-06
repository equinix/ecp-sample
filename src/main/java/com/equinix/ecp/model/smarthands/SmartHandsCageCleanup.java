package com.equinix.ecp.model.smarthands;

import com.equinix.ecp.model.crossconnect.Schedule;
import com.equinix.ecp.model.crossconnect.Ibxlocation;
import com.equinix.ecp.model.attachments.Attachments;
import com.equinix.ecp.model.troubleTicket.Contact;

import java.util.List;

public class SmartHandsCageCleanup {

    private List<Attachments> attachments;
    private Ibxlocation ibxLocation;
    private PurchaseOrder purchaseOrder;
    private Schedule schedule;
    private SmartHandsServiceDetails serviceDetails;
    private List<Contact> contacts;

    public List<Attachments> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachments> attachments) {
        this.attachments = attachments;
    }

    public Ibxlocation getIbxLocation() {
        return ibxLocation;
    }

    public void setIbxLocation(Ibxlocation ibxLocation) {
        this.ibxLocation = ibxLocation;
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public SmartHandsServiceDetails getServiceDetails() {
        return serviceDetails;
    }

    public void setServiceDetails(SmartHandsServiceDetails serviceDetails) {
        this.serviceDetails = serviceDetails;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }


}
