package com.A6_ManyToMany_mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	private String project_name;
	
	@ManyToMany(mappedBy = "projects")
	private List<Emp> emps;

	public Project() {

	}

	public Project(int pid, String project_name, List<Emp> emps) {
		super();
		this.pid = pid;
		this.project_name = project_name;
		this.emps = emps;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	
	
	
}
