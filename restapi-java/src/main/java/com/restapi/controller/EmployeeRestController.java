package com.restapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.Employee;
import com.restapi.service.EmployeeService;


@CrossOrigin
@RequestMapping("/employees")
@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeService employeeService;
	
	public EmployeeRestController()
	{
		System.out.println("intented Employee RestController Created");
		
	}
	
	//localhost:1212/employees
		@PostMapping
		public List<Employee> addEmployee(@RequestBody Employee employee) {
			  employeeService.addEmployee(employee);
			  return employeeService.findAllEmployees();
		
		}	

		
	   //localhost:1212/employees
		@GetMapping
		public List<Employee> getAllEmployees()
		{
			return employeeService.findAllEmployees();
		}
}