package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.ActuDemo;
@Repository
public interface ActuDemoRepo extends JpaRepository<ActuDemo, Integer>{

}
