package com.spring.discovery.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.discovery.enums.Role;
import com.spring.discovery.models.SecurityRole;


public interface SecurityRoleRepository extends JpaRepository<SecurityRole, Long> {
  Optional<SecurityRole> findByName(Role name);
}