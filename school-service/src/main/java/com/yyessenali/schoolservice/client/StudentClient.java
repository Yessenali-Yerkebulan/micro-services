package com.yyessenali.schoolservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.yyessenali.schoolservice.dto.Student;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {
	@GetMapping("/school/{school-id}")
	List<Student> findAllStudentsBySchool(@PathVariable("school-id") Integer schoolId);
}
