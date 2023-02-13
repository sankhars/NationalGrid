package com.restwebservices.restwebservices.model;

public enum CoordinateType {
    OGSB(27700), WGS84(4326);
    private final int type;

    private CoordinateType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
