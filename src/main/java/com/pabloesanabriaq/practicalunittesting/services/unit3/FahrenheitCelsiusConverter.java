package com.pabloesanabriaq.practicalunittesting.services.unit3;

import lombok.Data;

@Data
public class FahrenheitCelsiusConverter {

    public static Integer toCelsius(Integer fahrenheit){
        return (int) Math.round((fahrenheit - 32) * 5.0 / 9.0);
    }

    public static Integer toFahrenheit(Integer celsius) {
        return (int) Math.round(celsius * 9.0 / 5.0) + 32;
    }

}
