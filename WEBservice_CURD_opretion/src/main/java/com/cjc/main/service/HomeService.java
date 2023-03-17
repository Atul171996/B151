package com.cjc.main.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.cjc.main.model.Student;

public interface HomeService {

	void saveData(Student s);

	 public Iterable<Student> getData();
	
	 void putData( Student s);

	Student login1(String un, String ps);

	void deleteData(int id);

	Student editData(int id);
	
}
