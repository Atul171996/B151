package com.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Repository.HomeRepository;
import com.main.model.Dell_Product;
import com.main.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;

	@Override
	public Dell_Product setData(Dell_Product p) {
		// TODO Auto-generated method stub
		return hr.save(p);
	}

	@Override
	public List getData() {
		// TODO Auto-generated method stub
		return (List) hr.findAll();
	}
	
}
