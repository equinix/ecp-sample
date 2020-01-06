package com.equinix.ecp.model.workVisit;

import java.util.List;

public class IbxLocationResponse {
    private int ibxTime;
    private String timezone;
    private String ibx;
    private String region;
    private String address1;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private List<CagePlaceOrderResponse> cageDetails;

    public IbxLocationResponse() {
    }

    public int getIbxTime() {
        return ibxTime;
    }

    public void setIbxTime(int ibxTime) {
        this.ibxTime = ibxTime;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getIbx() {
        return ibx;
    }

    public void setIbx(String ibx) {
        this.ibx = ibx;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public List<CagePlaceOrderResponse> getCageDetails() {
        return cageDetails;
    }

    public void setCageDetails(List<CagePlaceOrderResponse> cageDetails) {
        this.cageDetails = cageDetails;
    }
}
