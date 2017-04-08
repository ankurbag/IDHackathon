package com.neu.refugeeapp.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neu.refugeeapp.bean.TravelPlan;
import com.neu.refugeeapp.dao.ConnectionDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class RefugeeUserController {
	
	private static final Logger logger = LoggerFactory.getLogger(RefugeeUserController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String index(Locale locale) {
		return "home";
	}
	@RequestMapping(value ="/home", method = RequestMethod.GET)
	public String home(Locale locale) {
		return "home";
	}
	
	@RequestMapping(value = "/learning", method = RequestMethod.GET)
	public String learningportal(Locale locale, Model model) {
		logger.info("reviewexpierience", locale);
		return "learning";
	}
	@RequestMapping(value = "/jobportal", method = RequestMethod.GET)
	public String jobportal(Locale locale, Model model) {
		logger.info("reviewexpierience", locale);
		return "learning";
	}
	@RequestMapping(value = "/generalinfo", method = RequestMethod.GET)
	public String generalinfo(Locale locale, Model model) {
		logger.info("reviewexpierience", locale);
		return "learning";
	}
}
