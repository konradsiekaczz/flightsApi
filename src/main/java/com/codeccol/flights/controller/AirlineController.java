package com.codeccol.flights.controller;

import com.codeccol.flights.model.Airline;
import com.codeccol.flights.service.AirlineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AirlineController {
    private final AirlineService airlineService;

    @GetMapping("/airline")
    public Airline getAirline() {
        return airlineService.getAirline();
    }
}
