package com.pabloesanabriaq.practicalunittesting.controllers;

import com.pabloesanabriaq.practicalunittesting.dtos.CelsiusDto;
import com.pabloesanabriaq.practicalunittesting.dtos.FahrenheitDto;
import com.pabloesanabriaq.practicalunittesting.dtos.ReverseStringDto;
import com.pabloesanabriaq.practicalunittesting.exceptions.InvalidStringException;
import com.pabloesanabriaq.practicalunittesting.services.unit3.FahrenheitCelsiusConverter;
import com.pabloesanabriaq.practicalunittesting.services.unit3.StringReverseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping
public class Unit3Controller {

    StringReverseService stringReverseService;

    @GetMapping("/stringreverse/{str}")
    public ReverseStringDto reverseString(@PathVariable String str) throws InvalidStringException {
        return new ReverseStringDto(stringReverseService.run(str));
    }

    @GetMapping("/fahrenheit/{celsius}")
    public FahrenheitDto getFahrenheitValue(@PathVariable Integer celsius) {
        return new FahrenheitDto(FahrenheitCelsiusConverter.toFahrenheit(celsius));
    }

    @GetMapping("/celsius/{fahrenheit}")
    public CelsiusDto getCelsiusValue(@PathVariable Integer fahrenheit) {
        return new CelsiusDto(FahrenheitCelsiusConverter.toCelsius(fahrenheit));
    }
}
