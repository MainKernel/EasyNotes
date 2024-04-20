package com.easynotes.model.service;

import com.easynotes.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mightyloot
 * */
@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    private void setDependencies(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
