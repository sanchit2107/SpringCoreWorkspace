package com.cg.controllar;

import javax.servlet.http.HttpServletRequest;

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
		m.addAttribute("students",studentService.getAllStudent());
		 return "AddStudent";
	 }
	@RequestMapping("hello")
	public String addStudent(Student student) {
		studentService.saveStudent(student);
		return "redirect:student";
	}
	@RequestMapping("find")
	public String findPage() {
		return "findStudent";
	}
	@RequestMapping("search")
	public String findStudent(@RequestParam("t1") String sid, Model m) {
		int id=Integer.parseInt(sid);
		Student s=studentService.findStudent(id);
		m.addAttribute("student", s);
		return "findStudent";
	}
	@RequestMapping("removeStudent")
	public String deleteStudent(@RequestParam("sid") String sid) {
		studentService.removeStudent(Integer.parseInt(sid));
		return "redirect:student";
	}
	@RequestMapping("updateStudent")
	public String updatePage(@RequestParam("sid") String sid, Model m) {
		Student s=studentService.findStudent(Integer.parseInt(sid));
		m.addAttribute("student",s);
		return "updateStudent";
	}
	@RequestMapping("update")
	public String updateStudent(Student student) {
		studentService.updateStudent(student);
		return "redirect:student";
	}
}
