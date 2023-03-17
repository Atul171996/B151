package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;


@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;

	@Override
	public Student gateData(String un, String ps) {
		// TODO Auto-generated method stub
		return hr.findAllByUnameAndPassword(un, ps);
	}

	@Override
	public void saveData(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}
}
