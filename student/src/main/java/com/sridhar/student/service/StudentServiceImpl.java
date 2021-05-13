package com.sridhar.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sridhar.student.model.Student;
import com.sridhar.student.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public Student getStudent(String htno)
	{
		Optional<Student> studentOptional = studentRepo.findById(htno);
		if(studentOptional.isPresent())
			return studentOptional.get();
		else
			return null;
	}

}
