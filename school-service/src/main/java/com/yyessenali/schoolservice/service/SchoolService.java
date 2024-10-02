package com.yyessenali.schoolservice.service;

import java.util.List;

import com.yyessenali.schoolservice.dto.FullSchoolResponse;
import com.yyessenali.schoolservice.model.School;

public interface SchoolService {
	void saveSchool(School school);
	
	List<School> findAllSchools();

	FullSchoolResponse findSchoolsWithStudents(Integer schoolId);
}
