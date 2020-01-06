package com.equinix.ecp;

import com.equinix.ecp.config.ApiConfig;
import com.equinix.ecp.model.authentication.AuthenTokenRequest;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.http.HttpHeaders;

public class Util {

    public static ObjectMapper objectMapper = new ObjectMapper();

    public static ObjectMapper getObjectMapper() {
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        objectMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);

        return objectMapper;
    }

    public static AuthenTokenResponse createToken() throws APIException {

        AuthenTokenResponse authenTokenResponse = null;

        AuthenTokenRequest authenTokenRequest = new AuthenTokenRequest();

        authenTokenRequest.setClient_id(ApiConfig.CLIENT_ID);

        authenTokenRequest.setClient_secret(ApiConfig.CLIENT_SECRET);

        authenTokenRequest.setGrant_type(ApiConfig.GRANT_TYPE);

        authenTokenRequest.setUser_name(ApiConfig.USER_NAME);

        authenTokenRequest.setUser_password(ApiConfig.USER_PASSWORD);

        try {
            APIHandler handler = new APIHandler();
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json");
            authenTokenResponse = handler.getAuthenTokenResponse(headers, authenTokenRequest);
        } catch (Exception ex) {
            throw new APIException(2000, ex.getMessage());
        }
        return authenTokenResponse;
    }
}

