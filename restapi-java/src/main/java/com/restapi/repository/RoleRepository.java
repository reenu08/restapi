package com.restapi.repository;

import org.springframework.stereotype.Repository;

import com.restapi.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
