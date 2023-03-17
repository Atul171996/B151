package com.cjc.main.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cjc.main.Repository.HomeRepository;
import com.cjc.main.Service.HomeService;
import com.cjc.main.model.Student;

@Controller
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeRepository hr;
	@Override
	public void setData(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}

}
