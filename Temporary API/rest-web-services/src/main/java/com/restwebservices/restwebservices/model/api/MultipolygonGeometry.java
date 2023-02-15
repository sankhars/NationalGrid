package com.restwebservices.restwebservices.model.api;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class MultipolygonGeometry {

    @Schema(description ="Geometry Type", example="MULTIPOLYGON")
    @NotBlank
    private GeometryType type;

    @Schema(description = "Coordinates for the geometry to draw multipolygon")
    @NotBlank
    private List<List<WGS84Coordinate>> coordinates;

   public MultipolygonGeometry(List<List<WGS84Coordinate>> coordinates) {
        this.type = GeometryType.MULTIPOLYGON;
        this.coordinates = coordinates;
    }

    public List<List<WGS84Coordinate>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<WGS84Coordinate>> coordinates) {
        this.coordinates = coordinates;
    }

    public GeometryType getType() {
        return type;
    }


}
