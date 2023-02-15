package com.restwebservices.restwebservices.model.geojson;


public class Feature{
    public String type;
    public Properties properties;
    public Geometry geometry;

        public Feature() {
        }

        public Feature(String type, Properties properties, Geometry geometry) {
            this.type = type;
            this.properties = properties;
            this.geometry = geometry;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Properties getProperties() {
            return properties;
        }

        public void setProperties(Properties properties) {
            this.properties = properties;
        }

        public Geometry getGeometry() {
            return geometry;
        }

        public void setGeometry(Geometry geometry) {
            this.geometry = geometry;
        }
    }

