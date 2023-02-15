package com.restwebservices.restwebservices.region;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restwebservices.restwebservices.model.geojson.GeoRegions;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class JacksonJsonToPojo {
    public static void main(String[] args) throws  IOException {
        ObjectMapper mapper = new ObjectMapper();




//        ClassLoader classLoader = JacksonJsonToPojo.class.getClassLoader();
       // File file = new File(classLoader.getResource("gsp_region.json").getFile());
        // Read JSON file and convert to java object
        InputStream fileInputStream = new FileInputStream("src/main/resources/gsp_region.json");
        GeoRegions post1 = mapper.readValue(fileInputStream, GeoRegions.class);
        fileInputStream.close();

        // print post object
        System.out.println("Printing post details");
        System.out.println(post1.getType());
        System.out.println(post1.getFeatures().get(0).getProperties().getRegionName());
        System.out.println(post1.getFeatures().get(0).getGeometry().getCoordinates().get(0).get(0).get(0).get(0));
       // System.out.println(post1.getName());
        // print tags of this post
        /*
        for (Geometry tag : post1.getGeometry()) {
            System.out.println(tag.getType());
            System.out.println(tag.getCoordinates());

        }
        */
    }
}
