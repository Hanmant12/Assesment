package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Mahesh;
@Repository
public interface MaheshRepo extends JpaRepository<Mahesh, Integer>{

	@Query("select u from Mahesh u where name=:n")
	public Mahesh findByname(@Param("n") String name);
	
}
