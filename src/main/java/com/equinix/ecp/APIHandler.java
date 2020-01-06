package com.equinix.ecp;

import com.equinix.ecp.config.ApiConfig;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.model.authentication.AuthenTokenRequest;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class APIHandler {

    private ApiConfig apiConfigDoNotUpload = new ApiConfig();

    private RestTemplate restTemplate = new RestTemplate();

    public APIHandler() {
    }

    public AuthenTokenResponse getAuthenTokenResponse(HttpHeaders headers, AuthenTokenRequest request) throws APIException {

        String url = ApiConfig.URI + "/oauth2/v1/token";
        final HttpEntity<AuthenTokenRequest> entity = new HttpEntity<>(request, headers);
        headers.setContentType(MediaType.APPLICATION_JSON);
        Object[] args = new String[]{};
        try {
            ResponseEntity<AuthenTokenResponse> Response = restTemplate.exchange(url, HttpMethod.POST, entity,
                    AuthenTokenResponse.class, args);
            return Response.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(1000, e.getMessage());
        }
    }



}




