package com.equinix.ecp.service;

import com.equinix.ecp.APIException;
import com.equinix.ecp.config.ApiConfig;
import com.equinix.ecp.config.shipment.InBoundShipmentRequestConfig;
import com.equinix.ecp.config.shipment.OutboundShipmentRequestConfig;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.model.shipment.ShipmentInboundResponse;
import com.equinix.ecp.model.shipment.ShipmentLocationResponse;
import com.equinix.ecp.model.shipment.ShipmentOutboundResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class ShipmentAPIHandler {
    private RestTemplate restTemplate = new RestTemplate();

    public ShipmentAPIHandler() {
    }

    public ShipmentLocationResponse getShipmentLocation(AuthenTokenResponse response) throws APIException {

        String url = ApiConfig.URI + "/v1/orders/shipment/locations";

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url)
                .queryParam("detail", "true");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());

        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        try {
            ResponseEntity<ShipmentLocationResponse> responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET, httpEntity, ShipmentLocationResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }
    public ShipmentInboundResponse getShipmentInbound(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/shipment/inbound";

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(InBoundShipmentRequestConfig.ShipmentRequestBody(), httpHeaders);

        try {
            ResponseEntity<ShipmentInboundResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, ShipmentInboundResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }
    public ShipmentOutboundResponse getShipmentOutbound(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/shipment/outbound";

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(OutboundShipmentRequestConfig.ShipmentRequestBody(), httpHeaders);

        try {
            ResponseEntity<ShipmentOutboundResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, ShipmentOutboundResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }
}
