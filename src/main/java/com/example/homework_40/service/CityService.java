package com.example.homework_40.service;

import com.example.homework_40.domain.City;
import com.example.homework_40.repository.CityRepository;
import com.example.homework_40.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;
    private final CountryRepository countryRepository;

    public void createCity(City city) {
        cityRepository.save(city);
    }

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public void addCountry(Long cityId, Long countryId) {
       var country = countryRepository.findById(countryId).get();
       var city = cityRepository.findById(cityId).get();
       city.setCountry(country);

       cityRepository.save(city);
    }
}
