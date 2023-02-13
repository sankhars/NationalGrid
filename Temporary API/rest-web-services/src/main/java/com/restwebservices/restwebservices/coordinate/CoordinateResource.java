package com.restwebservices.restwebservices.coordinate;

import com.restwebservices.restwebservices.model.Coordinate;
import com.restwebservices.restwebservices.model.CoordinateType;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "coordinates", description = "The coordinate API")
@RestController
@RequestMapping("/coordinates")
public class CoordinateResource {

    @Autowired
    private CoordinateTransformService coordinateTransformService;

    @Operation(summary = "Transform the coordinates to different format")
    @PostMapping("/transform/from/{from}/to/{to}")
    public List<Coordinate> transform(@Parameter(description = "From coordinate type") @PathVariable CoordinateType from,
                                      @Parameter(description = "To coordinate type") @PathVariable CoordinateType to,
                                      @RequestBody List<Coordinate> inputCoordinates) {
        List<Coordinate> outputCoordinates = coordinateTransformService.convertCoordinates(from, to, inputCoordinates);
        return outputCoordinates;
    }

}
