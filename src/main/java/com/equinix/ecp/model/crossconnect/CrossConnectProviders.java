package com.equinix.ecp.model.crossconnect;


import java.io.IOException;


public class CrossConnectProviders {

     private String accountNo;
     private String name;

    public CrossConnectProviders() throws IOException {
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
