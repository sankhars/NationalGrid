package com.restwebservices.restwebservices.model.api;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;


public class Region {
    @Schema(description ="Region Name", example="Northfleet East")
    @NotBlank
    private String name;

    @Schema(description ="Region ID", example="150")
    @NotBlank
    private Integer id;

    @NotBlank
    private MultipolygonGeometry geometry;

    public Region(Integer id, String name, MultipolygonGeometry geometry) {
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

    public MultipolygonGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(MultipolygonGeometry geometry) {
        this.geometry = geometry;
    }

//    public static Region valueOf(GeoJson) {
//        //for
//    }
}
