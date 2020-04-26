package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.StudentDao;
import com.cg.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao sd; 
	public void saveStudent(Student student) {
		if(student!=null)
			sd.addStudent(student);
	}
	public List<Student> getAllStudent() {
		return sd.showAll();
	}
	public Student findStudent(int sid) {
		return sd.searchStudent(sid);
	}
	public void removeStudent(int sid) {
		sd.removeStudent(sid);
	}
	public void updateStudent(Student stu) {
		sd.updateStudent(stu);
	}
}
