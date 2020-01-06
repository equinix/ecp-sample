package com.equinix.ecp.model.crossconnect;

import java.util.List;

public class PatchPanel {

    private String ibx;
    private String cage;
    private String dedicatedMediaType;
    private String prewired;
    private String maxPorts;
    private String ppType;
    private String customerPanelRefNumber;
    private String rackLoc;
    private String installLoc;
    private String installReq;
    private List<String> mediaTypes;
    private List<String> availablePorts;
    private List<UsedPorts> usedPorts;
    private List<InvalidPorts> invalidPorts;
    private List<ReservedPorts> reservedPorts;
    private String ppNumber;
    private String cabinetNumber;
    private List<PpNumberList> ppNumberList;
    private List<PpDetailList> ppDetailList;
    private List<ConnectionServicesResponse> connectionServices;


    public String getIbx() {
        return ibx;
    }

    public void setIbx(String ibx) {
        this.ibx = ibx;
    }

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    public String getDedicatedMediaType() {
        return dedicatedMediaType;
    }

    public void setDedicatedMediaType(String dedicatedMediaType) {
        this.dedicatedMediaType = dedicatedMediaType;
    }

    public String getPrewired() {
        return prewired;
    }

    public void setPrewired(String prewired) {
        this.prewired = prewired;
    }

    public String getMaxPorts() {
        return maxPorts;
    }

    public void setMaxPorts(String maxPorts) {
        this.maxPorts = maxPorts;
    }

    public String getPpType() {
        return ppType;
    }

    public void setPpType(String ppType) {
        this.ppType = ppType;
    }

    public String getCustomerPanelRefNumber() {
        return customerPanelRefNumber;
    }

    public void setCustomerPanelRefNumber(String customerPanelRefNumber) {
        this.customerPanelRefNumber = customerPanelRefNumber;
    }

    public String getRackLoc() {
        return rackLoc;
    }

    public void setRackLoc(String rackLoc) {
        this.rackLoc = rackLoc;
    }

    public String getInstallLoc() {
        return installLoc;
    }

    public void setInstallLoc(String installLoc) {
        this.installLoc = installLoc;
    }

    public String getInstallReq() {
        return installReq;
    }

    public void setInstallReq(String installReq) {
        this.installReq = installReq;
    }

    public List<String> getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(List<String> mediaTypes) {
        this.mediaTypes = mediaTypes;
    }


    public List<UsedPorts> getUsedPorts() {
        return usedPorts;
    }

    public List<String> getAvailablePorts() {
        return availablePorts;
    }

    public void setAvailablePorts(List<String> availablePorts) {
        this.availablePorts = availablePorts;
    }

    public void setUsedPorts(List<UsedPorts> usedPorts) {
        this.usedPorts = usedPorts;
    }

    public List<InvalidPorts> getInvalidPorts() {
        return invalidPorts;
    }

    public void setInvalidPorts(List<InvalidPorts> invalidPorts) {
        this.invalidPorts = invalidPorts;
    }

    public List<ReservedPorts> getReservedPorts() {
        return reservedPorts;
    }

    public void setReservedPorts(List<ReservedPorts> reservedPorts) {
        this.reservedPorts = reservedPorts;
    }

    public String getPpNumber() {
        return ppNumber;
    }

    public void setPpNumber(String ppNumber) {
        this.ppNumber = ppNumber;
    }

    public String getCabinetNumber() {
        return cabinetNumber;
    }

    public void setCabinetNumber(String cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }

    public List<PpNumberList> getPpNumberList() {
        return ppNumberList;
    }

    public void setPpNumberList(List<PpNumberList> ppNumberList) {
        this.ppNumberList = ppNumberList;
    }

    public List<PpDetailList> getPpDetailList() {
        return ppDetailList;
    }

    public void setPpDetailList(List<PpDetailList> ppDetailList) {
        this.ppDetailList = ppDetailList;
    }

    public List<ConnectionServicesResponse> getConnectionServices() {
        return connectionServices;
    }

    public void setConnectionServices(List<ConnectionServicesResponse> connectionServices) {
        this.connectionServices = connectionServices;
    }
}
