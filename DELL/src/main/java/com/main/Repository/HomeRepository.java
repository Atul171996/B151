package com.main.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Dell_Product;
@Repository
public interface HomeRepository extends CrudRepository<Dell_Product, Integer> {

}
