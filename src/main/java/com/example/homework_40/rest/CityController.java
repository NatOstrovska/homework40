package com.example.homework_40.rest;

import com.example.homework_40.domain.City;
import com.example.homework_40.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private  CityService cityService;

    @PostMapping("/cities")
    public ResponseEntity<Void> createCity(@RequestBody City city) {
        cityService.createCity(city);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/cities/{id}/countries/{countryId}")
    public ResponseEntity<Void> updateCity(@PathVariable Long id, @PathVariable Long countryId) {
        cityService.addCountry(id, countryId);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
    @GetMapping("/cities")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }
}
