package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Player;
import com.main.repository.HomeRepository;
import com.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;

	@Override
	public Player setdata(Player p) {
		// TODO Auto-generated method stub
		return hr.save(p);
	}

	@Override
	public List getadddata() {
		// TODO Auto-generated method stub
		return (List) hr.findAll();
	}

	@Override
	public void deletedata(int playerId) {
		// TODO Auto-generated method stub
		hr.deleteById(playerId);
	}
}
