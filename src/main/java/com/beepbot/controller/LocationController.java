package com.beepbot.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.beepbot.constant.Constant;
import com.beepbot.entity.Country;
import com.beepbot.services.LocationService;
import com.beepbot.dto.Location;;

@Controller
@RequestMapping("/locationcontroller")
public class LocationController {

	@Autowired
	private LocationService locationService;

	private static final Logger LOGGER = Logger.getLogger(LocationController.class.getName());

	/**
	 * get user location,weather,name
	 * 
	 * @param model
	 * @param name
	 * @param address
	 * @param latitude
	 * @param longitude
	 * @return location and weather
	 */
	@PostMapping("/location")
	public String getLocation(Model model, @RequestParam("name") String name, @RequestParam("address") String address,
			@RequestParam("latitude") Double latitude, @RequestParam("longitude") Double longitude) {
		Location location = new Location();
		location.setUserName(name);
		location.setAddress(address);
		location.setLatitude(latitude);
		location.setLongitude(longitude);
		// get location weather in json-formate
		String weather = locationService.weatherGet(location);
		if (weather != null) {
			LOGGER.info(weather + "weather get successfully : ");
			// get list of countries
			List<Country> country = locationService.counrtyList();
			location.setWeather(Double.parseDouble(weather));
			model.addAttribute("location", location);
			model.addAttribute("country", country);
			return Constant.BEEPBOTCHAT;

		} else {
			LOGGER.info(weather + "weather not found : ");
			return Constant.LOCATION;
		}
	}

}
