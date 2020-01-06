package com.equinix.ecp.model.crossconnect;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CrossConnectServiceDetails {

    private Aside aside;
    private Zside zside;
    private Boolean patchEquipment;
    private Devices device;
    private Boolean bmmrRequired;
    private Boolean connectToOwnCageOrCabinet;
    private Boolean lightLinkVerificationRequired;
    private Boolean needSupportFromASubmarineCableStationEngineer;
    private List<Assets> asset;
    private String removalDate;

    public Aside getAside() {
        return aside;
    }

    public void setAside(Aside aside) {
        this.aside = aside;
    }

    public Zside getZside() {
        return zside;
    }

    public void setZside(Zside zside) {
        this.zside = zside;
    }

    public Boolean getPatchEquipment() {
        return patchEquipment;
    }

    public void setPatchEquipment(Boolean patchEquipment) {
        this.patchEquipment = patchEquipment;
    }

    public Devices getDevice() {
        return device;
    }

    public void setDevice(Devices device) {
        this.device = device;
    }

    public Boolean getBmmrRequired() {
        return bmmrRequired;
    }

    public void setBmmrRequired(Boolean bmmrRequired) {
        this.bmmrRequired = bmmrRequired;
    }

    public Boolean getConnectToOwnCageOrCabinet() {
        return connectToOwnCageOrCabinet;
    }

    public void setConnectToOwnCageOrCabinet(Boolean connectToOwnCageOrCabinet) {
        this.connectToOwnCageOrCabinet = connectToOwnCageOrCabinet;
    }

    public Boolean getLightLinkVerificationRequired() {
        return lightLinkVerificationRequired;
    }

    public void setLightLinkVerificationRequired(Boolean lightLinkVerificationRequired) {
        this.lightLinkVerificationRequired = lightLinkVerificationRequired;
    }

    public Boolean getNeedSupportFromASubmarineCableStationEngineer() {
        return needSupportFromASubmarineCableStationEngineer;
    }

    public void setNeedSupportFromASubmarineCableStationEngineer(Boolean needSupportFromASubmarineCableStationEngineer) {
        this.needSupportFromASubmarineCableStationEngineer = needSupportFromASubmarineCableStationEngineer;
    }

    public List<Assets> getAsset() {
        return asset;
    }

    public void setAsset(List<Assets> asset) {
        this.asset = asset;
    }

    public String getRemovalDate() {
        return removalDate;
    }

    public void setRemovalDate(String removalDate) {
        this.removalDate = removalDate;
    }

}
