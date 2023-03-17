package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class RestApiCrudOpretionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiCrudOpretionApplication.class, args);
	}

}
