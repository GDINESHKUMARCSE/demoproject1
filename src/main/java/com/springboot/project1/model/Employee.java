package com.springboot.project1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eno;
	private String ename;
	private String edept;
	private long salary;
	
	
	public Employee() {
		super();
	}
	public Employee(long eno, String ename, String edept, long salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.edept = edept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", edept=" + edept + ", salary=" + salary + "]";
	}
	public long getEno() {
		return eno;
	}
	public void setEno(long eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	

}
