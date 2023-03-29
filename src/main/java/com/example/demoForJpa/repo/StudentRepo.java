package com.example.demoForJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoForJpa.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long>{
	
}
