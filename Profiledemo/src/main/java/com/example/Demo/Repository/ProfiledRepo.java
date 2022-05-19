package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Profiled;

@Repository
public interface ProfiledRepo extends JpaRepository<Profiled, Integer> {

}
