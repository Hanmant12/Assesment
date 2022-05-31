package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Cusdemo;
@Repository
public interface CusdemoRepo extends JpaRepository<Cusdemo, Integer>{

}
