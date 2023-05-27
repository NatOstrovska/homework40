package com.example.homework_40.service;

import com.example.homework_40.domain.Country;
import com.example.homework_40.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    @Autowired
    private final CountryRepository countryRepository;

    @PostMapping("/countries")
    public void createCountry(@RequestBody Country country) {
        countryRepository.save(country);
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}