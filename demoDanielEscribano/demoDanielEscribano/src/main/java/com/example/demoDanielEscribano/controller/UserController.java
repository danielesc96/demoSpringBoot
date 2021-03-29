package com.example.demoDanielEscribano.controller;




import com.example.demoDanielEscribano.entities.User;
import com.example.demoDanielEscribano.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "user/")
public class UserController {

    @Autowired
    UserService service;


    @PostMapping(value = "/insertUser")
    User post(@RequestBody  User user) {
        return service.insertUser(user);
    }

    @PutMapping(value = "/updateUser")
    User updateUser(@RequestBody User user) {

        return service.updateUser(user);

    }

    @DeleteMapping(value = "/deleteUser")
    void deleteUser(@RequestBody User user) {
        service.deleteUser(user);
    }

    @GetMapping(value = "/")
    List<User> getAll() {
    return service.getAll();
    }

    @GetMapping(value = "/{id}")
    User getOne(@PathVariable(value="id") int id) {

        return service.getById(id);

    }


}
