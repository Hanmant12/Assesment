package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Abc;
@Repository
public interface AbcRepo extends JpaRepository<Abc, Integer>{

}
