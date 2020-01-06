package com.equinix.ecp.model.workVisit;

import java.util.List;


public class WorkVisitRequest {
    private List<ContactInfo> contacts;
    private IbxLocation ibxLocation;
    private ServiceDetail serviceDetail;

    public IbxLocation getIbxLocation() {
        return ibxLocation;
    }

    public void setIbxLocation(IbxLocation ibxLocation) {
        this.ibxLocation = ibxLocation;
    }

    public ServiceDetail getServiceDetails() {
        return serviceDetail;
    }

    public void setServiceDetails(ServiceDetail serviceDetail) {
        this.serviceDetail = serviceDetail;
    }

    public List<ContactInfo> getContacts() {
        return contacts;
    }

    public void setContacts(List<ContactInfo> contacts) {
        this.contacts = contacts;
    }
}
