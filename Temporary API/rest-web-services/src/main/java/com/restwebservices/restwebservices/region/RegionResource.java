package com.restwebservices.restwebservices.region;


import com.restwebservices.restwebservices.init.ResourceLoader;
import com.restwebservices.restwebservices.model.api.Region;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Tag(name="regions", description="The region API")
@RestController
@RequestMapping("/gsp/regions")
public class RegionResource {

    @Autowired
    private ResourceLoader resourceLoader;

    @Operation(summary = "Get the sample region list")
    @GetMapping("/sample/{size}")
    public List<Region> retrieveSampleRegions(@Parameter(description = "Sample size", example="5") @PathVariable Integer size){
        return retrieveAllRegions().stream().limit(size).collect(Collectors.toList());

    }
    @Operation(summary = "Get the region list, if you call this API in Swagger, please use the \"/sample\" one.")
    @GetMapping("")
    public List<Region> retrieveAllRegions(){
         return resourceLoader.getRegions();
    }



//    @Operation(summary = "Get the region by ID")
//    @GetMapping("/{id}")
//    public Region retrieveAllRegions(@PathVariable int id){
//        return service.findOne(id);
//
//    }
}
