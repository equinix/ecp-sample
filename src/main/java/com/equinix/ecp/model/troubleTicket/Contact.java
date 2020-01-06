package com.equinix.ecp.model.troubleTicket;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Contact {

    private String contactType;
    private String userName;
    private String name;
    private String email;
    private String workPhone;
    private String workPhoneCountryCode;
    private String mobilePhone;
    private String mobilePhoneCountryCode;
    private String workPhonePrefToCall;
    private String mobilePhonePrefToCall;

    public Contact() {
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

    public String getMobilePhonePrefToCall() {
        return mobilePhonePrefToCall;
    }

    public void setMobilePhonePrefToCall(String mobilePhonePrefToCall) {
        this.mobilePhonePrefToCall = mobilePhonePrefToCall;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getWorkPhoneCountryCode() {
        return workPhoneCountryCode;
    }

    public void setWorkPhoneCountryCode(String workPhoneCountryCode) {
        this.workPhoneCountryCode = workPhoneCountryCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getMobilePhoneCountryCode() {
        return mobilePhoneCountryCode;
    }

    public void setMobilePhoneCountryCode(String mobilePhoneCountryCode) {
        this.mobilePhoneCountryCode = mobilePhoneCountryCode;
    }

    public String getWorkPhonePrefToCall() {
        return workPhonePrefToCall;
    }

    public void setWorkPhonePrefToCall(String workPhonePrefToCall) {
        this.workPhonePrefToCall = workPhonePrefToCall;
    }


}
