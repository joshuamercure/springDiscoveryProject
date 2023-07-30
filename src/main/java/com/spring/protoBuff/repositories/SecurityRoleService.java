package com.spring.protoBuff.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.protoBuff.enums.Role;
import com.spring.protoBuff.models.SecurityRole;

import jakarta.persistence.EntityNotFoundException;

@Service
public class SecurityRoleService {

    @Autowired
    SecurityRoleRepository securityRoleRepository;

    public SecurityRole getByName(Role role){

        return securityRoleRepository.findByName(role).orElseThrow(()->new EntityNotFoundException("Role not found"));
    }



    
}
