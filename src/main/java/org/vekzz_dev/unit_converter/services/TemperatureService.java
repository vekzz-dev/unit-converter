package org.vekzz_dev.unit_converter.services;

import org.springframework.stereotype.Service;
import org.vekzz_dev.unit_converter.models.TemperatureUnit;

import java.util.Map;
import java.util.function.Function;

@Service
public class TemperatureService {

    private final Map<String, Function<Double, Double>> formulas = Map.of(
            "CELSIUSKELVIN", c -> c + 273.15,
            "CELSIUSFAHRENHEIT", c -> (c * 9 / 5) + 32,
            "KELVINCELSIUS", k -> k - 273.15,
            "KELVINFAHRENHEIT", k -> ((k - 273.15) * 9 / 5) + 32,
            "FAHRENHEITCELSIUS", f -> (f - 32) * 5 / 9,
            "FAHRENHEITKELVIN", f -> ((f - 32) * 5 / 9) + 273.15
    );

    public String convertTemperature(double value, String from, String to) {
        if (from.equals(to)) return value + " " + TemperatureUnit.valueOf(to).getSymbol() + ".";
        String key = from + to;
        double result = formulas.get(key).apply(value);
        return result + " " + TemperatureUnit.valueOf(to).getSymbol() + ".";
    }
}
