package com.example.demo.models.dtos;

import com.example.demo.models.entities.NeoObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class NeoFeedResponse {
    @JsonProperty("links")
    private Links links;

    @JsonProperty("element_count")
    private int elementCount;

    @JsonProperty("near_earth_objects")
    private Map<String, List<NeoObject>> nearEarthObjects;

    // Construtor padrão
    public NeoFeedResponse() {}

    // Getters e Setters
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public int getElementCount() {
        return elementCount;
    }

    public void setElementCount(int elementCount) {
        this.elementCount = elementCount;
    }

    public Map<String, List<NeoObject>> getNearEarthObjects() {
        return nearEarthObjects;
    }

    public void setNearEarthObjects(Map<String, List<NeoObject>> nearEarthObjects) {
        this.nearEarthObjects = nearEarthObjects;
    }

    // Classe interna para Links
    public static class Links {
        @JsonProperty("next")
        private String next;

        @JsonProperty("prev")
        private String prev;

        @JsonProperty("self")
        private String self;

        // Getters e Setters
        public String getNext() {
            return next;
        }

        public void setNext(String next) {
            this.next = next;
        }

        public String getPrev() {
            return prev;
        }

        public void setPrev(String prev) {
            this.prev = prev;
        }

        public String getSelf() {
            return self;
        }

        public void setSelf(String self) {
            this.self = self;
        }
    }
}
