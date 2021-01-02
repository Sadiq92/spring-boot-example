package com.javatpoint.springbootexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
//import org.junit.platform.commons.logging.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootExampleApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootExampleApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("test case executed");
		assertEquals(true, true);
	}

}
