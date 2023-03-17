package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Repository.HomeRepository;
import com.cjc.main.model.Kinley;
import com.cjc.main.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService{
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Kinley s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}

	@Override
	public Iterable<Kinley> getData() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public Kinley updateData(Kinley s) {
		// TODO Auto-generated method stub
		return hr.save(s);
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
	}

	@Override
	public Kinley editData(int id,Kinley s) {
		// TODO Auto-generated method stub
		return hr.save(s);
	}

	

	

}
