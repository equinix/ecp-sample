package com.equinix.ecp.model.troubleTicket;

import com.equinix.ecp.model.attachments.Attachments;

import java.util.List;

public class TroubleTicketRequest {
    
    private Ibxlocation ibxLocation;
    private ServiceDetails serviceDetails;
    private List<Contact> contacts;
    private List<Attachments> attachments;

    public Ibxlocation getIbxLocation() {
        return ibxLocation;
    }

    public void setIbxLocation(Ibxlocation ibxLocation) {
        this.ibxLocation = ibxLocation;
    }

    public ServiceDetails getServiceDetails() {
        return serviceDetails;
    }

    public void setServiceDetails(ServiceDetails serviceDetails) {
        this.serviceDetails = serviceDetails;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Attachments> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachments> attachments) {
        this.attachments = attachments;
    }

}
