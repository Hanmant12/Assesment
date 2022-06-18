package com.example.Demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Store;
@Repository
public interface StoreRepo extends JpaRepository<Store, Integer>{

	public List<Store> findByDescription(String description);
}
