package org.vekzz_dev.unit_converter.services;

import org.springframework.stereotype.Service;
import org.vekzz_dev.unit_converter.models.WeightUnit;

@Service
public class WeightService {

    public String convertWeight(double value, String from, String to) {
        WeightUnit x = WeightUnit.valueOf(from);
        WeightUnit y = WeightUnit.valueOf(to);
        double result = value * x.getValue() / y.getValue();
        return result + " " + y.getSymbol() + ".";
    }
}
