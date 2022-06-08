package com.restapi.repository;

import org.springframework.stereotype.Repository;

import com.restapi.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
