package com.barrouh.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.barrouh.service.PersoneService;

@Controller
public class DefaultController {
	
	static final Logger LOGGER = LogManager.getLogger(DefaultController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homePage() {
		   PersoneService personeService = new PersoneService();
           ModelAndView model = new ModelAndView();
		   model.setViewName("index");
		   model.addObject("persone", personeService.getPerson());
		   return model;
	}

	@RequestMapping(value = "/Contact", method = RequestMethod.POST)
	public ModelAndView doTranslate(@RequestParam(value = "originalText", required = true) String originalText) {
		   ModelAndView model = new ModelAndView();
		
		  model.setViewName("index");
		  return model;
	}

}
