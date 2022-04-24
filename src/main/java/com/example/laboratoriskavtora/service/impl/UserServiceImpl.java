package com.example.laboratoriskavtora.service.impl;

import com.example.laboratoriskavtora.model.User;
import com.example.laboratoriskavtora.model.exceptions.UserNotFoundException;
import com.example.laboratoriskavtora.repository.UserRepository;
import com.example.laboratoriskavtora.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(String userId) {
        return this.userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException());
    }
}
