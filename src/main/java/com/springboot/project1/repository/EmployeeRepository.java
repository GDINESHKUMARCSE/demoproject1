package com.springboot.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.project1.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}