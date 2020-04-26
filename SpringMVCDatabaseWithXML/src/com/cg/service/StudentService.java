package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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
	public void removeStudent(int sid) {
		sd.deleteStudent(sid);
	}
	public void updateStudent(Student student) {
		sd.updateStudent(student);
	}
	public Student searchStudent(int sid) {
		return sd.findStudent(sid);
	}
}
