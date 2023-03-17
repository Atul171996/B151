package com.main.Repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Product;
@Repository
public interface HomeRepository extends CrudRepository<Product, Integer>{

}
