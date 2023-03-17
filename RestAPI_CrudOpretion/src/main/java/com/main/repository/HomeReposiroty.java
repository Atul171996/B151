package com.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.User;
@Repository
public interface HomeReposiroty extends CrudRepository<User, Integer>{
	
	public User findAllByUnameAndPassword(String uname,String password);

}
