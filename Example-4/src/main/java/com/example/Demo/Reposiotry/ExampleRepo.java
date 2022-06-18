package com.example.Demo.Reposiotry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Example;
@Repository
public interface ExampleRepo extends JpaRepository<Example, Integer>{

	@Query("select u from Example u where u.name=:c")
	public List<Example> findByName(@Param("c") String name);
}
