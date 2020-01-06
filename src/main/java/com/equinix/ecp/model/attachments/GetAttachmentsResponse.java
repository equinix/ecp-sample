package com.equinix.ecp.model.attachments;

import com.equinix.ecp.model.Page;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetAttachmentsResponse {
    private List<Attachments> data;
    private Page page;
    @JsonProperty("_links")
    private Links links;

    public List<Attachments> getData() {
        return data;
    }

    public void setData(List<Attachments> data) {
        this.data = data;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
