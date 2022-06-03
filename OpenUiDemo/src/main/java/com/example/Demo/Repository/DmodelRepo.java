package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Dmodel;
@Repository
public interface DmodelRepo extends JpaRepository<Dmodel, Integer>{

}
