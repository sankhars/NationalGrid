package com.restwebservices.restwebservices.init;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restwebservices.restwebservices.coordinate.CoordinateTransformService;
import com.restwebservices.restwebservices.model.api.*;
import com.restwebservices.restwebservices.model.geojson.Feature;
import com.restwebservices.restwebservices.model.geojson.GeoRegions;
import com.restwebservices.restwebservices.model.geojson.Geometry;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class ResourceLoader {

    @Autowired
    CoordinateTransformService coordinateTransformService;
    private GeoRegions geoRegions;

    private List<Region> regions = new ArrayList<>();


    @PostConstruct
    private void init() throws IOException {
        loadData();
        loadGeoRegionsToRegions();
    }

    private void loadGeoRegionsToRegions() {
        System.out.println("Start Load to regions");
        List<Feature> features = geoRegions.getFeatures();
        for (Feature feature: features) {
            List<List<WGS84Coordinate>> wgs84CoordinateLists = new ArrayList<>();
            List<WGS84Coordinate> wgs84CoordinateList = new ArrayList<>();
            wgs84CoordinateLists.add(wgs84CoordinateList);

            ArrayList<ArrayList<Double>> coordinates = feature.getGeometry().getCoordinates().get(0).get(0);
            for (ArrayList<Double> inputCoordinate: coordinates) {
                Coordinate outputCoordinate = coordinateTransformService.convertCoordinate(CoordinateType.OGSB, CoordinateType.WGS84, new Coordinate(inputCoordinate.get(0), inputCoordinate.get(1)));
                wgs84CoordinateList.add(new WGS84Coordinate(outputCoordinate.getX(), outputCoordinate.getY()));
            }


            MultipolygonGeometry multipolygonGeometrygeometry = new MultipolygonGeometry(wgs84CoordinateLists);
            regions.add(new Region(feature.getProperties().getRegionID(), feature.getProperties().getRegionName(), multipolygonGeometrygeometry));
        }
        System.out.println("End Load to regions");
    }

    private void loadData() throws IOException {

        InputStream is = getResourceFileAsInputStream("gsp_region.json");
        if (is != null) {
            System.out.println("gsp_region.json is loaded");
            //byte[] testData = is.readAllBytes();
            //System.out.println("Part of data: " + new String(testData));
            ObjectMapper mapper = new ObjectMapper();
            geoRegions = mapper.readValue(is, GeoRegions.class);

        } else {
            throw new RuntimeException("resource not found");
        }
    }

    private InputStream getResourceFileAsInputStream(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        return classLoader.getResourceAsStream(fileName);
    }

    public GeoRegions getGeoRegions() {
        return geoRegions;
    }

    public List<Region> getRegions() {
        return regions;
    }
}
