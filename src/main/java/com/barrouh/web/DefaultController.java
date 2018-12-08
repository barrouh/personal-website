package com.barrouh.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

import com.barrouh.domain.Contact;
import com.barrouh.service.MailService;
import com.barrouh.service.PersoneService;

@Controller
public class DefaultController {

	@Autowired
	MailService mailService;

	@Autowired
	PersoneService personeService;

	static final Logger LOGGER = LogManager.getLogger(DefaultController.class);

	@GetMapping("/")
	public ModelAndView homePage(HttpServletRequest request) {
		LOGGER.info("Receiving request from client with ip address : " + Tools.getClientIpAddr(request));
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		model.addObject("persone", personeService.getPerson());
		return model;
	}
	
	@ResponseBody
	@PostMapping("/Contact")
	public String contact(@RequestParam(value = "fullName", required = true) String fullName,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "phoneNumber", required = true) String phoneNumber,
			@RequestParam(value = "message", required = true) String message) {
				Contact contact = new Contact();
				contact.setFullName(fullName);
				contact.setEmail(email);
				contact.setPhoneNumber(phoneNumber);
				contact.setMessage(message);
				if (isValidContact(contact)) {
					LOGGER.info("The user " + fullName + " Triying to Contact you.");
					LOGGER.info("The user email is : " + email+" and user phone number is : " + phoneNumber);
					try {
						mailService.sendMail(contact);
						return "success";	
					}catch(Exception e) {
						LOGGER.error(e.getMessage(),e);
						return "error";	
					}
				}else {
					LOGGER.error("Some informations are missing in Contact form.");
					return "error";
				}
	}

	private boolean isValidContact(Contact contact) {
		boolean res = false;
		res = Tools.isNotnull(contact.getEmail()) && Tools.isNotnull(contact.getFullName())
				&& Tools.isNotnull(contact.getMessage()) /* && Tools.isNotnull(contact.getPhoneNumber()) */ ;
		return res;
	}

}
