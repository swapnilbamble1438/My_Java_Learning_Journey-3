package com.A6_ManyToMany_mapping;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int eid;
	private String name;
	

	@ManyToMany
	@JoinTable(
			name = "emp_project",
			joinColumns = {@JoinColumn(name = "eid")},
			inverseJoinColumns = {@JoinColumn(name = "pid")}
			)
	private List<Project> projects;

	
	public Emp() {

	}


	public Emp(int eid, String name, List<Project> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.projects = projects;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Project> getProjects() {
		return projects;
	}


	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
	
	
	
}
