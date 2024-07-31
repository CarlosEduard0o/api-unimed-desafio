package com.dasafioapi.service;

import com.dasafioapi.domain.model.User;

public interface UserService {
    
    User findById(Long id);

    User create(User userToCreate);
    
}
