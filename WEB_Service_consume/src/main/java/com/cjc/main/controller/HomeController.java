package com.cjc.main.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/getconsumeData")
	public List getData() {
		String url="http://localhost:9095/getproduceData";
		List list = rt.getForObject(url, List.class);
		return list;
		
	}
}
