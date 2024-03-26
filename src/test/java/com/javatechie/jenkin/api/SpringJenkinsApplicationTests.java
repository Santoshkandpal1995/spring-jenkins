package com.javatechie.jenkin.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringJenkinsApplicationTests {
	
	
	private static final Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);


	@Test 
	void contextLoads() {
		
		logger.info("Test case execution....");
		
	assertEquals(true, true);

	}


}
