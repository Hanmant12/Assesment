package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Engineer;

@Repository
public interface EngineerRepo extends JpaRepository<Engineer, Integer>{

}
