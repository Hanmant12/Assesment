package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.DataR;
@Repository
public interface DataRRepo extends JpaRepository<DataR, Integer>{

}
