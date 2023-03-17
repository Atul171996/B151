package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Kinley;
import com.cjc.main.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
	//save data in database
	@PostMapping("/saveData")
	public void setData(@RequestBody Kinley s) {
		hs.saveData(s);
	}
// get all data
	@GetMapping("/getAllData")
	public Iterable<Kinley>getData(){
		Iterable<Kinley>list=hs.getData();
		return list;
	}
	//update data
	@PutMapping("/putData")
	public Kinley updateData(@RequestBody Kinley s){
		Kinley ss=hs.updateData(s);
		return ss;
	}
	//delete data using id
	@DeleteMapping("/deleteData/{id}")
	public void deleteData(@PathVariable ("id") int id) {
		hs.deleteData(id);
	}
	//editData using id
	@PatchMapping("/editData/{id}")
	public Kinley editData(@PathVariable ("id")int id,@RequestBody Kinley s) {
		Kinley k=hs.editData(id,s);
		return k;
		
	}
}
