package com.example.Demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Prace;
@Repository
public interface PraceRepo extends JpaRepository<Prace, Integer>{

	@Query("select u.id,u.mark from Prace u where u.city=:n")
	public List<Object> findAllByCity(@Param("n") String city);
}
