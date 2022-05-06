package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Teacher;
@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer>{

}
