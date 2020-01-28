package com.naresh.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/rest")
public class UserController {
	
	@Autowired
	private RestTemplate template;

	
	
	@GetMapping("/demo")
	public String test() {
		return "working....";
	}
	 
	
	@GetMapping("/test")
	public String invokeUsersAll() {
		return template.getForObject("http://localhost:2021/userservice/users", String.class);
	}
	
	@GetMapping("/userid/{id}")
	@HystrixCommand(fallbackMethod = "fallbackMethod")
	public String invokeUserById(@PathVariable("id") long id)
	{
		return template.getForObject("http://localhost:2021/userservice/users/"+id,String.class);
	}
	
	public String  fallbackMethod(long userid){
        
        return "Fallback response:: No userid details available temporarily"+userid;
    }

}
