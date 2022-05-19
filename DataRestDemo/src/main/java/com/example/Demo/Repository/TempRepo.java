package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Temp;
@Repository
public interface TempRepo extends JpaRepository<Temp, Integer>{

}
