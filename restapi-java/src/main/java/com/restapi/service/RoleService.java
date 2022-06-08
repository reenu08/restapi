package com.restapi.service;

import java.util.List;

import com.restapi.model.Role;

import java.util.List;

public interface RoleService {

	boolean addRole(Role role);
	
	List<Role> findAllRoles();
 
}
