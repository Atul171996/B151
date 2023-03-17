package com.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Apple;
@Repository
public interface ProductRepository extends CrudRepository<Apple, Integer>{

}
