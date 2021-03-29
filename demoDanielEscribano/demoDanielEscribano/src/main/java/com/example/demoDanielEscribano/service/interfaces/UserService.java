package com.example.demoDanielEscribano.service.interfaces;

import com.example.demoDanielEscribano.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(int id);
    User updateUser(User user);
    User insertUser(User user);
    void deleteUser(User user);
}
