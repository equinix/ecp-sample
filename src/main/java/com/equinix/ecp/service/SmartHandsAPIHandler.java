package com.equinix.ecp.service;

import com.equinix.ecp.APIException;
import com.equinix.ecp.config.*;
import com.equinix.ecp.config.smartHands.*;
import com.equinix.ecp.config.smartHands.SmartHandsCableRequest;
import com.equinix.ecp.config.smartHands.SmartHandsCageCleanupRequest;
import com.equinix.ecp.config.smartHands.SmartHandsCageEscortRequest;
import com.equinix.ecp.config.smartHands.SmartHandsEquipInstallRequest;
import com.equinix.ecp.config.smartHands.SmartHandsLocatePackageRequest;
import com.equinix.ecp.config.smartHands.SmartHandsOtherRequest;
import com.equinix.ecp.model.PlaceOrderResponse;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.model.smarthands.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class SmartHandsAPIHandler {

    private RestTemplate restTemplate = new RestTemplate();

    public SmartHandsAPIHandler() {
    }

    public PlaceOrderResponse getSmartHandsMoveCablesResponse (AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/moveJumperCable";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(SmartHandsMoveCablesRequest.request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getSmartHandsLocatePackageResponse (AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/locatePackage";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(SmartHandsLocatePackageRequest.request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getSmartHandsPicturesDocumentResponse (AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/picturesDocument";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(SmartHandsPicDocumentsRequest.request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getSmartHandsPatchCableInstallResponse (AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/patchCableInstall";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(SmartHandsPatchCableInstallRequest.request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getSmartHandsPatchCableRemovalResponse (AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/patchCableRemoval";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(SmartHandsPatchCableRemovalResponse.request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }


    public PlaceOrderResponse getSmartHandsCableRequest (AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/cableRequest";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(SmartHandsCableRequest.request(),httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getSmartHandsRunJumperCable (AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/runJumperCable";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(SmartHandsRunJumperCableRequest.request() , httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }


    public PlaceOrderResponse getEquipmentInstallResponse(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/equipmentInstall";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(SmartHandsEquipInstallRequest.request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getCageCleanupResponse(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/cageCleanup";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(SmartHandsCageCleanupRequest.request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getCageEscortResponse(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/cageEscort";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(SmartHandsCageEscortRequest.request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getShipmentUnpackResponse(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/shipmentUnpack";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity(SmartHandsShipmentUnpackRequest.request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public PlaceOrderResponse getSmartHandsOtherResponse(AuthenTokenResponse response) throws APIException, JsonProcessingException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/other";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<String> httpEntity = new HttpEntity<>(SmartHandsOtherRequest.request(), httpHeaders);
        try {
            ResponseEntity<PlaceOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, PlaceOrderResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }


    public LocationsList getLocationResponse(AuthenTokenResponse response) throws APIException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/locations";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        try {
            ResponseEntity<LocationsList> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, LocationsList.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

    public SmartHandsList getSmartHandsList(AuthenTokenResponse response) throws APIException {

        String url = ApiConfig.URI + "/v1/orders/smarthands/types";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        try {
            ResponseEntity<SmartHandsList> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, SmartHandsList.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }


}
