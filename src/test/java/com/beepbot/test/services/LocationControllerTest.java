/**
 * 
 */
package com.beepbot.test.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.ConcurrentModel;

import com.beepbot.controller.LocationController;
import com.beepbot.dto.Location;
import com.beepbot.entity.Country;
import com.beepbot.services.impl.LocationServiceImpl;

/**
 * @author cis
 *
 */
@SpringBootTest()
@RunWith(SpringRunner.class)
class LocationControllerTest {

	@MockBean
	private LocationServiceImpl locationService;

	@Autowired
	private LocationController locationController;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetLocation() {
		Location location = new Location();
		location.setAddress("indore");
		location.setUserName("test");
		location.setLatitude(22.754221317920024);
		location.setLongitude(75.86651623648368);
		location.setWeather(22.21);
		
		List<Country> countries = prepareCountryList();
		// locationService = Mockito.mock(LocationServiceImpl.class);
		when(locationService.counrtyList()).thenReturn(countries);
		
		when(locationService.weatherGet(Mockito.any(Location.class))).thenReturn(getWeatherResponse());

		// doReturn(countries).when(locationService.counrtyList());
		
		String response = locationController.getLocation(new ConcurrentModel(), "test", "indore", 22.754221317920024,75.86651623648368);
		assertEquals("beepbotchat", response);
		// fail("Not yet implemented");
	}

	private String getWeatherResponse() {
		return "22.21";
	}
	
	private List<Country> prepareCountryList() {
		List<Country> countries = new ArrayList<Country>();
		Country country = new Country();
		country.setCode("in");
		country.setCountry("India");
		country.setId(1);
		countries.add(country);
		return countries;
	}

}
