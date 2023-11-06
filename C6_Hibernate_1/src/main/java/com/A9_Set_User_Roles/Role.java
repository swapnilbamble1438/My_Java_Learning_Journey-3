package com.A9_Set_User_Roles;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rid;
	private String role_name;
	
	@ManyToMany(mappedBy = "roles")
	List<User> users;
    

	
	
	
	

}
