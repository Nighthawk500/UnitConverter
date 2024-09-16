package com.isys221.unitconverter;

public class Conversion {
    //Conversion rates
    private final double dollarRate = 1.11;
    private final double mileRate = 0.62137119;

    //Method to convert Euros to Dollars
    public double convertEurosToDollars(double euros) {
        double dollars = euros * dollarRate;
        //Round to 4 decimals
        dollars = Math.round(dollars * 10000.0) / 10000.0;
        return dollars;
    }

    //Method to convert Km to Miles
    public double convertKmToMiles(double km) {
        double miles = km * mileRate;
        //Round to 4 decimals
        miles = Math.round(miles * 10000.0) / 10000.0;
        return miles;
    }
}
