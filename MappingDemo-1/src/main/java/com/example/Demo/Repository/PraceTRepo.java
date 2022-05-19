package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.PraceT;
@Repository
public interface PraceTRepo extends JpaRepository<PraceT, Integer>{

}
