package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Teache;
@Repository
public interface TeacheRepo extends JpaRepository<Teache, Integer>{

}
