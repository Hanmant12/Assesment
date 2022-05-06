package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Restt;
@Repository
public interface ResttRepo extends JpaRepository<Restt, Integer>{

}
