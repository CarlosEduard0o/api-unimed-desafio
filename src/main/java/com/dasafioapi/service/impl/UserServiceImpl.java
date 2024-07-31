package com.dasafioapi.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.dasafioapi.domain.model.User;
import com.dasafioapi.domain.repository.UserRepository;
import com.dasafioapi.service.UserService;

@Service
public class UserServiceImpl implements UserService{

     private final UserRepository userRepository;

     public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
    
    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByPlanRegisterNumber(userToCreate.getPlan().getRegisterNumber())) {
            throw new IllegalArgumentException("This Register number already exists.");
        }
        return userRepository.save(userToCreate);
    }
    
}
