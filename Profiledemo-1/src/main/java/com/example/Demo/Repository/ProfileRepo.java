package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Profile;

@Repository
public interface ProfileRepo extends JpaRepository<Profile, Integer> {

}
