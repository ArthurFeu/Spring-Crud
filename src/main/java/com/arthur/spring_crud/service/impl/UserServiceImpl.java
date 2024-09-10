package com.arthur.spring_crud.service.impl;

import com.arthur.spring_crud.entity.User;
import com.arthur.spring_crud.repository.UserRepository;
import com.arthur.spring_crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}
