package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebServiceProduce1Application {

	public static void main(String[] args) {
		
		System.out.println("web service prodce -1");
		SpringApplication.run(WebServiceProduce1Application.class, args);
	}
	
	
}
