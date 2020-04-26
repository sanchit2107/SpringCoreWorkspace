package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "dept")
public class Department {
	@Value("${did}")
	private String did;
	@Value("${dname}")
	private String depName;
	@Value("${size}")
	private int depSize;
	@Autowired
	private Employee emp;
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public int getDepSize() {
		return depSize;
	}
	public void setDepSize(int depSize) {
		this.depSize = depSize;
	}
	
	public void printDepartment() {
		System.out.println("Department ID: "+did);
		System.out.println("Department Name: "+depName);
		System.out.println("Department Size: "+depSize);
		System.out.println("Name: "+emp.getName());
		System.out.println("EmployeeID: "+emp.getEmpid());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Salary: "+emp.getGrade());
	}
}
