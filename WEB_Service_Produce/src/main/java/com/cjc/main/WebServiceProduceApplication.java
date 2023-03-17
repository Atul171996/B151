package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceProduceApplication {

	public static void main(String[] args) {
		System.out.println("web service produce");
		SpringApplication.run(WebServiceProduceApplication.class, args);
	}

}
