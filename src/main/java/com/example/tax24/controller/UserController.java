package com.example.tax24.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.ElementCollection;
import javax.validation.Valid;

import com.example.tax24.exception.ResourceNotFoundException;

import com.example.tax24.repository.RoleRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tax24.model.*;
import com.example.tax24.repository.UserRepository;

@RestController
@RequestMapping("/api/v1")
@Validated
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@GetMapping("/drivers")
	public List<User> findByRoleName() {
		return userRepository.findByRoles_name("user");
	}

	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user) {
		final User save = userRepository.save(user);
		roleRepository.save(new Role("user", save));
		return save;
	}
}
