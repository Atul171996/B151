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
	public void saveData(Student s) {
		hr.save(s);
		
	}

	@Override
	public Iterable<Student> getData() {
		// TODO Auto-generated method stub
		return  hr.findAll();
	}

	@Override
	public void putData(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}

	@Override
	public Student login1(String un, String ps) {
		// TODO Auto-generated method stub
		return hr.findAllByUnameAndPassword(un, ps);
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
		
	}

	@Override
	public Student editData(int id) {
		return null;
		// TODO Auto-generated method stub
		
	}

	

	

	
}
