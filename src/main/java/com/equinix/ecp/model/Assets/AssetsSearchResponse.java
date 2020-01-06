package com.equinix.ecp.model.Assets;

import com.equinix.ecp.model.Page;
import com.equinix.ecp.model.ReferenceLink;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class AssetsSearchResponse {

    @JsonProperty("data")
    private List<Assets> assetsSearchResponse;
    @JsonProperty("page")
    private Page page;
    @JsonProperty("_links")
    private Map<String, ReferenceLink> links = null;

    public AssetsSearchResponse() {
    }

    public List<Assets> getAssetsSearchResponse() {
        return assetsSearchResponse;
    }

    public void setAssetsSearchResponse(List<Assets> assetsSearchResponse) {
        this.assetsSearchResponse = assetsSearchResponse;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Map<String, ReferenceLink> getLinks() {
        return links;
    }

    public void setLinks(Map<String, ReferenceLink> links) {
        this.links = links;
    }
}
