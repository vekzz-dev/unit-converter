package org.vekzz_dev.unit_converter.models;

public enum DistanceUnit {
    MILLIMETER("Millimeters", 0.001, "mm"),
    CENTIMETER("Centimeters", 0.01, "cm"),
    METER("Meters", 1, "m"),
    KILOMETER("Kilometers", 1000, "km"),
    INCH("Inches", 0.0254, "in"),
    FOOT("Foots", 0.3048, "ft"),
    YARD("Yards", 0.9144, "yd"),
    MILE("Miles", 1609.344, "mi");

    private final String text;
    private final double value;
    private final String symbol;

    DistanceUnit(String text, double value, String symbol) {
        this.text = text;
        this.value = value;
        this.symbol = symbol;
    }

    public String getText() {
        return text;
    }

    public double getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }
}
