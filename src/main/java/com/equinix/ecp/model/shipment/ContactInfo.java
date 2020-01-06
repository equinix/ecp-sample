package com.equinix.ecp.model.shipment;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ContactInfo {
    private String contactType;
    private String userName;
    private String name;
    private String email;
    private String workPhoneCountryCode;
    private String workPhone;
    private String workPhonePrefToCall;
    private String mobilePhoneCountryCode;
    private String mobilePhone;
    private String mobilePhonePrefToCall;
    private String workPhoneTimeZone;
    private String mobilePhoneTimeZone;

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkPhoneCountryCode() {
        return workPhoneCountryCode;
    }

    public void setWorkPhoneCountryCode(String workPhoneCountryCode) {
        this.workPhoneCountryCode = workPhoneCountryCode;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getWorkPhonePrefToCall() {
        return workPhonePrefToCall;
    }

    public void setWorkPhonePrefToCall(String workPhonePrefToCall) {
        this.workPhonePrefToCall = workPhonePrefToCall;
    }

    public String getMobilePhoneCountryCode() {
        return mobilePhoneCountryCode;
    }

    public void setMobilePhoneCountryCode(String mobilePhoneCountryCode) {
        this.mobilePhoneCountryCode = mobilePhoneCountryCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getMobilePhonePrefToCall() {
        return mobilePhonePrefToCall;
    }

    public void setMobilePhonePrefToCall(String mobilePhonePrefToCall) {
        this.mobilePhonePrefToCall = mobilePhonePrefToCall;
    }

    public String getWorkPhoneTimeZone() {
        return workPhoneTimeZone;
    }

    public void setWorkPhoneTimeZone(String workPhoneTimeZone) {
        this.workPhoneTimeZone = workPhoneTimeZone;
    }

    public String getMobilePhoneTimeZone() {
        return mobilePhoneTimeZone;
    }

    public void setMobilePhoneTimeZone(String mobilePhoneTimeZone) {
        this.mobilePhoneTimeZone = mobilePhoneTimeZone;
    }
}
