package org.vekzz_dev.unit_converter.models;

public enum TemperatureUnit {
    CELSIUS("Celsius", "°C"),
    FAHRENHEIT("Fahrenheit", "°F"),
    KELVIN("Kelvin", "K");

    private final String text;
    private final String symbol;

    TemperatureUnit(String text, String symbol) {
        this.text = text;
        this.symbol = symbol;
    }

    public String getText() {
        return text;
    }

    public String getSymbol() {
        return symbol;
    }
}
