package com.equinix.ecp.service;

import com.equinix.ecp.APIException;
import com.equinix.ecp.config.ApiConfig;
import com.equinix.ecp.model.Assets.AssetsDetailsResponse;
import com.equinix.ecp.model.Assets.AssetsSearchResponse;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

    public class AssetAPIHandler {

        private ApiConfig apiConfigDoNotUpload = new ApiConfig();

        private RestTemplate restTemplate = new RestTemplate();

        public AssetsSearchResponse getSearchAsset(AuthenTokenResponse response) throws APIException {

        String url = ApiConfig.URI + "/v1/assets/search";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        try {
            ResponseEntity<AssetsSearchResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, AssetsSearchResponse.class);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

        public AssetsDetailsResponse getAssetDetails(AuthenTokenResponse response) throws APIException {

        String url = ApiConfig.URI + "/v1/assets/{assetId}";
        Map<String, String> params = new HashMap<>();
        params.put("assetId", "<<asset_id_to_load>>");//Pass the asset id that need to load here.

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity httpEntity = new HttpEntity(httpHeaders);

        try {
            ResponseEntity<AssetsDetailsResponse> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, AssetsDetailsResponse.class, params);
            return responseEntity.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(3000, e.getMessage());
        }
    }

}
