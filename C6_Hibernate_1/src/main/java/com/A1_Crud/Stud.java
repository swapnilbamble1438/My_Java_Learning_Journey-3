package com.A1_Crud;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Stud {
	
	@Id
	private int id;
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	private String name;
	private String city;
	
	public Stud() {
		
	}

	public Stud(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
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
	
	

}
