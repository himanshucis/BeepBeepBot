package com.beepbot.services;

import java.util.List;

import com.beepbot.dto.Location;
import com.beepbot.entity.Country;

public interface LocationService {

	/**
	 * method for get weather for particular location using latitude and longitude
	 * @return weather details in JSON
	 */
    String weatherGet(Location location);
	
    /**
     * method for get list of countries
     * @return list of countries
     */
	List<Country> counrtyList();
	
}
