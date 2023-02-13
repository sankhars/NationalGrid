package com.restwebservices.restwebservices.region;


import com.restwebservices.restwebservices.model.WGS84Coordinate;
import com.restwebservices.restwebservices.model.Geometry;
import com.restwebservices.restwebservices.model.GeometryType;
import com.restwebservices.restwebservices.model.Region;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class RegionDaoService {
     //jpa hibernate database

    private static List<Region> regions = new ArrayList<>();

    static{
        List<WGS84Coordinate> coordinateList1 = new ArrayList<>();
        coordinateList1.add(new WGS84Coordinate(BigDecimal.valueOf(-1.18901), BigDecimal.valueOf(51.71105)));
        coordinateList1.add(new WGS84Coordinate(BigDecimal.valueOf(-0.90565), BigDecimal.valueOf(51.92579)));
        coordinateList1.add(new WGS84Coordinate(BigDecimal.valueOf(-1.21548), BigDecimal.valueOf(52.59726)));

        List<WGS84Coordinate> coordinateList2 = new ArrayList<>();
        coordinateList2.add(new WGS84Coordinate(BigDecimal.valueOf(-3.13901), BigDecimal.valueOf(50.72205)));
        coordinateList2.add(new WGS84Coordinate(BigDecimal.valueOf(-2.90535), BigDecimal.valueOf(53.92459)));
        coordinateList2.add(new WGS84Coordinate(BigDecimal.valueOf(-0.21518), BigDecimal.valueOf(50.51766)));

        regions.add(new Region(149,"Beddington (_J)", new Geometry(GeometryType.MULTIPOLYGON, coordinateList1)));
        regions.add(new Region(150,"Northfleet East", new Geometry(GeometryType.MULTIPOLYGON, coordinateList2)));

        //Regions.add(new Region(149,"Beddington (_J)", 543750.560992400394753));
        //Regions.add(new Region(150,"Northfleet East", 571652.936367866466753));
        //Regions.add(new Region(155,"Sellindge", 624923.597685541724786));
    }
    public List<Region> findAll(){
        return regions;
    }

    public Region findOne(int id){
        Predicate<? super Region> predicate = Region->Region.getId().equals(id);
        return regions.stream().filter(predicate).findFirst().get();
    }

}
