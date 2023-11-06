package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Employee {
	@Id
	private int sl_no;
	private String employee_name;
	private String mobil_no;
	
	

	public Employee(int sl_no, String employee_name, String mobil_no) {
		super();
		this.sl_no = sl_no;
		this.employee_name = employee_name;
		this.mobil_no = mobil_no;
	}

	public Employee() {
	super();
	}
	
	public int getSl_no() {
		return sl_no;
	}
	public void setSl_no(int sl_no) {
		this.sl_no = sl_no;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getMobil_no() {
		return mobil_no;
	}
	public void setMobil_no(String mobil_no) {
		this.mobil_no = mobil_no;
	}
	
	

}

