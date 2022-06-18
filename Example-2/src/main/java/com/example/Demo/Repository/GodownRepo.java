package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Godown;
@Repository
public interface GodownRepo extends JpaRepository<Godown, Integer>{

}
