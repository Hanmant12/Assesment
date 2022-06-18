package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Entity.DemoAlll;

public interface DemoAllService {

	public DemoAlll save(DemoAlll alll);
	public List<DemoAlll> show();
	public void delete(int id);
	public DemoAlll update(DemoAlll demoAlll);
	public List<DemoAlll> findCollage(String city);
	public int count();
}
