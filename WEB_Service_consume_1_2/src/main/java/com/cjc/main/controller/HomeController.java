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

import com.cjc.main.Service.HomeService;
import com.cjc.main.model.Student;

@RestController
public class HomeController {
	
	@Autowired
	RestTemplate rt;
	@Autowired
	HomeService hs;
	
	@GetMapping("/getconumeData/{uname}/{password}")
	public List getData(@PathVariable("uname")String un,@PathVariable("password")String ps) {
		String url="http://localhost:9091/getproduceData/"+un+"/"+ps+"";
		List list=rt.getForObject(url, List.class);
		String url1="http://localhost:9092/getproduceData1/"+un+"/"+ps+"";
		List list1=rt.getForObject(url1, List.class);
		List a=new ArrayList();
		a.add(list);
		a.add(list1);
		return a;
	}
	
	@PostMapping("/postconumeData")
	public List saveData(@RequestBody Student s) {
		hs.setData(s);
		String url="http://localhost:9091/regData";
		String l=rt.postForObject(url, s,String.class);
		String url1="http://localhost:9092/regData1";
		String l1=rt.postForObject(url1, s, String.class);
		List list=new ArrayList<>();
		list.add(l);
		list.add(l1);
		return list;
		
	}

}
