package com.example.tax24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tax24.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
