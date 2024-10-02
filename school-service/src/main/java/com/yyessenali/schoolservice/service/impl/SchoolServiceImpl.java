package com.yyessenali.schoolservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yyessenali.schoolservice.client.StudentClient;
import com.yyessenali.schoolservice.dto.FullSchoolResponse;
import com.yyessenali.schoolservice.model.School;
import com.yyessenali.schoolservice.repository.SchoolRepository;
import com.yyessenali.schoolservice.service.SchoolService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService{
	
	private final SchoolRepository schoolRepository;
	private final StudentClient studentClient;
	
	@Override
	public void saveSchool(School school) {
		schoolRepository.save(school);
	}
	
	@Override
	public List<School> findAllSchools() {
		return schoolRepository.findAll();
	}

	@Override
	public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
		School school = schoolRepository.findById(schoolId)
				.orElse(
							School.builder()
								.name("NOT_FOUND")
								.email("NOT_FOUND")
								.build()
						);
		var students = studentClient.findAllStudentsBySchool(schoolId);
		
		return FullSchoolResponse.builder()
				.name(school.getName())
				.email(school.getEmail())
				.students(students)
				.build();
	}
}
