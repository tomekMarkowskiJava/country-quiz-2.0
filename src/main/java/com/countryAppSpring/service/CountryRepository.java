package com.countryAppSpring.service;

import com.countryAppSpring.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country,Long> {

    public List<Country> findCountriesByRegion(String region);


}
