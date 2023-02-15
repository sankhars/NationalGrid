package com.restwebservices.restwebservices.model.api;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;


public class LicenseArea {
    @Schema(description = "LicenseArea Name", example = "_A")
    @NotBlank
    private String name;

    @Schema(description = "LicenseArea Long Name", example = "UKPN (East)")
    @NotBlank
    private String longName;

    @Schema(description = "LicenseArea ID", example = "10")
    @NotBlank
    private Integer id;

    @NotBlank
    private MultipolygonGeometry geometry;

    public LicenseArea(Integer id, String name, String longName, MultipolygonGeometry geometry) {
        this.name = name;
        this.longName = longName;
        this.id = id;
        this.geometry = geometry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MultipolygonGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(MultipolygonGeometry geometry) {
        this.geometry = geometry;
    }
}
