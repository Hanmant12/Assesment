package com.example.Demo.Controler;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Endpoint(id = "custom",enableByDefault = true)
@Component
public class CustomEndpoint {

	@ReadOperation
	public demo ed()
	{
	 return new demo(1,"abc");	
	}
	
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class demo{
	private int a;
	private String name;
	
}
