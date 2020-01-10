package com.beepbot.services;

public interface NewsService {

	/**
	 * method for get news of country
	 * @param countryName
	 * @return country news in JSON
	 */
	String getCountryNews(String countryName);
	
}
