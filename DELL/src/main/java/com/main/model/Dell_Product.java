package com.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dell_Product {

	@Id
	int pro_id;
	String pro_name;
	String pro_Price;
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getPro_Price() {
		return pro_Price;
	}
	public void setPro_Price(String pro_Price) {
		this.pro_Price = pro_Price;
	}
	
}
