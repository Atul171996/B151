package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;

@RestController
public class HomeController {

	// Get method return list of data
	
	
	@GetMapping("/getStudentData")
	public List<Student> getData1() {
		
		Student s=new Student();
		s.setRollno(1);
		s.setName("Atul");
		s.setCity("pune");
		

		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("Rohit");
		s1.setCity("pune");
		

		Student s2=new Student();
		s2.setRollno(3);
		s2.setName("Shubham");
		s2.setCity("pune");
		
		List<Student>list=new ArrayList<>();
		list.add(s);
		list.add(s1);
		list.add(s2);
		return list;
		
	}
	
	//post method required insert new element
	
/*	@PostMapping("/getdata")
	public String postData(@RequestBody Student s) {
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getCity());
		return "success";
	}      */
	
	@PostMapping("/postStudentData")
	public List<Student> postData1(@RequestBody Student s){
		 List<Student> list=new ArrayList<>();
		list.add(s);
		list.forEach(stu->{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			System.out.println(stu.getCity());
		});
		return list;
		
	}
}
