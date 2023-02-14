package com.restwebservices.restwebservices.model.geojson;


import java.util.HashSet;
import java.util.Set;

public class Properties{

    public int regionID;

    public String regionName;
    private Set<Geometry> geometry = new HashSet< >();



    public Properties(int regionID, String regionName) {
        this.regionID = regionID;
        this.regionName = regionName;
    }

    public Properties() {

    }

    public int getRegionID() {
        return regionID;
    }

    public void setRegionID(int regionID) {
        this.regionID = regionID;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    public Set<Geometry> getGeometry() {
        return geometry;
    }

    public void setGeometry(Set<Geometry> geometry) {
        this.geometry = geometry;
    }
}