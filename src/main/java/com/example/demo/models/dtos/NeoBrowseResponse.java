package com.example.demo.models.dtos;

import com.example.demo.models.entities.NeoObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class NeoBrowseResponse {

    @JsonProperty("links")
    private Links links;

    @JsonProperty("page")
    private Page page;

    @JsonProperty("near_earth_objects")
    private List<NeoObject> nearEarthObjects;

    // Construtor padrão
    public NeoBrowseResponse() {}

    // Getters e Setters
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public List<NeoObject> getNearEarthObjects() {
        return nearEarthObjects;
    }

    public void setNearEarthObjects(List<NeoObject> nearEarthObjects) {
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

    // Classe interna para Page
    public static class Page {
        @JsonProperty("size")
        private int size;

        @JsonProperty("total_elements")
        private int totalElements;

        @JsonProperty("total_pages")
        private int totalPages;

        @JsonProperty("number")
        private int number;

        // Getters e Setters
        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotalElements() {
            return totalElements;
        }

        public void setTotalElements(int totalElements) {
            this.totalElements = totalElements;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
