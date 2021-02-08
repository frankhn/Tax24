package com.example.tax24.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tax24.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}

