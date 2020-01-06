package com.equinix.ecp.service;

import com.equinix.ecp.APIException;
import com.equinix.ecp.config.ApiConfig;
import com.equinix.ecp.config.workVisit.WorkVisitRequestConfig;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.model.workVisit.LocationResponse;
import com.equinix.ecp.model.workVisit.WorkVisitResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class WorkVisitAPIHandler {
    private RestTemplate restTemplate = new RestTemplate();

    public LocationResponse getWorkVisitLocation(AuthenTokenResponse response) throws APIException {

        String url = ApiConfig.URI + "/v1/orders/workvisit/locations";

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url)
                .queryParam("detail", "true");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        try {
            ResponseEntity<LocationResponse> responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET, httpEntity, LocationResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public WorkVisitResponse getWorkVisitResponse(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/workvisit";

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(WorkVisitRequestConfig.WorkVisitRequestBody(), httpHeaders);

        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
        try {
            ResponseEntity<WorkVisitResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, WorkVisitResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

}
