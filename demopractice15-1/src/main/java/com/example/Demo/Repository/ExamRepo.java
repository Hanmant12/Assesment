package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Demo.Entity.Exam;

public interface ExamRepo extends JpaRepository<Exam, Long>{

	@Query("select u from Exam u where name=:n")
	public Exam findByName(@Param("n") String name );

	
}
