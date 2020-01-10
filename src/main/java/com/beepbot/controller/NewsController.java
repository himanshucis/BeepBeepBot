package com.beepbot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.beepbot.constant.Constant;
import com.beepbot.dto.News;
import com.beepbot.services.NewsService;

@Controller
@RequestMapping("/newscontroller")
public class NewsController {

	@Autowired
	private NewsService newsService;

	private static final Logger LOGGER = Logger.getLogger(NewsController.class.getName());

	/**
	 * get news of country
	 * 
	 * @param model
	 * @param countryName
	 * @return new data-list of country
	 */
	@PostMapping("/countrynews")
	public String getCountryNews(Model model, @RequestParam("cntryname") String countryName) {
		News news = new News();
		List<Object> source = new ArrayList<Object>();
		List<Object> title = new ArrayList<Object>();
		List<Object> content = new ArrayList<Object>();

		// get news of countries in JSON Formate
		String newsJson = newsService.getCountryNews(countryName);
		if (newsJson != null) {
			LOGGER.info(newsJson + "news get successfully : ");
			JSONObject newsObj = new JSONObject(newsJson);
			for (int i = 0; i < 3; i++) {
				Object newsSource = newsObj.getJSONArray("articles").getJSONObject(i).getJSONObject("source")
						.get("name");
				Object newsTitle = newsObj.getJSONArray("articles").getJSONObject(i).get("title");
				Object newsContant = newsObj.getJSONArray("articles").getJSONObject(i).get("content");
				source.add(newsSource);
				title.add(newsTitle);
				content.add(newsContant);
				news.setSource(source);
				news.setTitle(title);
				news.setContent(content);
				model.addAttribute("news", news);
			}
			return Constant.NEWS;
		} else {
			LOGGER.info(newsJson + "news not found : ");
			return Constant.BEEPBOTCHAT;
		}
	}
}
