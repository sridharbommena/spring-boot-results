package com.sridhar.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sridhar.student.model.Student;

public interface StudentRepo extends JpaRepository<Student, String> {

}
