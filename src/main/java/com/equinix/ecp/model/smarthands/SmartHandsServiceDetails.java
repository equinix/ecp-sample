package com.equinix.ecp.model.smarthands;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SmartHandsServiceDetails {

    private String quantity;
    private String cableId;
    private String deviceLocation;
    private Boolean elevationDrawingAttached;
    private String installationPoint;
    private Boolean installedEquipmentPhotoRequired;
    private Boolean mountHardwareIncluded;
    private Boolean patchDevices;
    private String patchingInfo;
    private Boolean powerItOn;
    private Boolean needSupportFromASubmarineCableStationEngineer;
    private String scopeOfWork;
    private Boolean dampMoistMopRequired;
    private Boolean permissionToDiscardBoxes;
    private String durationVisit;
    private Boolean openCabinetForVisitor;
    private Boolean supervisionReqForVisitor;
    private String workVisitOrderNumber;
    private String inboundShipmentOrderNumber;
    private Boolean copyOfPackingSlipNeeded;
    private Boolean discardShipmentMaterial;
    private String shipmentOrderNumber;
    private String trackingNumber;
    private String possibleLocation;
    private String packageDescription;
    private String cameraProvidedBy;
    private Boolean specificDateAndTime;
    private Boolean documentOnly;
    private String description;
    private String jumperType;
    private String mediaType;
    private String connector;
    private Boolean provideTxRxLightLevels;
    private List<CrossConnect> crossConnects;
    private List<DeviceDetail> deviceDetails;
    private DeviceDetail currentDeviceDetail;

    public String getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public Boolean getElevationDrawingAttached() {
        return elevationDrawingAttached;
    }

    public void setElevationDrawingAttached(Boolean elevationDrawingAttached) {
        this.elevationDrawingAttached = elevationDrawingAttached;
    }

    public Boolean getInstalledEquipmentPhotoRequired() {
        return installedEquipmentPhotoRequired;
    }

    public Boolean getDampMoistMopRequired() {
        return dampMoistMopRequired;
    }

    public void setDampMoistMopRequired(Boolean dampMoistMopRequired) {
        this.dampMoistMopRequired = dampMoistMopRequired;
    }

    public String getPatchingInfo() {
        return patchingInfo;
    }

    public void setPatchingInfo(String patchingInfo) {
        this.patchingInfo = patchingInfo;
    }

    public void setInstalledEquipmentPhotoRequired(Boolean installedEquipmentPhotoRequired) {
        this.installedEquipmentPhotoRequired = installedEquipmentPhotoRequired;

    }

    public List<CrossConnect> getCrossConnects() {
        return crossConnects;
    }

    public void setCrossConnects(List<CrossConnect> crossConnects) {
        this.crossConnects = crossConnects;
    }

    public Boolean getPermissionToDiscardBoxes() {
        return permissionToDiscardBoxes;
    }

    public Boolean getNeedSupportFromASubmarineCableStationEngineer() {
        return needSupportFromASubmarineCableStationEngineer;
    }

    public void setNeedSupportFromASubmarineCableStationEngineer(Boolean needSupportFromASubmarineCableStationEngineer) {
        this.needSupportFromASubmarineCableStationEngineer = needSupportFromASubmarineCableStationEngineer;
    }

    public void setPermissionToDiscardBoxes(Boolean permissionToDiscardBoxes) {
        this.permissionToDiscardBoxes = permissionToDiscardBoxes;
    }

    public Boolean getMountHardwareIncluded() {
        return mountHardwareIncluded;
    }

    public void setMountHardwareIncluded(Boolean mountHardwareIncluded) {
        this.mountHardwareIncluded = mountHardwareIncluded;
    }

    public Boolean getPatchDevices() {
        return patchDevices;
    }

    public void setPatchDevices(Boolean patchDevices) {
        this.patchDevices = patchDevices;
    }

    public Boolean getPowerItOn() {
        return powerItOn;
    }

    public void setPowerItOn(Boolean powerItOn) {
        this.powerItOn = powerItOn;
    }

    public String getInstallationPoint() {
        return installationPoint;
    }

    public void setInstallationPoint(String installationPoint) {
        this.installationPoint = installationPoint;
    }


    public String getScopeOfWork() {
        return scopeOfWork;
    }

    public String getDurationVisit() {
        return durationVisit;
    }

    public void setDurationVisit(String durationVisit) {
        this.durationVisit = durationVisit;
    }

    public Boolean getOpenCabinetForVisitor() {
        return openCabinetForVisitor;
    }

    public void setOpenCabinetForVisitor(Boolean openCabinetForVisitor) {
        this.openCabinetForVisitor = openCabinetForVisitor;
    }

    public Boolean getSupervisionReqForVisitor() {
        return supervisionReqForVisitor;
    }

    public void setSupervisionReqForVisitor(Boolean supervisionReqForVisitor) {
        this.supervisionReqForVisitor = supervisionReqForVisitor;
    }

    public String getWorkVisitOrderNumber() {
        return workVisitOrderNumber;
    }

    public void setWorkVisitOrderNumber(String workVisitOrderNumber) {
        this.workVisitOrderNumber = workVisitOrderNumber;
    }

    public void setScopeOfWork(String scopeOfWork) {
        this.scopeOfWork = scopeOfWork;
    }

    public String getInboundShipmentOrderNumber() {
        return inboundShipmentOrderNumber;
    }

    public void setInboundShipmentOrderNumber(String inboundShipmentOrderNumber) {
        this.inboundShipmentOrderNumber = inboundShipmentOrderNumber;
    }

    public Boolean getCopyOfPackingSlipNeeded() {
        return copyOfPackingSlipNeeded;
    }

    public void setCopyOfPackingSlipNeeded(Boolean copyOfPackingSlipNeeded) {
        this.copyOfPackingSlipNeeded = copyOfPackingSlipNeeded;
    }

    public Boolean getDiscardShipmentMaterial() {
        return discardShipmentMaterial;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCableId() {
        return cableId;
    }

    public void setCableId(String cableId) {
        this.cableId = cableId;
    }

    public List<DeviceDetail> getDeviceDetails() {
        return deviceDetails;
    }

    public void setDeviceDetails(List<DeviceDetail> deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    public DeviceDetail getCurrentDeviceDetail() {
        return currentDeviceDetail;
    }

    public void setCurrentDeviceDetail(DeviceDetail currentDeviceDetail) {
        this.currentDeviceDetail = currentDeviceDetail;
    }

    public String getShipmentOrderNumber() {
        return shipmentOrderNumber;
    }

    public void setShipmentOrderNumber(String shipmentOrderNumber) {
        this.shipmentOrderNumber = shipmentOrderNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getPossibleLocation() {
        return possibleLocation;
    }

    public void setPossibleLocation(String possibleLocation) {
        this.possibleLocation = possibleLocation;
    }

    public String getPackageDescription() {
        return packageDescription;
    }

    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    public String getCameraProvidedBy() {
        return cameraProvidedBy;
    }

    public void setCameraProvidedBy(String cameraProvidedBy) {
        this.cameraProvidedBy = cameraProvidedBy;
    }

    public Boolean getSpecificDateAndTime() {
        return specificDateAndTime;
    }

    public void setSpecificDateAndTime(Boolean specificDateAndTime) {
        this.specificDateAndTime = specificDateAndTime;
    }

    public Boolean getDocumentOnly() {
        return documentOnly;
    }

    public void setDocumentOnly(Boolean documentOnly) {
        this.documentOnly = documentOnly;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJumperType() {
        return jumperType;
    }

    public void setJumperType(String jumperType) {
        this.jumperType = jumperType;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getConnector() {
        return connector;
    }

    public void setConnector(String connector) {
        this.connector = connector;
    }

    public Boolean getProvideTxRxLightLevels() {
        return provideTxRxLightLevels;
    }

    public void setProvideTxRxLightLevels(Boolean provideTxRxLightLevels) {
        this.provideTxRxLightLevels = provideTxRxLightLevels;
    }

    public void setDiscardShipmentMaterial(Boolean discardShipmentMaterial) {
        this.discardShipmentMaterial = discardShipmentMaterial;


    }
}
