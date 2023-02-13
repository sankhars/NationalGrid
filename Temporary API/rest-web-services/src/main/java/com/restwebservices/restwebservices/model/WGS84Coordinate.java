package com.restwebservices.restwebservices.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

@Schema(description="Coordinate system are In WGS84 Format")
public class WGS84Coordinate {
    @Schema(description ="Value is in Dec format", example="51.71105")
    @NotBlank
    private BigDecimal latitude;
    @Schema(description ="Value is in Dec format", example="-1.18901")
    @NotBlank
    private BigDecimal longitude;

    public WGS84Coordinate(BigDecimal longitude, BigDecimal latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }
}
