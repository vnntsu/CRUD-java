package com.example.service.controller;

import com.example.business.UserManager;
import com.example.service.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserManager userManager;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<List<User>>(userManager.getUsers(), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<String> create(@Valid @RequestBody User user) {
        userManager.create(user);
        return new ResponseEntity<String>("Add user successfully", HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> update(@PathVariable(value = "id") Long idUser) {
        User user = userManager.getUserBy(idUser);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<String> update(@PathVariable(value = "id") Long idUser,
                                         @Valid @RequestBody User user) {
        user.setId(idUser);
        userManager.update(user);
        return new ResponseEntity<String>("Update user successfully", HttpStatus.OK);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> update(@PathVariable(value = "id") Long idUser) {
        userManager.deleteBy(idUser);
        return new ResponseEntity<String>("Delete user successfully", HttpStatus.OK);
    }
}
