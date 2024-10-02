package com.yyessenali.studentservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yyessenali.studentservice.model.Student;
import com.yyessenali.studentservice.repository.StudentRepository;
import com.yyessenali.studentservice.service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

	private final StudentRepository studentRepository;

	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public List<Student> findAllStudents(int schoolId) {
		return studentRepository.findAllBySchoolId(schoolId);
	}

}
