package com.me.naga.RestCommunicationAPI;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContainerRestService {
	
	@RequestMapping("/dt")
	public String getDate() {
		
		String dt=new Date().toString();
		return dt;
	}

	@RequestMapping("/hi")
	public String getHello() {
		
		return "Hi!! Welcome";
	}
}
