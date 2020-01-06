package com.equinix.ecp.model.smarthands;

public class CrossConnect {

    private String serialNumber;
    private String deviceCabinet;
    private String deviceConnectorType;
    private String deviceDetails;
    private String devicePort;
    private Boolean lightLinkVerification;
    private String scopeOfWork;


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDeviceCabinet() {
        return deviceCabinet;
    }

    public void setDeviceCabinet(String deviceCabinet) {
        this.deviceCabinet = deviceCabinet;
    }

    public String getDeviceConnectorType() {
        return deviceConnectorType;
    }

    public void setDeviceConnectorType(String deviceConnectorType) {
        this.deviceConnectorType = deviceConnectorType;
    }

    public String getDeviceDetails() {
        return deviceDetails;
    }

    public void setDeviceDetails(String deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    public String getDevicePort() {
        return devicePort;
    }

    public void setDevicePort(String devicePort) {
        this.devicePort = devicePort;
    }

    public Boolean getLightLinkVerification() {
        return lightLinkVerification;
    }

    public void setLightLinkVerification(Boolean lightLinkVerification) {
        this.lightLinkVerification = lightLinkVerification;
    }

    public String getScopeOfWork() {
        return scopeOfWork;
    }

    public void setScopeOfWork(String scopeOfWork) {
        this.scopeOfWork = scopeOfWork;
    }
}
