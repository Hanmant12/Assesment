package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
