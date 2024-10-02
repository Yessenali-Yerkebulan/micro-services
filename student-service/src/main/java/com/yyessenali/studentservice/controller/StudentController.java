package com.yyessenali.studentservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.yyessenali.studentservice.model.Student;
import com.yyessenali.studentservice.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
	
	private final StudentService studentService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody Student student) {
		studentService.saveStudent(student);
	}
	
	@GetMapping
	public ResponseEntity<List<Student>> findAllStudents() {
		return ResponseEntity.ok(studentService.findAllStudents());
	}
	
	@GetMapping("/school/{school-id}")
	public ResponseEntity<List<Student>> findAllStudents(@PathVariable("school-id") int schoolId) {
		return ResponseEntity.ok(studentService.findAllStudents(schoolId));
	}
}
