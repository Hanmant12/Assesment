package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Example;

@Repository
public interface ExampleRepo extends JpaRepository<Example, Integer>{

}
