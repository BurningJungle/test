package com.abroad.abroad.controller;


import com.abroad.abroad.bean.Country;
import com.abroad.abroad.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @RequestMapping
    public List<Country> getAll(){
        return countryService.getCountries();
    }
    @GetMapping("/getid/{id}")
    public Country getById(@PathVariable int id){
        return countryService.getById(id);
    }

    @GetMapping("/getname/{name}")
    public List<Country> getByName(@PathVariable String name){
        return countryService.getByName(name);
    }
    @PostMapping("/add")
    public Country addCountry(Country country){
        return countryService.addCountry(country);
    }
    @PutMapping("/update/{id}")
    public Country updateCountry(Country country){
        return countryService.updateCountry(country);
    }
    @DeleteMapping("/{id}")
    public void deleteCountry(@PathVariable int id){
        countryService.deleteCountry(id);
    }
}
