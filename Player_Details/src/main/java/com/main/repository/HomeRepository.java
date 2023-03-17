package com.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Player;

@Repository
public interface HomeRepository extends CrudRepository<Player, Integer>{

}
