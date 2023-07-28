package com.security.login.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<SecurityRole, Long> {
  Optional<SecurityRole> findByName(Role name);
}