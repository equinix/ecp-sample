package com.equinix.ecp.service;

import com.equinix.ecp.APIException;
import com.equinix.ecp.config.*;
import com.equinix.ecp.config.crossConnect.CrossConnectDeinstallRequest;
import com.equinix.ecp.config.crossConnect.CrossConnectExtendedRequest;
import com.equinix.ecp.config.crossConnect.CrossConnectFiberRequest;
import com.equinix.ecp.config.crossConnect.CrossConnectIntracustomerRequest;
import com.equinix.ecp.config.crossConnect.CrossConnectStandardRequest;
import com.equinix.ecp.model.PlaceOrderResponse;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.model.crossconnect.*;
import com.equinix.ecp.model.smarthands.LocationsList;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

public class CrossConnectAPIHandler {

    private RestTemplate restTemplate = new RestTemplate();

    public List<CrossConnectProviders> getCrossConnectProvidersResponse(AuthenTokenResponse response) throws APIException {

        String url = ApiConfig.URI + "/v1/orders/crossconnect/providers";

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url)
                .queryParam("crossConnectType", "STANDARD")
                .queryParam("ibx", "AT2")
                .queryParam("cage", "AT2:02:V050005-6-591")
                .queryParam("account", "109880");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<String>(httpHeaders);

        try {
            ResponseEntity<List<CrossConnectProviders>> responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<CrossConnectProviders>>() {
            });
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public LocationsList getLocationsList(AuthenTokenResponse response) throws APIException {

        String url = ApiConfig.URI + "/v1/orders/crossconnect/locations";

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url)
                .queryParam("detail", "true");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<String>(httpHeaders);
        try {
            ResponseEntity<LocationsList> responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET, httpEntity, LocationsList.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public CrossConnectTypesList getCrossConnectTypesList(AuthenTokenResponse response) throws APIException {

        String url = ApiConfig.URI + "/v1/orders/crossconnect/types";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<String>(httpHeaders);
        try {
            ResponseEntity<CrossConnectTypesList> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, CrossConnectTypesList.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public List<ConnectionServicesResponse> getConnectionServicesResponse(AuthenTokenResponse response) throws APIException {

        String url = ApiConfig.URI + "/v1/orders/crossconnect/connectionservices";

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url)
                .queryParam("ibx", "CH1");


        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
        try {
            ResponseEntity<List<ConnectionServicesResponse>> responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<ConnectionServicesResponse>>(){});
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PatchPanel getPatchPanelResponse(AuthenTokenResponse response) throws APIException {

        String url = ApiConfig.URI + "/v1/orders/crossconnect/patchpanel";

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url)
                .queryParam("name", "PP:0505:193361");


        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<String>(httpHeaders);
        try {
            ResponseEntity<PatchPanel> responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET, httpEntity, PatchPanel.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getCrossConnectStandardResponse(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/crossconnect/standard";

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url)
                .queryParam("action", "SUBMIT");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<String>(CrossConnectStandardRequest.Request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getCrossConnectIntracustomerResponse(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/crossconnect/intracustomer";

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("action", "SUBMIT");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<String>(CrossConnectIntracustomerRequest.Request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getCrossConnectExtendedResponse(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/crossconnect/extended";

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url)
                .queryParam("action", "SUBMIT");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<String>(CrossConnectExtendedRequest.RequestBody(), httpHeaders);

        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getCrossConnectFiberResponse(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/crossconnect/fiber";

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url)
                .queryParam("action", "SUBMIT");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<String>(CrossConnectFiberRequest.request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getCrossConnectDeinstallResponse(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/crossconnect/deinstall";

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(url)
                .queryParam("action", "SUBMIT");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<String>(CrossConnectDeinstallRequest.request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

}
