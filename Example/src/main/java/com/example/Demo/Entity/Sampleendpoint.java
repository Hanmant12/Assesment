package com.example.Demo.Entity;

import javax.persistence.Entity;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Component
@Endpoint(id = "custom",enableByDefault = true)
public class Sampleendpoint {

	@ReadOperation
	public custom getcu()
	{
		return new custom(1, "ok");
	}

}

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
class custom
{
	private int status;
	private String message;
	
	
}
