package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Practical;
@Repository
public interface PracticalRepo extends JpaRepository<Practical, Integer>{

}
