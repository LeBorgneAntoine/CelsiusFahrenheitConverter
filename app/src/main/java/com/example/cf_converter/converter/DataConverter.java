package com.example.cf_converter.converter;

/**
 * @author Antoine LE BORGNE
 * @version 0.0.1
 *
 * convert temperature data
 */
public class DataConverter {

    /**
     * get the celsius value from fahrenheit temperature
     *
     * @param fahrenheit the temperature
     * @return the celsius value
     */
    public static double fahrenheitToCelsius (double fahrenheit){

        return  Math.round(((fahrenheit - 32) * 5)/9);

    }

    /**
     * get the fahrenheit value from celsius temperature
     *
     * @param celsius the temperature
     * @return the fahrenheit value
     */
    public static double celsiusToFahrenheit (double celsius){

        return  Math.round(((celsius*9)/5) + 32);

    }


}
