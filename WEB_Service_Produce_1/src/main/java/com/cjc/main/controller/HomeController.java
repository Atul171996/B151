package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
	@PostMapping("/regData")
	public String regData(@RequestBody Student s) {
		hs.saveData(s);
		return "wellcome";
	}
	
	@GetMapping("/getproduceData/{uname}/{password}")
	public List gateDataAll(@PathVariable("uname")String un,@PathVariable("password")String ps) {
		
		Student ss=hs.gateData(un,ps);
		List list=new ArrayList();
		list.add(ss);
		return list;
	}
}
