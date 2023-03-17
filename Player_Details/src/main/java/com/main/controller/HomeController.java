package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Player;
import com.main.service.HomeService;
@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	@PostMapping("/postdetails")
	public Player pre(@RequestBody Player p) {
		Player pp=hs.setdata(p);
		return pp;
		
	}
	@GetMapping("/getadddata")
	public List pro() {
		List list=hs.getadddata();
		return list;
	}
	@DeleteMapping("/deletedtails/{playerId}")
	public String log(@PathVariable("playerId")int playerId) {
		hs.deletedata(playerId);
		return "Delete successfully";
	}
	@PutMapping("/totalFor/{playerId}")
	public Player put1(@PathVariable("playerId")int playerId,@RequestBody Player p) {
		Player pp=hs.setdata(p);
		return pp;
	}

}
