package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.User;
import com.main.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;

	//set data using postman tool
	@PostMapping("/postAPI")
	public User set(@RequestBody User u) {
		User uu=hs.setdata(u);
		return uu;
	}
	
	//get all data
	@GetMapping("/getAPI")
	public Iterable<User>get(){
		List l=(List) hs.getalldata();
		return l;
	}
	//delete data
	@DeleteMapping("/deleteAPI/{id}")
	public void delete(@PathVariable ("id")int id) {
		hs.deletedata(id);
	}
	//update data
	@PutMapping("/putAPI")
	public User update(@RequestBody User u) {
		User uu=hs.updatedata(u);
		return uu;
	}
//	//edit data
//	@PutMapping("/editAPI/{id}")
//	public User edit(@PathVariable ("id")int id,@RequestBody User u) {
//		User uu=hs.editdata(id,u);
//		return uu;
//	}
	@GetMapping("/getdata/{uname}/{password}")
	public User login(@PathVariable("uname")String uname,@PathVariable("password")String password) {
		User uu=hs.logincheck(uname,password);
		return uu;
	}
}
