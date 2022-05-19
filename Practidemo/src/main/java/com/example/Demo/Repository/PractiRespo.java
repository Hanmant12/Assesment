package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Practidemo;
@Repository
public interface PractiRespo extends JpaRepository<Practidemo, Integer> {

}
