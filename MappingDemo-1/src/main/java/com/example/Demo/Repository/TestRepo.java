package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Test;
@Repository
public interface TestRepo extends JpaRepository<Test, Integer>{

}
