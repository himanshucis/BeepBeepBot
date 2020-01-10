package com.beepbot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beepbot.constant.Constant;

@Controller
@RequestMapping("/beepbotcontroller")
public class BeepBotController {

	@Value("${google.map-api.key}")
	private String mapKey;

	/**
	 * request for home page
	 * 
	 * @return to load home page
	 */
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("mapkey",mapKey);
		return Constant.LOCATION;
	}
}
