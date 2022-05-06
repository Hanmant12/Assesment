package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Demo1;

@Repository
public interface DemoRepo extends JpaRepository<Demo1, Integer> {

}
