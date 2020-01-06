package com.equinix.ecp.model.workVisit;

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

    public String getContactType() { return contactType; }

    public String setContactType(String contactType) { return this.contactType = contactType; }

    public String getUserName() { return userName; }

    public String setUserName(String userName) { return this.userName = userName; }


    public String getName() { return name; }

    public String setName(String name) { return this.name = name; }

    public String getEmail() { return email; }

    public String setEmail(String email) { return this.email = email; }

    public String getWorkPhoneCountryCode() { return workPhoneCountryCode; }

    public String setWorkPhoneCountryCode(String workPhoneCountryCode) { return this.workPhoneCountryCode = workPhoneCountryCode; }

    public String getWorkPhone() { return workPhone; }

    public String setWorkPhone(String workPhone) { return this.workPhone = workPhone; }

    public String getWorkPhonePrefToCall() { return workPhonePrefToCall; }

    public String setWorkPhonePrefToCall(String workPhonePrefToCall) { return this.workPhonePrefToCall = workPhonePrefToCall; }

    public String getMobilePhoneCountryCode() { return mobilePhoneCountryCode; }

    public String setMobilePhoneCountryCode(String mobilePhoneCountryCode) { return this.mobilePhoneCountryCode = mobilePhoneCountryCode; }

    public String getMobilePhone() { return mobilePhone; }

    public String setMobilePhone(String mobilePhone) { return this.mobilePhone = mobilePhone; }

    public String getMobilePhonePrefToCall() { return mobilePhonePrefToCall; }

    public String setMobilePhonePrefToCall(String mobilePhonePrefToCall) { return this.mobilePhonePrefToCall = mobilePhonePrefToCall; }

    public String getWorkPhoneTimeZone() { return workPhoneTimeZone; }

    public String setWorkPhoneTimeZone(String workPhoneTimeZone) { return this.workPhoneTimeZone = workPhoneTimeZone; }

    public String getMobilePhoneTimeZone() { return mobilePhoneTimeZone; }

    public String setMobilePhoneTimeZone(String mobilePhoneTimeZone) { return this.mobilePhoneTimeZone = mobilePhoneTimeZone; }

}
