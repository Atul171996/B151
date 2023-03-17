package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;

@RestController
public class HomeController {

	@GetMapping("/getproduceData")
	public List gateDataAll() {
		Student s=new Student();
		s.setRollno(1);
		s.setName("Atul");
		s.setAddress("kolhapur");
		s.setMobno(9876575);
		
		List list=new ArrayList();
		list.add(s);
		return list;
	}
}
