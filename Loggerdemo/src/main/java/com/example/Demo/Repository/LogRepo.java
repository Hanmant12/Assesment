package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Log;

@Repository
public interface LogRepo extends JpaRepository<Log, Integer> {

}
