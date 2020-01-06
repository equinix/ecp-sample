package com.equinix.ecp.model.crossconnect;

public class Aside {

    private com.equinix.ecp.model.crossconnect.Ibxlocation ibxLocation;
    private String connectionService;
    private String mediaType;
    private boolean proceedIfMediaCoverterIsRequired;
    private String protocolType;
    private String connectorType;
    private CrossConnectPatchPanel patchpanel;

    public Aside() {
    }


    public com.equinix.ecp.model.crossconnect.Ibxlocation getIbxLocation() {
        return ibxLocation;
    }

    public void setIbxLocation(com.equinix.ecp.model.crossconnect.Ibxlocation ibxLocation) {
        this.ibxLocation = ibxLocation;
    }

    public String getConnectionService() {
        return connectionService;
    }

    public void setConnectionService(String connectionService) {
        this.connectionService = connectionService;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public boolean isProceedIfMediaCoverterIsRequired() {
        return proceedIfMediaCoverterIsRequired;
    }

    public void setProceedIfMediaCoverterIsRequired(boolean proceedIfMediaCoverterIsRequired) {
        this.proceedIfMediaCoverterIsRequired = proceedIfMediaCoverterIsRequired;
    }

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public String getConnectorType() {
        return connectorType;
    }

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    public CrossConnectPatchPanel getPatchpanel() {
        return patchpanel;
    }

    public void setPatchpanel(CrossConnectPatchPanel patchpanel) {
        this.patchpanel = patchpanel;
    }
}
