package com.example.Demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Hostel;
@Repository
public interface HostelRepo extends JpaRepository<Hostel, Integer>{

	@Query("select u.id,u.name from Hostel u")
	public List<Object>findAllBY();
}
