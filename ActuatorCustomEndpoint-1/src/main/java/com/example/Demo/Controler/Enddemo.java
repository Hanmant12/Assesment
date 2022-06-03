package com.example.Demo.Controler;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Component
@Endpoint(id ="custom", enableByDefault = true)
public class Enddemo {

	@ReadOperation
	public sa getsa()
	{
		return new sa(1,"done");
	}
}

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
 class sa
{
	private int id;
	private String status;
}
