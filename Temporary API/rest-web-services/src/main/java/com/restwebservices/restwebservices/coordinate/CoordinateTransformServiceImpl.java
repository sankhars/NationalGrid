package com.restwebservices.restwebservices.coordinate;

import com.restwebservices.restwebservices.model.api.Coordinate;
import com.restwebservices.restwebservices.model.api.CoordinateType;
import geotrellis.proj4.CRS;
import geotrellis.proj4.Transform;
import org.springframework.stereotype.Service;
import scala.Tuple2;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoordinateTransformServiceImpl implements CoordinateTransformService {
    @Override
    public List<Coordinate> convertCoordinates(CoordinateType inputCoordinateType, CoordinateType outputCoordinateType, List<Coordinate> inputCoordinates) {
        var rule = Transform.apply(CRS.fromEpsgCode(inputCoordinateType.getType()), CRS.fromEpsgCode(outputCoordinateType.getType()));
        List<Coordinate> outputCoordinates = new ArrayList<>();
        for (Coordinate inputCoordinate : inputCoordinates) {
            Tuple2<Object, Object> valueHolder = rule.apply(inputCoordinate.getX().doubleValue(), inputCoordinate.getY().doubleValue());
            outputCoordinates.add(new Coordinate((Double) valueHolder._1(), (Double) valueHolder._2()));
        }
        return outputCoordinates;
    }

}
