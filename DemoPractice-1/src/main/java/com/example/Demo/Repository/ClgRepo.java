package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Clg;

@Repository
public interface ClgRepo extends JpaRepository<Clg, Integer>{

}
