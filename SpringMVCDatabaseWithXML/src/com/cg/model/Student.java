package com.cg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="StudentTable")
public class Student {
	@Id
	@Min(value = 100, message = "Enter Valid ID more than 100")
	private int sid;
	@NotNull(message = "Name is required")
	@Size(min = 5, max = 20, message = "Name Must Be between 5 to 20")
	private String name;
	@Email(message = "Enter Valid Email")
	private String email;
	@Min(value = 0, message = "Marks should be greater than 0")
	@Max(value = 100, message = "Marks Should not be greater than 100")
	private int marks;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}
