package com.malik.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final Logger log = LoggerFactory.getLogger(GreetingController.class);
	
	@RequestMapping("/hello")
    public String hello() {
		log.info("Hello World, Spring Boot!");
        return "Hello World, Spring Boot!";
    }
	
	@RequestMapping("/hello2")
	public String hello(@RequestParam(name = "name", defaultValue = "World") String name) {
		log.info("Hello " + name);
	    return "Hello " + name;
	}

}
