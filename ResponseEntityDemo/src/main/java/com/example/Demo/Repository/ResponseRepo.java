package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Response;

@Repository
public interface ResponseRepo extends JpaRepository<Response, Integer>{

}
