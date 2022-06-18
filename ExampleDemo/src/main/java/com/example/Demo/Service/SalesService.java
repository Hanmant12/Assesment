package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Sales;

public interface SalesService {

	public void savedata(Sales sales);
	public List<Sales> print();
	public void delete(int id);
	public void updatee(Sales sales);
}
