package com.test;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust")
public class MyCust {
	@Id
	private int cid;
	private String cname;
	private int cincome;
	
	
	public int getcid() {
		return cid;
	}
	public void setcid(int cid) {
		this.cid = cid;
	}
	public String getcname() {
		return cname;
	}
	public void setcname(String cname) {
		this.cname = cname;
	}
	public int getcincome() {
		return cincome;
	}
	public void setcincome(int cincome) {
		this.cincome = cincome;
	}
	
}