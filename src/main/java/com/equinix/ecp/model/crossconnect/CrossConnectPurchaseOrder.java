package com.equinix.ecp.model.crossconnect;

public class CrossConnectPurchaseOrder {

    private String purchaseOrderType;
    private String number;

    public CrossConnectPurchaseOrder() {
    }

    public String getPurchaseOrderType() {
        return purchaseOrderType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPurchaseOrderType(String purchaseOrderType) {

        this.purchaseOrderType = purchaseOrderType;
    }
}
