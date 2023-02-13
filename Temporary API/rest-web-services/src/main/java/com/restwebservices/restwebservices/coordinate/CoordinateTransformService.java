package com.restwebservices.restwebservices.coordinate;

import com.restwebservices.restwebservices.model.Coordinate;
import com.restwebservices.restwebservices.model.CoordinateType;

import java.util.List;

public interface CoordinateTransformService {
    List<Coordinate> convertCoordinates(CoordinateType inputCoordinateType, CoordinateType outputCoordinateType, List<Coordinate> inputCoordinates);
}
