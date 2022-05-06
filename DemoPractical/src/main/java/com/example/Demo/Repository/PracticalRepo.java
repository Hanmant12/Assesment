package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Practicaldem;
@Repository
public interface PracticalRepo extends JpaRepository<Practicaldem, Integer>{

}
