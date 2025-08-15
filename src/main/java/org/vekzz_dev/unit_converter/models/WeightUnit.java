package org.vekzz_dev.unit_converter.models;

public enum WeightUnit {
    MILLIGRAM("Milligrams", 0.001, "mg"),
    GRAM("Grams", 1.0, "g"),
    KILOGRAM("Kilograms", 1000.0, "kg"),
    OUNCE("Ounces", 28.3495, "oz"),
    POUND("Pounds", 453.592, "lb"),
    TON("Tons", 907184.0, "ton");

    private final String text;
    private final double value;
    private final String symbol;

    WeightUnit(String text, double value, String symbol) {
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
