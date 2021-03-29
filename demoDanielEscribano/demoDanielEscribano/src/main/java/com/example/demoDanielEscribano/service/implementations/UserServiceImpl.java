package com.example.demoDanielEscribano.service.implementations;

import com.example.demoDanielEscribano.entities.User;
import com.example.demoDanielEscribano.repository.UserRepository;
import com.example.demoDanielEscribano.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getById(int id) {
        return repository.getOne(id);
    }

    @Override
    public User updateUser(User user) {
        return repository.save(user);
    }

    //misma funcion que el UPDATE
    @Override
    public User insertUser(User user) {
        return repository.save(user);
    }

    @Override
    public void deleteUser(User user) {

         repository.delete(user);
    }
}
