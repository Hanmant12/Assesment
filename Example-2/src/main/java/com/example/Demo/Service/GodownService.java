package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.Godown;

public interface GodownService {

	public void ad(Godown godown);
	public List<Godown> showre();
	public void deletee(int id);
	public void updatee(Godown godown);
	
}
