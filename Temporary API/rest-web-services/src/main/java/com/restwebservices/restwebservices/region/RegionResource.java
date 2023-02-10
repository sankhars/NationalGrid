package com.restwebservices.restwebservices.region;


import com.restwebservices.restwebservices.model.Region;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Tag(name="regions", description="The region API")
@RestController
public class RegionResource {

    private RegionDaoService service;

    public RegionResource(RegionDaoService service){
        this.service = service;
    }
    @Operation(summary = "Get the region list")
    @GetMapping("/Regions")
    public List<Region> retriveAllRegions(){
        return service.findAll();

    }
    @Operation(summary = "Get the region by ID")
    @GetMapping("/Regions/{id}")
    public Region retriveAllRegions(@PathVariable int id){
        return service.findOne(id);

    }
}
