package com.equinix.ecp.service;

import com.equinix.ecp.APIException;
import com.equinix.ecp.config.ApiConfig;
import com.equinix.ecp.config.AttachmentVariables;
import com.equinix.ecp.model.attachments.GetAttachmentsResponse;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.model.attachments.DelAttachmentsResponse;
import com.equinix.ecp.model.attachments.Attachments;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AttachmentAPIHandler {

    private ApiConfig apiConfigDoNotUpload = new ApiConfig();

    private RestTemplate restTemplate = new RestTemplate();
    private Map<String, String> fileId = new HashMap<>();


    public static Object getFile() throws IOException {
        Path tempFile = Paths.get(AttachmentVariables.ATTACHMENT_PATH);
        File file = tempFile.toFile();
        return new FileSystemResource(file);
    }

    public Attachments postAttachmentsResponse(AuthenTokenResponse response) throws APIException, IOException{

        String url = ApiConfig.URI + "/v1/attachments/file";

        MultiValueMap<String,Object> body=new LinkedMultiValueMap<String, Object>();
        body.add("uploadFile",getFile());

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);
        httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
        HttpEntity<MultiValueMap<String, Object>> requestEntity= new HttpEntity<MultiValueMap<String, Object>>(body, httpHeaders);
        try {
            ResponseEntity<Attachments> Response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, Attachments.class,body);
            fileId.put("uploaded", Response.getBody().getAttachmentId());
            return Response.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new APIException(1000, e.getMessage());
        }
    }

        public DelAttachmentsResponse deleteAttachmentsResponse(AuthenTokenResponse response) throws APIException {

            String url = ApiConfig.URI + "/v1/attachments/{attachmentId}";

            Map<String , String> params=new HashMap<String, String>();
            params.put("attachmentId", fileId.get("uploaded"));

            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setContentType(MediaType.APPLICATION_JSON);
            httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
            final HttpEntity entity = new HttpEntity(httpHeaders);

            try {
                ResponseEntity<DelAttachmentsResponse> Response = restTemplate.exchange(url, HttpMethod.DELETE, entity, DelAttachmentsResponse.class,params);
                return Response.getBody();
            } catch (Exception e) {
                e.printStackTrace();
                throw new APIException(1000, e.getMessage());
            }
    }
        public Attachments getAttachmentIdResponse(AuthenTokenResponse response) throws APIException {

            String url = ApiConfig.URI + "/v1/attachments/{attachmentId}";

            Map<String, String> params = new HashMap<String, String>();
            params.put("attachmentId", fileId.get("uploaded"));

            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setContentType(MediaType.APPLICATION_JSON);
            httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
            final HttpEntity entity = new HttpEntity(httpHeaders);

            try {
                ResponseEntity<Attachments> Response = restTemplate.exchange(url, HttpMethod.GET, entity, Attachments.class, params);
                return Response.getBody();
            } catch (Exception e) {
                e.printStackTrace();
                throw new APIException(1000, e.getMessage());
            }
    }
        public File getAttachmentIdFileResponse(AuthenTokenResponse response) throws APIException, IOException {

            String url = ApiConfig.URI + "/v1/attachments/{attachmentId}/file";

            Map<String, String> params = new HashMap<String, String>();
            params.put("attachmentId", fileId.get("uploaded"));

            restTemplate.getMessageConverters().add(new ByteArrayHttpMessageConverter());
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_OCTET_STREAM));
            httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
            final HttpEntity entity = new HttpEntity(httpHeaders);

            try {
                ResponseEntity<byte[]> Response = restTemplate.exchange(url, HttpMethod.GET, entity, byte[].class, params);

                return Files.write(Paths.get("<<path_to_write_file>>"), Response.getBody()).toFile();
            } catch (Exception e) {
                e.printStackTrace();
                throw new APIException(1000, e.getMessage());
            }
    }
        public GetAttachmentsResponse getAttachmentsResponse(AuthenTokenResponse response) throws APIException {

            String url = ApiConfig.URI + "/v1/attachments";

            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setContentType(MediaType.APPLICATION_JSON);
            httpHeaders.add("Authorization", ApiConfig.BEARER + response.getAccess_token());
            final HttpEntity entity = new HttpEntity(httpHeaders);

            try {
                ResponseEntity<GetAttachmentsResponse> Response = restTemplate.exchange(url, HttpMethod.GET, entity, GetAttachmentsResponse.class);
                return Response.getBody();
            } catch (Exception e) {
                e.printStackTrace();
                throw new APIException(1000, e.getMessage());
            }
    }
}
