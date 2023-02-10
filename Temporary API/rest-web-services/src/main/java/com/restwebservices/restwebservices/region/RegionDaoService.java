package com.restwebservices.restwebservices.region;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class RegionDaoService {
     //jpa hibernate database

    private static List<Region> Regions = new ArrayList<>();

    static{
        Regions.add(new Region(149,"Beddington (_J)", 543750.560992400394753));
        Regions.add(new Region(150,"Northfleet East", 571652.936367866466753));
        Regions.add(new Region(155,"Sellindge", 624923.597685541724786));
    }
    public List<Region> findAll(){
        return Regions;
    }

    public Region findOne(int id){
        Predicate<? super Region> predicate = Region->Region.getId().equals(id);
        return Regions.stream().filter(predicate).findFirst().get();
    }

}
