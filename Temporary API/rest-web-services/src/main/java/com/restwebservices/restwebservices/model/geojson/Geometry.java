package com.restwebservices.restwebservices.model.geojson;

import java.math.BigDecimal;

public class Geometry{
    public String type;
    public BigDecimal coordinates;

    public Geometry(String type, BigDecimal coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public Geometry() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(BigDecimal coordinates) {
        this.coordinates = coordinates;
    }
}