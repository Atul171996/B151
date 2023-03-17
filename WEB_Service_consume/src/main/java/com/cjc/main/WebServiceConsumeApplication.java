package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebServiceConsumeApplication {

	public static void main(String[] args) {
		System.out.println("web service con");
		SpringApplication.run(WebServiceConsumeApplication.class, args);
		
	}
	
	@Bean
	public RestTemplate rt() {
		
		RestTemplate rs=new RestTemplate();
		return rs;
	}

}
