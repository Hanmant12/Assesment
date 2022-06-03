package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Inter;
@Repository
public interface InterRepo extends JpaRepository<Inter, Integer>{

}
