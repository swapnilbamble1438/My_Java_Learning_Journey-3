package com.A6_First_Level_Cache;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Stud {
	
	@Id
	private int id;
	private String name;
	private String city;
	
	private Certificate certi;
	
	
	
	public Stud() {
		
	}

	
	public Stud(int id, String name, String city, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certi = certi;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public Certificate getCerti() {
		return certi;
	}


	public void setCerti(Certificate certi) {
		this.certi = certi;
	}


	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", city=" + city + ", certi=" + certi + "]";
	}
	
	
	
	

}
