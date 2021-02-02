package com.codeccol.flights.service;

import com.codeccol.flights.model.Airline;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class AirlineService {

    public static final String FLY_API_URL = "http://aviation-edge.com/v2/public/flights?key=ae64ea-f17efc";
    private RestTemplate restTemplate = new RestTemplate();

    public Airline getAirline(){
       String response = getInfoForAirlines("W8");
       log.info(response);
        return null;
    }

    private String getInfoForAirlines(String iataNumber) {
        return restTemplate.getForObject(FLY_API_URL + "&airlineIata={iataNumber}",
                String.class, iataNumber);
    }
}
