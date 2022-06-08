package com.restapi.service;


import java.util.List;

import com.restapi.model.Employee;

public interface EmployeeService {
	
	boolean addEmployee(Employee employee);
	List<Employee> findAllEmployees();
 
}
