package com.isys221.unitconverter;

public class Conversion {
    //Conversion rates
    private final double dollarRate = 1.11;
    private final double mileRate = 0.62;

    //Method to convert Euros to Dollars
    public double convertEurosToDollars(double euros) {
        return euros * dollarRate;
    }

    //Method to convert Km to Miles
    public double convertKmToMiles(double km) {
        return km * mileRate;
    }
}
