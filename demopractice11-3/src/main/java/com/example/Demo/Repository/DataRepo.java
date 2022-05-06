package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Datademo;

@Repository
public interface DataRepo extends JpaRepository<Datademo, Integer>{

}
