package com.equinix.ecp.model.attachments;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class AttachmentIdResponse {;


    private String attachmentId;
    private String attachmentName;
    private String attachmentType;
    private String attachmentSize;
    private String createdDate;
    private String createdBy;
    private String lastUpdatedDate;
    private String externalSystemStorageId;
    private String externalSystemStorageUrl;
    private String storageType;
    private String attachmentStatus;
    private String customerOrganizationId;
    private String contentType;

    public AttachmentIdResponse() {
    }

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public String getAttachmentSize() {
        return attachmentSize;
    }

    public void setAttachmentSize(String attachmentSize) {
        this.attachmentSize = attachmentSize;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getExternalSystemStorageId() {
        return externalSystemStorageId;
    }

    public void setExternalSystemStorageId(String externalSystemStorageId) {
        this.externalSystemStorageId = externalSystemStorageId;
    }

    public String getExternalSystemStorageUrl() {
        return externalSystemStorageUrl;
    }

    public void setExternalSystemStorageUrl(String externalSystemStorageUrl) {
        this.externalSystemStorageUrl = externalSystemStorageUrl;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getAttachmentStatus() {
        return attachmentStatus;
    }

    public void setAttachmentStatus(String attachmentStatus) {
        this.attachmentStatus = attachmentStatus;
    }

    public String getCustomerOrganizationId() {
        return customerOrganizationId;
    }

    public void setCustomerOrganizationId(String customerOrganizationId) {
        this.customerOrganizationId = customerOrganizationId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }


}
