package com.restwebservices.restwebservices.model.geojson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Properties {
   @JsonProperty("RegionID")
    public int regionID;
   @JsonProperty("RegionName")
      public String regionName;

    public Properties( int regionID, String regionName) {
        this.regionID = regionID;
        this.regionName = regionName;
    }
    public Properties(){

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
}
