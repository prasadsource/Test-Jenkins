	package com.javainuse;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootHelloApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringBootHelloApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}
/*
 * @SpringBootTest class SpringBootHelloApplicationTests {
 * 
 * @Test void contextLoads() { assertEquals(true,true); }
 * 
 * }
 */
