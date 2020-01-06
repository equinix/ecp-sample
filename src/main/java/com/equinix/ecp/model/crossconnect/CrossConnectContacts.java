package com.equinix.ecp.model.crossconnect;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CrossConnectContacts {

    private String contactType;
    private String userName;
    private String workPhoneCountryCode;
    private String workPhone;
    private String workPhonePrefToCall;

    public CrossConnectContacts(String contactType, String userName) {
        this.contactType = contactType;
        this.userName = userName;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getUserName() {
        return userName;
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

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CrossConnectContacts() {


    }
}
