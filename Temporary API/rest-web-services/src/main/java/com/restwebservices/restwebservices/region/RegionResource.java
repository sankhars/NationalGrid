package com.restwebservices.restwebservices.region;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegionResource {

    private RegionDaoService service;

    public RegionResource(RegionDaoService service){
        this.service = service;
    }
    @GetMapping("/Regions")
    public List<Region> retriveAllRegions(){
        return service.findAll();

    }
    @GetMapping("/Regions/{id}")
    public Region retriveAllRegions(@PathVariable int id){
        return service.findOne(id);

    }
}
