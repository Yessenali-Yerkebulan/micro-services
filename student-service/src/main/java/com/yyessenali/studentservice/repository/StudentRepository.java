package com.yyessenali.studentservice.repository;

import com.yyessenali.studentservice.model.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	List<Student> findAllBySchoolId(int schoolId);

}
