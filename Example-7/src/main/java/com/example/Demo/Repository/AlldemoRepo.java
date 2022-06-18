package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Alldemo;
@Repository
public interface AlldemoRepo extends JpaRepository<Alldemo, Integer>{

}
