package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Exceptiondem;
@Repository
public interface ExceptiondemRepo extends JpaRepository<Exceptiondem, Integer>{

}
