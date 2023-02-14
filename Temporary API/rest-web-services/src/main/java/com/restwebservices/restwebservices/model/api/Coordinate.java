package com.restwebservices.restwebservices.model.api;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public class Coordinate {
    @Schema(description = "X or Longitude", example = "552880.0000000007")
    @NotBlank
    private BigDecimal x;
    @Schema(description = "Y or Latitude", example = "326280.99999999866")
    @NotBlank
    private BigDecimal y;

    public Coordinate() {
    }

    public Coordinate(Double x, Double y) {
        this.x = BigDecimal.valueOf(x);
        this.y = BigDecimal.valueOf(y);
    }

    public Coordinate(BigDecimal x, BigDecimal y) {
        this.x = x;
        this.y = y;
    }

    public BigDecimal getX() {
        return x;
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }

    public BigDecimal getY() {
        return y;
    }

    public void setY(BigDecimal y) {
        this.y = y;
    }
}
