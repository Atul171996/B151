package com.main.service;

import com.main.model.User;

public interface HomeService {

	User setdata(User u);

	Iterable<User> getalldata();

	void deletedata(int id);

	User updatedata(User u);

	User logincheck(String uname, String password);

	//User editdata(int id, User u);

}
