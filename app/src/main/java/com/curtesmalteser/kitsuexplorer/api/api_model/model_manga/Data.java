
package com.curtesmalteser.kitsuexplorer.api.api_model.model_manga;

import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("attributes")
    @Expose
    private com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Attributes attributes;
    @SerializedName("relationships")
    @Expose
    private Relationships relationships;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Attributes attributes) {
        this.attributes = attributes;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationships relationships) {
        this.relationships = relationships;
    }

}
