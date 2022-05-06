package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Abcxyz;

@Repository
public interface TableRepo extends JpaRepository<Abcxyz, Integer> {

}
