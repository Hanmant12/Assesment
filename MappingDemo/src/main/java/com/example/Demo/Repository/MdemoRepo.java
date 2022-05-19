package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Keshavrao;
@Repository
public interface MdemoRepo extends JpaRepository<Keshavrao, Integer>{

}
