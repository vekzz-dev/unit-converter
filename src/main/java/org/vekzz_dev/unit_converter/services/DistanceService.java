package org.vekzz_dev.unit_converter.services;

import org.springframework.stereotype.Service;
import org.vekzz_dev.unit_converter.models.DistanceUnit;

@Service
public class DistanceService {

    public String convertDistance(double value, String from, String to) {
        DistanceUnit x = DistanceUnit.valueOf(from);
        DistanceUnit y = DistanceUnit.valueOf(to);
        double result = value * x.getValue() / y.getValue();
        return result + " " + y.getSymbol() + ".";
    }
}
