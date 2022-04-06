package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Sample;

@Repository
public interface SampleRepo extends JpaRepository<Sample, Integer> {

}
