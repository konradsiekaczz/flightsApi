package com.codeccol.flights.service;

import com.codeccol.flights.model.Airline;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class AirlineService {

    private RestTemplate restTemplate = new RestTemplate();

    public Airline getAirline(){
       String response =  restTemplate.getForObject("http://aviation-edge.com/v2/public/flights?key=ae64ea-f17efc&airlineIata=W8",
                String.class);
       log.info(response);
        return null;
    }
}
