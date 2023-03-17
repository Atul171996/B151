package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.main.model.Kinley;

@RestController
public class HomeController {
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/getwater")
	public List getData() {
	String	url="http://localhost:9090/getAllData";
		List list=rt.getForObject(url, List.class);
		return list;
	}
	@PostMapping("/postwater")
	public void saveData(@RequestBody Kinley s) {
		String url="http://localhost:9090/saveData";
		rt.postForObject(url, s, void.class);
	}

}
