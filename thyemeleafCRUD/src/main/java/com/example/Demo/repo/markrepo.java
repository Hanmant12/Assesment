package com.example.Demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.model.mark;
@Repository
public interface markrepo extends JpaRepository<mark,Integer>{

}
