package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Car;
@Repository
public interface CarRepo extends JpaRepository<Car, Integer>{

}
