package com.yyessenali.schoolservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yyessenali.schoolservice.model.School;

public interface SchoolRepository extends JpaRepository<School, Integer>{

}
