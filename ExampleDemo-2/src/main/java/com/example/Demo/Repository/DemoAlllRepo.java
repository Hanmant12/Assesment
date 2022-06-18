package com.example.Demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.DemoAlll;
@Repository
public interface DemoAlllRepo extends JpaRepository<DemoAlll, Integer>{

	@Query("select u from DemoAlll u where u.collage=:c")
	public List<DemoAlll> findBycollage(@Param("c") String Collage);
}
