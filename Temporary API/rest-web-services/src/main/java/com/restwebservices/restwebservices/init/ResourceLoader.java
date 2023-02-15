package com.restwebservices.restwebservices.init;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restwebservices.restwebservices.model.geojson.Geometry;
import com.restwebservices.restwebservices.model.geojson.Regions;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component
public class ResourceLoader {
    private Regions regions;

    @PostConstruct
    public void loadJson() throws IOException {

        InputStream is = getResourceFileAsInputStream("gsp_region.json");
        if (is != null) {
            System.out.println("gsp_region.json is loaded");
            byte[] testData = is.readNBytes(100);
            System.out.println("Part of data: " + new String(testData));
          //  ObjectMapper mapper = new ObjectMapper();
            //regions = mapper.readValue(is, Regions.class);

        } else {
            throw new RuntimeException("resource not found");
        }
    }

    public InputStream getResourceFileAsInputStream(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        return classLoader.getResourceAsStream(fileName);
    }

    public Regions getRegions() {
        return regions;
    }
}
