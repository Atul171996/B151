package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlayerRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int recordId;
	int totalRun;
	int totalWickets;
	int totalSix;
	int totalFor;
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public int getTotalRun() {
		return totalRun;
	}
	public void setTotalRun(int totalRun) {
		this.totalRun = totalRun;
	}
	public int getTotalWickets() {
		return totalWickets;
	}
	public void setTotalWickets(int totalWickets) {
		this.totalWickets = totalWickets;
	}
	public int getTotalSix() {
		return totalSix;
	}
	public void setTotalSix(int totalSix) {
		this.totalSix = totalSix;
	}
	public int getTotalFor() {
		return totalFor;
	}
	public void setTotalFor(int totalFor) {
		this.totalFor = totalFor;
	}
	

}
