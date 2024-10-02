package com.yyessenali.schoolservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.yyessenali.schoolservice.model.School;
import com.yyessenali.schoolservice.service.SchoolService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {
	
	private final SchoolService schoolService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody School school) {
		schoolService.saveSchool(school);
	}
	
	@GetMapping
	public ResponseEntity<List<School>> findAllStudents() {
		return ResponseEntity.ok(schoolService.findAllSchools());
	}
}
