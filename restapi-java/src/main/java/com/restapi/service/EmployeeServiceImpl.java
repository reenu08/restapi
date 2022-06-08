package com.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.model.Employee;
import com.restapi.repository.EmployeeRepository;


@Service("employeeServiceRepositoryImpl")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
@Override
public boolean addEmployee(Employee employee) {
	return employeeRepository.save(employee)==employee;
}

@Override
public List<Employee> findAllEmployees() {
	
	return employeeRepository.findAll();
}


	}
