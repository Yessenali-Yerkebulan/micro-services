package com.yyessenali.schoolservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yyessenali.schoolservice.model.School;
import com.yyessenali.schoolservice.repository.SchoolRepository;
import com.yyessenali.schoolservice.service.SchoolService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService{
	
	private final SchoolRepository schoolRepository;
	
	@Override
	public void saveSchool(School school) {
		schoolRepository.save(school);
	}
	
	@Override
	public List<School> findAllSchools() {
		return schoolRepository.findAll();
	}
}
