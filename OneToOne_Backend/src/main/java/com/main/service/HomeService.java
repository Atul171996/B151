package com.main.service;

import java.util.List;

import com.main.model.Product;

public interface HomeService {

	Product savedata( Product p);

	List getalldata();

	void deletedata(int id);

}
