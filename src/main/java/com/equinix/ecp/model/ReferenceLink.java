package com.equinix.ecp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReferenceLink implements Serializable {
    @JsonProperty("href")
    private String href = null;

    public ReferenceLink() {
    }

    public ReferenceLink href(String href) {
        this.href = href;
        return this;
    }

    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
