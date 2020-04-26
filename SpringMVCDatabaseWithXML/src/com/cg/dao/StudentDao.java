package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.model.Student;

@Repository
@Transactional
public class StudentDao {
	@PersistenceContext
	EntityManager em;
	public void saveStudent(Student student) {
		em.persist(student);
	}
	public List<Student> getAllStudent() {
		List<Student> li=em.createQuery("from Student s").getResultList();
		return li;
	}
	public void deleteStudent(int sid) {
		Student s=em.find(Student.class, sid);
		em.remove(s);
	}
	public void updateStudent(Student student) {
		Student s=em.find(Student.class, student.getSid());
		s.setName(student.getName());
		s.setEmail(student.getEmail());
		s.setMarks(student.getMarks());
		em.persist(s);
	}
	public Student findStudent(int sid) {
		Student s=em.find(Student.class, sid);
		return s;
	}
}
