package com.example.insuliinisokeri.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String time, insulinUnit, preSugar, postSugar;

	public Event() {}
	
	public Event(String time, String insulinUnit, String preSugar, String postSugar) {
		super();
		this.time = time;
		this.insulinUnit = insulinUnit;
		this.preSugar = preSugar;
		this.postSugar = postSugar;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getInsulinUnit() {
		return insulinUnit;
	}
	public void setInsulinUnit(String insulinUnit) {
		this.insulinUnit = insulinUnit;
	}
	public String getPreSugar() {
		return preSugar;
	}
	public void setPreSugar(String preSugar) {
		this.preSugar = preSugar;
	}
	public String getPostSugar() {
		return postSugar;
	}
	public void setPostSugar(String postSugar) {
		this.postSugar = postSugar;
	}

	

	
	@Override
	public String toString() {
		return "Event [id=" + id + ", time=" + time + ", insulinUnit=" + insulinUnit + ", preSugar=" + preSugar + ", postSugar=" + postSugar + "]";
	}

}
