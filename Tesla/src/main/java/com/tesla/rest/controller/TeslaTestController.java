package com.tesla.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeslaTestController {

	@RequestMapping("/login")
	public String test() {

		return "WELCOME TO TESLA WORLD..THIS IS FROM REST....";
	}
}
