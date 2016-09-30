package com.tesla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeslaController {

	@RequestMapping("/hom")
	public ModelAndView test() {
		return new ModelAndView("home");
	}
}
