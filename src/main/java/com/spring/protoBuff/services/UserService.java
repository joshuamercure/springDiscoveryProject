package com.spring.protoBuff.services;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.protoBuff.models.User;
import com.spring.protoBuff.models.UserProto;
import com.spring.protoBuff.repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUserByUserName(String userName){
       return userRepository.findByUsername(userName).orElseThrow(()-> new EntityNotFoundException("User with username " + userName + " Not found"));
    }

    public Boolean userExistByUsername(String userName){

        Optional<User> user = userRepository.findByUsername(userName);

        if(user.isPresent()){
            return true;
        }
        return false;

        
    }
    public Boolean userExistByEmail(String email){

        Optional<User> user = userRepository.findByUsername(email);

        if(user.isPresent()){
            return true;
        }
        return false;

        
    }
    public void save(User user){
        userRepository.save(user);
    }

     public UserProto.User getUserProtoByUsername(String username) {

        User user =  getUserByUserName(username);

        return UserProto.User.newBuilder()
                .setId(user.getId().intValue())
                .setEmail(user.getEmail())
                .setUsername(username)
                .setRole(user.getRole().getName().toString())
                .build();
    }

    
}
