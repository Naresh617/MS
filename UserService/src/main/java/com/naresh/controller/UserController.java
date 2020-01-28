package com.naresh.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.model.UserDetails;
import com.naresh.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;

	@GetMapping("/users")
	public List<UserDetails> getAllUsers() {
		List<UserDetails> users = new ArrayList<UserDetails>();
		userRepository.findAll().forEach(users::add);
		return users;
	}

	@PostMapping(value = "/users/create")
	public UserDetails postUser(@RequestBody UserDetails user) {

		UserDetails saveUser = userRepository.save(new UserDetails(user.getName(), user.getAge()));
		return saveUser;
	}

	@GetMapping(value = "/users/{id}")
	public Optional<UserDetails> findById(@PathVariable long id) {
		Optional<UserDetails> customers = userRepository.findById(id);
		return customers;
	}

}
