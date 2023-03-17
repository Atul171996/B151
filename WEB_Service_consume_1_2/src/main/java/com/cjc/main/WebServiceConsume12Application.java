package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebServiceConsume12Application {

	public static void main(String[] args) {
		System.out.println("web conume");
		SpringApplication.run(WebServiceConsume12Application.class, args);
	}
	@Bean
	public RestTemplate rt() {
		RestTemplate rs=new RestTemplate();
		return rs;
	}

}
