package com.beepbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beepbot.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
	
	/**
	 * method for get country by country name
	 * @param country
	 * @return country by country name
	 */
	public Country findByCountry(String country);

}
