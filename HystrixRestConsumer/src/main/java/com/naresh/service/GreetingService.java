package com.naresh.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class GreetingService {
	
	@HystrixCommand(fallbackMethod = "defaultGreeting")
    public String getGreeting(String username) {
        return new RestTemplate()
          .getForObject("http://localhost:2021/greeting/{username}", 
          String.class, username);
    }
  
    @SuppressWarnings("unused")
	private String defaultGreeting(String username) {
        return "Hello User!";
    }

}
