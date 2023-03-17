package com.cjc.main.service;

import com.cjc.main.model.Student;

public interface HomeService {

	Student gateData(String un, String ps);

	void saveData(Student s);

}
