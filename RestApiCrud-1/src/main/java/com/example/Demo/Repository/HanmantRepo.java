package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Hanmant;
@Repository
public interface HanmantRepo extends JpaRepository<Hanmant, Integer>{

}
