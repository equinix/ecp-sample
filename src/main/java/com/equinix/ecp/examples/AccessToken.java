package com.equinix.ecp.examples;

import com.equinix.ecp.config.ApiConfig;
import com.equinix.ecp.model.authentication.AuthenTokenRequest;
import com.equinix.ecp.APIHandler;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import org.springframework.http.HttpHeaders;
import com.equinix.ecp.*;

public class AccessToken {

    public static void main(String[] args) {

        AuthenTokenRequest authenTokenRequest=new AuthenTokenRequest();
        authenTokenRequest.setGrant_type(ApiConfig.GRANT_TYPE);
        authenTokenRequest.setUser_name(ApiConfig.USER_NAME);
        authenTokenRequest.setUser_password(ApiConfig.USER_PASSWORD);
        authenTokenRequest.setClient_id(ApiConfig.CLIENT_ID);
        authenTokenRequest.setClient_secret(ApiConfig.CLIENT_SECRET);

        APIHandler handler = new APIHandler();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("content-type", "application/json");

        try {
            AuthenTokenResponse authenTokenResponse = handler.getAuthenTokenResponse(httpHeaders, authenTokenRequest);
            System.out.println("Response is: \n " + Util.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString
                    (authenTokenResponse));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Get Access Token Response " + ex.getMessage());
        }

    }
}




