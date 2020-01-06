package com.equinix.ecp.model.authentication;

public class AuthenTokenResponse {

    private String access_token = null;

    private String token_timeout = null;

    private String user_name = null;

    private String token_type = null;

    private String refresh_token = null;

    private String refresh_token_timeout = null;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_timeout() {
        return token_timeout;
    }

    public void setToken_timeout(String token_timeout) {
        this.token_timeout = token_timeout;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getRefresh_token_timeout() {
        return refresh_token_timeout;
    }

    public void setRefresh_token_timeout(String refresh_token_timeout) {
        this.refresh_token_timeout = refresh_token_timeout;
    }
}


