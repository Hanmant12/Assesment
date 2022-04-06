package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Tuv;

@Repository
public interface TuvRepo extends JpaRepository<Tuv, Integer> {

}
