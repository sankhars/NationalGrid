package com.restwebservices.restwebservices.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class Region {
    @Schema(description ="Region Name", example="Northfleet East")
    @NotBlank
    private String name;

    @Schema(description ="Region ID", example="150")
    @NotBlank
    private Integer id;

    @NotBlank
    private Geometry geometry;

    public Region(Integer id, String name, Geometry geometry) {
        this.id = id;
        this.name = name;
        this.geometry = geometry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
