package com.restwebservices.restwebservices.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;


public class Asset {
    @Schema(description = "Gnode Name, unique identifier", example = "COWL")
    @NotBlank
    private String gnodeName;


    @NotBlank
    private Geometry geometry;

    public Asset(String gnodeName, Geometry geometry) {
        this.gnodeName = gnodeName;
        this.geometry = geometry;
    }

    public String getGnodeName() {
        return gnodeName;
    }

    public void setGnodeName(String gnodeName) {
        this.gnodeName = gnodeName;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
