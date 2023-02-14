package com.restwebservices.restwebservices.region;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restwebservices.restwebservices.model.geojson.Geometry;
import com.restwebservices.restwebservices.model.geojson.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class JacksonJsonToPojo {
    public static void main(String[] args) throws  IOException {
        ObjectMapper mapper = new ObjectMapper();

        // Read JSON file and convert to java object
        InputStream fileInputStream = new FileInputStream("region.json");
        Properties post1 = mapper.readValue(fileInputStream, Properties.class);
        fileInputStream.close();

        // print post object
        System.out.println("Printing post details");
        System.out.println(post1.getRegionID());
        System.out.println(post1.getRegionName());
        // print tags of this post
        for (Geometry tag : post1.getGeometry()) {
            System.out.println(tag.getType());
            System.out.println(tag.getCoordinates());

        }
    }
}
