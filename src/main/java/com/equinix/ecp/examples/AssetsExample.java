package com.equinix.ecp.examples;

import com.equinix.ecp.APIException;
import com.equinix.ecp.Util;
import com.equinix.ecp.model.Assets.AssetsDetailsResponse;
import com.equinix.ecp.model.Assets.AssetsSearchResponse;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.service.AssetAPIHandler;
import com.fasterxml.jackson.core.JsonProcessingException;

public class AssetsExample {

    private static AuthenTokenResponse authenTokenResponse;

    public static void main(String[] args) throws JsonProcessingException {

        AssetAPIHandler assetAPIHandler=new AssetAPIHandler();

        try {
            authenTokenResponse = Util.createToken();
            System.out.println("Response is: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(authenTokenResponse));
        } catch (APIException ex) {
            ex.printStackTrace();
            System.out.println("Error Response is " + ex.getMessage());
        }

        try {
            AssetsSearchResponse assetsSearchResponse = assetAPIHandler.getSearchAsset(authenTokenResponse);
            System.out.println("Response is :: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (assetsSearchResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Search Asset Error Response " + e.getMessage());
        }

        try {
            AssetsDetailsResponse assetsDetailsResponse = assetAPIHandler.getAssetDetails(authenTokenResponse);
            System.out.println("Search Asset by Detail is :: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(assetsDetailsResponse));
        } catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Search Asset by Detail Error Response "+ex.getMessage());
        }

        }
    }


