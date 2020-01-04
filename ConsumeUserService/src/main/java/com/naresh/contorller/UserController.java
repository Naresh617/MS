package com.naresh.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.naresh.model.UserDetails;

@RestController
public class UserController {
	
	@Autowired
	private RestTemplate template;

	
	
	@GetMapping("/demo")
	public String test() {
		return "working....";
	}
	 
	
	@GetMapping("/test")
	public String invokePaymentService() {
		return template.getForObject("http://localhost:2021/userservice/users", String.class);
	}
	 

}
