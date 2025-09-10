package com.example.demo.models.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NeoObject {

    public class NeoObject {

        @JsonProperty("id")
        private String id;

        @JsonProperty("neo_reference_id")
        private String neoReferenceId;

        @JsonProperty("name")
        private String name;

        @JsonProperty("nasa_jpl_url")
        private String nasaJplUrl;

        @JsonProperty("absolute_magnitude_h")
        private Double absoluteMagnitudeH;

        @JsonProperty("estimated_diameter")
        private EstimatedDiameter estimatedDiameter;

        @JsonProperty("is_potentially_hazardous_asteroid")
        private boolean isPotentiallyHazardousAsteroid;

        @JsonProperty("close_approach_data")
        private List<CloseApproachData> closeApproachData;

        @JsonProperty("orbital_data")
        private OrbitalData orbitalData;

        @JsonProperty("is_sentry_object")
        private boolean isSentryObject;

        // Construtor padrão
        public NeoObject() {}

        // Getters e Setters
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNeoReferenceId() {
            return neoReferenceId;
        }

        public void setNeoReferenceId(String neoReferenceId) {
            this.neoReferenceId = neoReferenceId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNasaJplUrl() {
            return nasaJplUrl;
        }

        public void setNasaJplUrl(String nasaJplUrl) {
            this.nasaJplUrl = nasaJplUrl;
        }

        public Double getAbsoluteMagnitudeH() {
            return absoluteMagnitudeH;
        }

        public void setAbsoluteMagnitudeH(Double absoluteMagnitudeH) {
            this.absoluteMagnitudeH = absoluteMagnitudeH;
        }

        public EstimatedDiameter getEstimatedDiameter() {
            return estimatedDiameter;
        }

        public void setEstimatedDiameter(EstimatedDiameter estimatedDiameter) {
            this.estimatedDiameter = estimatedDiameter;
        }

        public boolean isPotentiallyHazardousAsteroid() {
            return isPotentiallyHazardousAsteroid;
        }

        public void setPotentiallyHazardousAsteroid(boolean potentiallyHazardousAsteroid) {
            isPotentiallyHazardousAsteroid = potentiallyHazardousAsteroid;
        }

        public List<CloseApproachData> getCloseApproachData() {
            return closeApproachData;
        }

        public void setCloseApproachData(List<CloseApproachData> closeApproachData) {
            this.closeApproachData = closeApproachData;
        }

        public OrbitalData getOrbitalData() {
            return orbitalData;
        }

        public void setOrbitalData(OrbitalData orbitalData) {
            this.orbitalData = orbitalData;
        }

        public boolean isSentryObject() {
            return isSentryObject;
        }

        public void setSentryObject(boolean sentryObject) {
            isSentryObject = sentryObject;
        }
    }
}
