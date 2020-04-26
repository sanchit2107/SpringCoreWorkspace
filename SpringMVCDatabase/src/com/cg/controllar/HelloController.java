package com.cg.controllar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

import com.cg.model.Student;
import com.cg.service.StudentService;


@Controller
public class HelloController {
	@Autowired
	private StudentService studentService; 
	@RequestMapping("student")
	 public String addPage(Model m) {
		m.addAttribute("students",studentService.getAll());
		 return "AddStudent";
	 }
	@RequestMapping("hello")
	public String addStudent(Student student) {
		studentService.addStudent(student);
		return "redirect:student";
	}
	
}
