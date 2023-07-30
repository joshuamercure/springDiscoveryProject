package com.spring.protoBuff.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.protoBuff.enums.Role;
import com.spring.protoBuff.models.SecurityRole;


public interface SecurityRoleRepository extends JpaRepository<SecurityRole, Long> {
  Optional<SecurityRole> findByName(Role name);
}