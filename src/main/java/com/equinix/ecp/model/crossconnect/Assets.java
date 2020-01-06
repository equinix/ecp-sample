package com.equinix.ecp.model.crossconnect;

public class Assets {

    private String assetId;
    private String serialNumber;
    private String description;
    private String billingAgreement;
    private String internalReferenceNumber;
    private boolean liveTraffic;
    private boolean patchCable;

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingAgreement() {
        return billingAgreement;
    }

    public void setBillingAgreement(String billingAgreement) {
        this.billingAgreement = billingAgreement;
    }

    public String getInternalReferenceNumber() {
        return internalReferenceNumber;
    }

    public void setInternalReferenceNumber(String internalReferenceNumber) {
        this.internalReferenceNumber = internalReferenceNumber;
    }

    public boolean isLiveTraffic() {
        return liveTraffic;
    }

    public void setLiveTraffic(boolean liveTraffic) {
        this.liveTraffic = liveTraffic;
    }

    public boolean isPatchCable() {
        return patchCable;
    }

    public void setPatchCable(boolean patchCable) {
        this.patchCable = patchCable;
    }
}
