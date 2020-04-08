package com.javainuse;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringBootHelloWorldApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
		logger.info(".....*****Hi I am Main Method**********");
	}
	@PostConstruct
	public void init()
	{
		logger.info(".....*****Hi I am init Method**********");
		
	}
}
