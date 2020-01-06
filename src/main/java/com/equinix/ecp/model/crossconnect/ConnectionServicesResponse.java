package com.equinix.ecp.model.crossconnect;


import java.util.List;

public class ConnectionServicesResponse {

    private String name;
    private List<MediaTypes> mediaType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MediaTypes> getMediaType() {
        return mediaType;
    }

    public void setMediaType(List<MediaTypes> mediaType) {
        this.mediaType = mediaType;
    }
}
