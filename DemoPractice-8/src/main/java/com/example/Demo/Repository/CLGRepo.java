package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.CLG;

@Repository
public interface CLGRepo extends  JpaRepository<CLG, Integer>{

}
