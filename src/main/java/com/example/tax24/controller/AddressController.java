package com.example.tax24.controller;

import com.example.tax24.model.User;
import com.example.tax24.repository.AddressRepository;
import com.example.tax24.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/address")
@Validated
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/drivers")
    public List<User> findByRoleName() {
        return userRepository.findByRoles_name("driver");
    }

}
