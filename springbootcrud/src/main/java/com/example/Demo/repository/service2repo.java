package com.example.Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Service2;
@Repository
public interface service2repo extends JpaRepository<Service2, Integer> {

}
