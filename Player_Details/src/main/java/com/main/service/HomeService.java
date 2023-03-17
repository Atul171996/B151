package com.main.service;

import java.util.List;

import com.main.model.Player;

public interface HomeService {

	Player setdata(Player p);

	List getadddata();

	void deletedata(int playerId);

}
