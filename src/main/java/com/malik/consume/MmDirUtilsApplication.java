package com.malik.consume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class}, scanBasePackages = {"com.malik.controller"})
public class MmDirUtilsApplication {
	private static final Logger log = LoggerFactory.getLogger(MmDirUtilsApplication.class);

	public static void main(String[] args) {
		log.info("Start App");
		SpringApplication.run(MmDirUtilsApplication.class, args);
	}

}
