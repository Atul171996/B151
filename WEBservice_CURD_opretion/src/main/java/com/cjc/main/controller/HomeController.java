package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
	@PostMapping("/saveData")
	public void saveData( @RequestBody Student s) {
	//	Student s=new Student();
		
		hs.saveData(s);
	}
	@GetMapping("/getData")
	public Iterable  prelogin() {
		Iterable<Student> data = hs.getData();
		return data;
	}
	@PutMapping("/putData")
	public void putData(@RequestBody Student s) {
		hs.saveData(s);
	}
	
	//get according to user and password
	@GetMapping("/login/{uname}/{password}")
	public Student login(@PathVariable("uname")String un,@PathVariable ("password")String ps) {
		Student s=hs.login1(un,ps);
		return s;
		
	}
	@DeleteMapping("/deleteData/{id}")
	public void delete1(@PathVariable ("id" ) int id) {
		hs.deleteData(id);
	}
	
	@PutMapping("/reg/{id}")
	public Student delete2(@PathVariable ("id" ) int id,@RequestBody Student s) {
		Student stu =hs.editData(id);
		return stu;
	}
}
