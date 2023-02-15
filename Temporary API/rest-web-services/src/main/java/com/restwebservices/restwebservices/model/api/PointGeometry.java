package com.restwebservices.restwebservices.model.api;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class PointGeometry {

    @Schema(description ="Geometry Type", example="POINT")
    @NotBlank
    private GeometryType type;

    @Schema(description = "Coordinates for the geometry to draw a point")
    @NotBlank
    private WGS84Coordinate coordinate;

    public PointGeometry(WGS84Coordinate coordinate) {
        this.type = GeometryType.POINT;
        this.coordinate = coordinate;
    }

    public WGS84Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(WGS84Coordinate coordinates) {
        this.coordinate = coordinate;
    }

    public GeometryType getType() {
        return type;
    }


}
