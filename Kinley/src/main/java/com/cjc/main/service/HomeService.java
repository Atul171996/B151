package com.cjc.main.service;

import com.cjc.main.model.Kinley;

public interface HomeService {

	void saveData(Kinley s);

	Iterable<Kinley> getData();

	Kinley  updateData(Kinley s);

	void deleteData(int id);

	Kinley editData(int id, Kinley s);

}
