package com.equinix.ecp.model.crossconnect;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Zside {

    private String connectTo;
    private String customer;
    private String customerAccount;
    private com.equinix.ecp.model.crossconnect.Ibxlocation ibxLocation;
    private String connectionService;
    private String connectorType;
    private CrossConnectPatchPanel patchpanel;
    private String circuitId;
    private Loa loa;
    private boolean notifyZsideUponCompletion;
    private String zSideContactEmail;
    private String bmmrInformation;


    public com.equinix.ecp.model.crossconnect.Ibxlocation getIbxLocation() {
        return ibxLocation;
    }

    public void setIbxLocation(com.equinix.ecp.model.crossconnect.Ibxlocation ibxLocation) {
        this.ibxLocation = ibxLocation;
    }

    public String getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(String circuitId) {
        this.circuitId = circuitId;
    }

    public String getConnectTo() {
        return connectTo;
    }

    public void setConnectTo(String connectTo) {
        this.connectTo = connectTo;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
    }

    public String getConnectionService() {
        return connectionService;
    }

    public void setConnectionService(String connectionService) {
        this.connectionService = connectionService;
    }

    public String getConnectorType() {
        return connectorType;
    }

    public CrossConnectPatchPanel getPatchpanel() {
        return patchpanel;
    }

    public void setPatchpanel(CrossConnectPatchPanel patchpanel) {
        this.patchpanel = patchpanel;
    }

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }


    public Loa getLoa() {
        return loa;
    }

    public void setLoa(Loa loa) {
        this.loa = loa;
    }

    public boolean isNotifyZsideUponCompletion() {
        return notifyZsideUponCompletion;
    }

    public String getBmmrInformation() {
        return bmmrInformation;
    }

    public void setBmmrInformation(String bmmrInformation) {
        this.bmmrInformation = bmmrInformation;
    }

    public void setNotifyZsideUponCompletion(boolean notifyZsideUponCompletion) {

        this.notifyZsideUponCompletion = notifyZsideUponCompletion;
    }

    public String getzSideContactEmail() {
        return zSideContactEmail;
    }

    public void setzSideContactEmail(String zSideContactEmail) {
        this.zSideContactEmail = zSideContactEmail;
    }

    public Zside() {

    }
}
