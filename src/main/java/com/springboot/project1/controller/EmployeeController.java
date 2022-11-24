package com.springboot.project1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project1.repository.EmployeeRepository;
import com.springboot.project1.model.Employee;



@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/empdetails")
	public List<Employee> getEmployeeDetails(){
		return  employeeRepository.findAll();
	}
	
	@GetMapping("/empdetails/{eno}")
	public Optional<Employee> getEmployeeDetailsById(@PathVariable (value= "eno")  Long eno){
		return  employeeRepository.findById(eno);
	}
	@PostMapping("/empdetails")
	@ResponseStatus(HttpStatus.CREATED)
	public Employee setEmployeeDetails(@RequestBody Employee employee) {
		
		return employeeRepository.save(employee);
	}
	@DeleteMapping("/empdetails/{eno}")
	public void deleteEmployeeDetailsById(@PathVariable (value= "eno")  Long eno){
		  employeeRepository.deleteById(eno);
	}
	@PutMapping("/empdetails/{eno}")
	public Employee updateEmployeeDetailsById(@RequestBody Employee employee, @PathVariable (value= "eno")  Long eno){
		//Optional<Employee> emp = employeeRepository.findById(eno); 
		
		return employeeRepository.save(employee);
				 }
}
