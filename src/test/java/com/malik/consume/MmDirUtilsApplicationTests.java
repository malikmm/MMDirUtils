package com.malik.consume;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(classes = MmDirUtilsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

//@SpringBootTest
class MmDirUtilsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private TestRestTemplate template;

	@Test
	public void hello_ok() throws Exception {
		ResponseEntity<String> response = template.getForEntity("/hello", String.class);
		assertThat(response.getBody()).isEqualTo("Hello World, Spring Boot!");
	}
	
	@Test
	public void getAll() throws Exception {
		ResponseEntity<String> response = template.getForEntity("/getAll", String.class);
//		assertThat(response.getBody()).isEqualTo("Hello World, Spring Boot!");
	}

}
