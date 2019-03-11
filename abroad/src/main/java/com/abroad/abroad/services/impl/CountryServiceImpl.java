package com.abroad.abroad.services.impl;

import com.abroad.abroad.bean.Country;
import com.abroad.abroad.dao.CountryJpaDao;
import com.abroad.abroad.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryJpaDao countryJpaDao;

    public List<Country> getCountries(){
        return  countryJpaDao.findAll();
    }
    public List<Country> getByName(String name){
        return countryJpaDao.findByName(name);
    }
    public Country getById(int id){
        return countryJpaDao.findById(id);
    }
    public Country addCountry(Country country) {
        return countryJpaDao.save(country);
    }
   public Country updateCountry(Country country) {
        return countryJpaDao.save(country);
    }

    public void deleteCountry(int id) {
        countryJpaDao.deleteById(id);
    }
}
