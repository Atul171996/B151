package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Dell_Product;
import com.main.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	@PostMapping("/dellsetdata")
	public Dell_Product prelogin(@RequestBody Dell_Product p) {
		Dell_Product d=hs.setData(p);
		return d;
	}
	
	@GetMapping("/dellgetdata")
	public List login() {
		List l=hs.getData();
		return l;
	}
}
