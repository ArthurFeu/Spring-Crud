package com.arthur.spring_crud.service;

import com.arthur.spring_crud.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    User getUser(int id);

    void updateUser(Integer id, User user);

    void deleteUser(Integer id);
}
