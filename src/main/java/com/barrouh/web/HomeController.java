package com.barrouh.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import com.barrouh.service.PersoneService;

@Controller
public class HomeController {

	@Autowired
	PersoneService personeService;

	static final Logger LOGGER = LogManager.getLogger(HomeController.class);

	@GetMapping("/")
	public ModelAndView homePage(HttpServletRequest request) {
		LOGGER.info("Receiving request from client with ip address : {}",Tools.getClientIpAddr(request));
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		model.addObject("persone", personeService.getPerson());
		return model;
	}

}