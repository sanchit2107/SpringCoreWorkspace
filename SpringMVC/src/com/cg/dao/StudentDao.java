package com.cg.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.model.Student;

@Repository
public class StudentDao {
	static List<Student> li=new ArrayList<Student>();
	static {
		li.add(new Student(101, "Ramesh", "B.Tech", 88));
		li.add(new Student(102, "Pyush", "BE", 98));
		li.add(new Student(103, "Sanchit", "MCA", 78));
	}
	public void addStudent(Student s) {
		li.add(s);
	}
	public List<Student> showAll() {
		return li;
	}
	public Student searchStudent(int sid) {
		for(Student s: li) {
			if(s.getSid()==sid) 
				return s;				
		}
		return null;
	}
	public void removeStudent(int sid) {
		Iterator<Student> i=li.iterator();
		while(i.hasNext())
		{
			if(i.next().getSid()==sid) {
				i.remove();
			}
		}
	}
	public void updateStudent(Student student) {
		for(Student s: li) {
			if(s.getSid()==student.getSid()) {
				s.setName(student.getName());
				s.setSubject(student.getSubject());
				s.setMarks(student.getMarks());
				break;
			}
		}
	}

}
