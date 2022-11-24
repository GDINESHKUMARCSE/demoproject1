package com.springboot.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.project1.model.Employee;
import com.springboot.project1.repository.EmployeeRepository;

@SpringBootApplication
public class Project1Application implements CommandLineRunner {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
		
	}
		@Override
		public void run(String... args) throws Exception{
			Employee emp1 =  new Employee(2,"ganesh", "ECE",1500);
			Employee emp =  new Employee();
			emp.setEno(1);
			emp.setEname("dinesh");
			emp.setEdept("CSE");
			emp.setSalary(1000);
			
			employeeRepository.save(emp);
			employeeRepository.save(emp1);
		}
		
	
		
		
	

}
