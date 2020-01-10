package com.beepbot.services.impl;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.beepbot.constant.Constant;
import com.beepbot.dto.Location;
import com.beepbot.entity.Country;
import com.beepbot.repository.CountryRepository;
import com.beepbot.services.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private CountryRepository countryRepository;

	@Value("${weather.url-api.key}")
	private String weatherKey;

	private final CloseableHttpClient httpClient = HttpClients.createDefault();

	private static final Logger LOGGER = Logger.getLogger(LocationServiceImpl.class.getName());

	/**
	 * method implementation for get weather for weather API
	 * "/22.753961,75.878951"
	 * @return weather respones in JSON
	 */
	public String weatherGet(Location location) {
		String weather_url = Constant.WEATHER_URL + weatherKey + "/"+location.getLatitude()+","+location.getLongitude();
		HttpGet request = new HttpGet(weather_url);
		try {
			LOGGER.log(Level.INFO, "Get Weather in api and return weatherJSON.");
			CloseableHttpResponse weatherResponse = httpClient.execute(request);
			String weatherJson = EntityUtils.toString(weatherResponse.getEntity());
			JSONObject weatherObj = new JSONObject(weatherJson);
			Object highTemperature = weatherObj.getJSONObject("currently").get("temperature");
			String str = highTemperature.toString();
			double temperature = Double.valueOf(str).doubleValue();
			// convert temperature Fahrenheit to Celsius
			temperature = (temperature - 32) * 5 / 9;
			String weather = String.valueOf(temperature);
			return weather;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Constant.WEATHERSTATUS;
	}

	/**
	 * method implementation for get list of countries
	 * 
	 * @return List of countries
	 */
	public List<Country> counrtyList() {
		return countryRepository.findAll();
	}
}
