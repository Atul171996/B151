package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.User;
import com.main.repository.HomeReposiroty;
import com.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	@Autowired
	HomeReposiroty hr;

	@Override
	public User setdata(User u) {
		return hr.save(u);
	}

	@Override
	public Iterable<User> getalldata() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public void deletedata(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
	}

	@Override
	public User updatedata(User u) {
		// TODO Auto-generated method stub
		return hr.save(u);
	}

	@Override
	public User logincheck(String uname, String password) {
		// TODO Auto-generated method stub
		return hr.findAllByUnameAndPassword(uname, password);
	}

//	
//	@Override
//	public User editdata(int id, User u) {
//		// TODO Auto-generated method stub
//		return hr.saveByIdAndUser(id, u);
//	}

}
