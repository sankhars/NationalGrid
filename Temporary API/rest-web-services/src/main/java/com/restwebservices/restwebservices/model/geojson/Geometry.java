package com.restwebservices.restwebservices.model.geojson;

import java.util.ArrayList;

public class Geometry{
    public String type;
    public ArrayList<ArrayList<ArrayList<ArrayList<Double>>>> coordinates;

    public Geometry(String type, ArrayList<ArrayList<ArrayList<ArrayList<Double>>>> coordinates) {
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

    public ArrayList<ArrayList<ArrayList<ArrayList<Double>>>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<ArrayList<ArrayList<ArrayList<Double>>>> coordinates) {
        this.coordinates = coordinates;
    }
}

