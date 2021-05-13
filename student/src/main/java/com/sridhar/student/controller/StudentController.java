package com.sridhar.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sridhar.student.model.Student;
import com.sridhar.student.service.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceImpl studentService;
	
	@PostMapping("/getstudent")
	public Student getStudent(@ModelAttribute("htno") String htno)
	{
		return studentService.getStudent(htno);
	}
	
	
}
