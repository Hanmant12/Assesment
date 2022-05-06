package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.entity.Tuv;

public interface TuvService {
public void add(Tuv tuv);
public List<Tuv> print();
public void delete(int id);
public void update(Tuv tuv);
}
