package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "emp")
public class Employee {
	@Value("#{T(java.lang.Math).random()*10000}")
	private int empid;
	@Value("#{ed.names[1]}")
	private String name;
	@Value("#{ed.m[emp.name]}")
	private int salary;
	@Value("#{emp.salary > 50000?'Manager':'Developer'}")
	private String grade;
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
