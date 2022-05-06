package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Project;
@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer>{

}
