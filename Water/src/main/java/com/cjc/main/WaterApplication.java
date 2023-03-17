package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WaterApplication {

	public static void main(String[] args) {
		System.out.println("save water");
		SpringApplication.run(WaterApplication.class, args);
	}
	@Bean
	public RestTemplate rt() {
		RestTemplate rs=new RestTemplate();
		return rs;
	}

}
