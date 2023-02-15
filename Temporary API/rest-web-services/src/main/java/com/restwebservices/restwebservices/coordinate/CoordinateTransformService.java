package com.restwebservices.restwebservices.coordinate;

import com.restwebservices.restwebservices.model.api.Coordinate;
import com.restwebservices.restwebservices.model.api.CoordinateType;

import java.util.List;

public interface CoordinateTransformService {
    List<Coordinate> convertCoordinates(CoordinateType inputCoordinateType, CoordinateType outputCoordinateType, List<Coordinate> inputCoordinates);
    Coordinate convertCoordinate(CoordinateType inputCoordinateType, CoordinateType outputCoordinateType, Coordinate inputCoordinate);

}
