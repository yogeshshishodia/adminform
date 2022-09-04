package com.example.demo.service;

import com.example.demo.entities.Role;

public interface RoleService {
	
	//Create Role
	public Role addRole(Role role);
	//Retrieve
	public Role getRoleById(Long id);
	
	//Update
	public Role updateRole(Role role);
	
	//Delete
	public void deleteRoleById(Long id);
	
}
