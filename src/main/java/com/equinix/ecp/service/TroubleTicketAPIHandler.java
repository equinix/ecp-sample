package com.equinix.ecp.service;

import com.equinix.ecp.APIException;
import com.equinix.ecp.config.ApiConfig;
import com.equinix.ecp.config.troubleTicket.TroubleTicketRequestConfig;
import com.equinix.ecp.model.PlaceOrderResponse;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.model.troubleTicket.LocationsResponse;
import com.equinix.ecp.model.troubleTicket.TroubleTicketTypes;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class TroubleTicketAPIHandler {

    private RestTemplate restTemplate = new RestTemplate();

    public TroubleTicketAPIHandler() {
    }

    public TroubleTicketTypes getTroubleTicketTypesResponse(AuthenTokenResponse response) throws APIException {

        String url = ApiConfig.URI + "/v1/orders/troubleticket/types";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        try {
            ResponseEntity<TroubleTicketTypes> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, TroubleTicketTypes.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public LocationsResponse getTroubleTicketLocations(AuthenTokenResponse response) throws APIException {

        String url = ApiConfig.URI + "/v1/orders/troubleticket/locations";

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url)
                .queryParam("detail", "true");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        try {
            ResponseEntity<LocationsResponse> responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET, httpEntity, LocationsResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getTroubleTicketResponse(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/troubleticket";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(TroubleTicketRequestConfig.TroubleTicketRequestBody(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }
}


