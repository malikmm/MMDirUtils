package com.malik.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.malik.utils.DirUtils;

@RestController
public class DirUtilsController {
	private static final Logger log = LoggerFactory.getLogger(DirUtilsController.class);
	
	@RequestMapping("/getAll")
    public String hello() {
		log.info("Read Dir");
		
		DirUtils utils = new DirUtils();
		List<String> df = utils.getAll();
		df.forEach(n->System.out.println(n));
		
//        return "Hello World, Spring Boot!";
		return df.toString();
    }
	
}
