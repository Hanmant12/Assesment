package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Demo;
@Repository
public interface DemoRepo extends JpaRepository<Demo, Integer>{

}
