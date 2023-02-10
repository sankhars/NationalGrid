package com.restwebservices.restwebservices.model;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

import java.util.List;


public class Geometry {
    @Schema(description ="Geometry Type", example="POINT or MULTIPOLYGON")
    @NotBlank
    private GeometryType type;
    @Schema(description ="Coordinates for the geometry to draw a point or multipolygon")
    @NotBlank
    private List<Coordinate> coordinates;

    public Geometry(GeometryType type, List<Coordinate> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public GeometryType getType() {
        return type;
    }

    public void setType(GeometryType type) {
        this.type = type;
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }
}
