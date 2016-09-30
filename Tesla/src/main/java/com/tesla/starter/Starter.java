package com.tesla.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication(scanBasePackages = { "com.tesla.controller","com.tesla.rest.controller" })
public class Starter extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}
	
	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
	    super.configurePathMatch(configurer);

	    configurer.setUseSuffixPatternMatch(false);
	}

}
