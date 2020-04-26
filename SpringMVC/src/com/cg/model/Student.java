package com.cg.model;

public class Student {
	private int sid;
	private String name;
	private String subject;
	private int marks;
	public Student() {}
	
	public Student(int sid, String name, String subject, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
	}

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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
