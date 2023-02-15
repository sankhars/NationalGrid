package com.restwebservices.restwebservices.model.geojson;


import java.util.ArrayList;

public class Regions {
    public String type;
    public String name;

    public Regions(String type, String name, ArrayList<Feature> features) {
        this.type = type;
        this.name = name;
        this.features = features;
    }
    public Regions(){

    }

    public ArrayList<Feature> features;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
}