package com.restwebservices.restwebservices.model.api;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;


public class Asset {
    @Schema(description = "Gnode Name, unique identifier", example = "COWL")
    @NotBlank
    private String gnodeName;

    @NotBlank
    private PointGeometry geometry;

    public Asset(String gnodeName, PointGeometry geometry) {
        this.gnodeName = gnodeName;
        this.geometry = geometry;
    }

    public String getGnodeName() {
        return gnodeName;
    }

    public void setGnodeName(String gnodeName) {
        this.gnodeName = gnodeName;
    }

    public PointGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(PointGeometry geometry) {
        this.geometry = geometry;
    }
}
