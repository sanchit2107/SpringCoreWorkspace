package com.cg.controllar;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
		m.addAttribute("student", new Student());
		m.addAttribute("students",studentService.getAll());
		 return "AddStudent";
	 }
	@RequestMapping("hello")
	public String addStudent(@Valid Student student, BindingResult result) {
		if(result.hasErrors())
		{
			System.out.println("===========Error=============");
			return "AddStudent";
		}
		else
		{
			studentService.addStudent(student);
			return "redirect:student";
		}
	}
	@RequestMapping("removeStudent")
	public String delStudent(@RequestParam("sid") String sid) {
		studentService.removeStudent(Integer.parseInt(sid));
		return "redirect:student";
	}
	@RequestMapping("updateStudent")
	public String updatePage(@RequestParam("sid") String sid, Model m) {
		m.addAttribute("student", studentService.searchStudent(Integer.parseInt(sid)));
		return "updateStudent";
	}
	@RequestMapping("update")
	public String updateStudent(Student student) {
		studentService.updateStudent(student);
		return "redirect:student";
	}
	
}
