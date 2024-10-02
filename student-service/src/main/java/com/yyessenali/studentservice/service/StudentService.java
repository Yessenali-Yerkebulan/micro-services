package com.yyessenali.studentservice.service;

import java.util.List;

import com.yyessenali.studentservice.model.Student;

public interface StudentService {
	void saveStudent(Student student);
	
	List<Student> findAllStudents();
	
	List<Student> findAllStudents(int schoolId);
}
