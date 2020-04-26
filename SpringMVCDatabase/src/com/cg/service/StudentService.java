package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.StudentDao;
import com.cg.model.Student;
@Service
public class StudentService {
	@Autowired
	StudentDao sd;
	public void addStudent(Student student) {
		sd.saveStudent(student);
	}
	public List<Student> getAll() {
		return sd.getAllStudent();
	}
}
