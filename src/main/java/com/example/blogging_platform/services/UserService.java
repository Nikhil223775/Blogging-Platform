package com.example.blogging_platform.services;

import com.example.blogging_platform.models.User;
import com.example.blogging_platform.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private void createUser(User user){
        userRepository.save(user);
    }
}
