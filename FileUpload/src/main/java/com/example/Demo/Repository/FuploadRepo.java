package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Fupload;
@Repository
public interface FuploadRepo extends JpaRepository<Fupload, Integer> {

}
