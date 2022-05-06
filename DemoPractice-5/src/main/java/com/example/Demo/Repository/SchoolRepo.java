package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Integer>{

}
