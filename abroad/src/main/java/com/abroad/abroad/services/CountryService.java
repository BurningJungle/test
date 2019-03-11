package com.abroad.abroad.services;

import com.abroad.abroad.bean.Country;

import java.util.List;

public interface CountryService {
     List<Country> getCountries();

     List<Country> getByName(String name);

     Country getById(int id);

     Country addCountry(Country country);

     Country updateCountry(Country country);

     void deleteCountry(int id);

}
