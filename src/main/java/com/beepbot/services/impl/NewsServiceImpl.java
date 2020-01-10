package com.beepbot.services.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.beepbot.constant.Constant;
import com.beepbot.entity.Country;
import com.beepbot.repository.CountryRepository;
import com.beepbot.services.NewsService;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private CountryRepository countryRepository;

	@Value("${news.url-api.key}")
	private String newsKey;

	private final CloseableHttpClient httpClient = HttpClients.createDefault();

	private static final Logger LOGGER = Logger.getLogger(NewsServiceImpl.class.getName());

	/**
	 * method implementation for get News for News API
	 * 
	 * @return News API data in JSON
	 */
	public String getCountryNews(String countryName) {
		Country country = countryRepository.findByCountry(countryName);
		String countryNews = Constant.NEWS_URL + country.getCode() + "&apiKey="+newsKey;
		HttpGet request = new HttpGet(countryNews);
		try {
			LOGGER.log(Level.INFO, "Get News in api and return newsJSON.");
			CloseableHttpResponse newsResponse = httpClient.execute(request);
			String newsJson = EntityUtils.toString(newsResponse.getEntity());
			return newsJson;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Constant.NEWSTATUS;
	}
}
