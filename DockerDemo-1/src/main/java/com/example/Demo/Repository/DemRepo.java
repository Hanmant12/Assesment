package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Dem;
@Repository
public interface DemRepo extends JpaRepository<Dem, Integer>{

}
