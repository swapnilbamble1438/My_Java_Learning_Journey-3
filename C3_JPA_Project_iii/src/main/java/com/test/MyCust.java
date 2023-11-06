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
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCincome() {
		return cincome;
	}
	public void setCincome(int cincome) {
		this.cincome = cincome;
	}
	
}