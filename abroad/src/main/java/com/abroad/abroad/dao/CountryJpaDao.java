package com.abroad.abroad.dao;

import com.abroad.abroad.bean.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryJpaDao extends JpaRepository<Country, Integer> {
    List<Country> findByName(String name);
    Country findById(int id);

}
