package com.equinix.ecp.examples;

import com.equinix.ecp.APIException;
import com.equinix.ecp.Util;
import com.equinix.ecp.model.attachments.GetAttachmentsResponse;
import com.equinix.ecp.model.authentication.AuthenTokenResponse;
import com.equinix.ecp.model.attachments.Attachments;
import com.equinix.ecp.model.attachments.DelAttachmentsResponse;
import com.equinix.ecp.service.AttachmentAPIHandler;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.File;

public class AttachmentExample {

    private static AuthenTokenResponse authenTokenResponse;

    public static void main(String[] args) throws JsonProcessingException {

        AttachmentAPIHandler attachmentAPIHandler=new AttachmentAPIHandler();

        try {
            authenTokenResponse = Util.createToken();
            System.out.println("Response : \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(authenTokenResponse));
        } catch (APIException ex) {
            ex.printStackTrace();
            System.out.println("Authentication Error Response is " + ex.getMessage());
        }

        try {
            Attachments attachmentsResponse = attachmentAPIHandler.postAttachmentsResponse(authenTokenResponse);
            System.out.println("Response is: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (attachmentsResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }

        try {
            Attachments attachmentIdResponse = attachmentAPIHandler.getAttachmentIdResponse(authenTokenResponse);
            System.out.println("Response is: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (attachmentIdResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }
        try {
            File attachmentIdFileResponse = attachmentAPIHandler.getAttachmentIdFileResponse(authenTokenResponse);
            System.out.println("Response is: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (attachmentIdFileResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }
        try {
            GetAttachmentsResponse getAttachmentsResponse = attachmentAPIHandler.getAttachmentsResponse(authenTokenResponse);
            System.out.println("Response is: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (getAttachmentsResponse));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }
        try {
            DelAttachmentsResponse attachmentsDelete = attachmentAPIHandler.deleteAttachmentsResponse(authenTokenResponse);
            System.out.println("Response is: \n " + Util.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString
                    (attachmentsDelete));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Response " + e.getMessage());
        }
    }
}
