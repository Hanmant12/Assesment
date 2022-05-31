package com.example.Demo.Controler;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Component
@Endpoint(id="demoendpoint", enableByDefault = true )
public class Customeendpoint {

	@ReadOperation
	public dem getdem()
	{
		return new dem(1,"activate demo");
	}
}

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
class dem
{
	private int did;
	private String namepoint;
	
}
