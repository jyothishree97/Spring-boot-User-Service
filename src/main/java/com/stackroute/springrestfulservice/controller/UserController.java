package com.stackroute.springrestfulservice.controller;

import com.stackroute.springrestfulservice.domain.User;
import com.stackroute.springrestfulservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class UserController {
   private UserService userService;

    public UserController() {
    }

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("user")
    public ResponseEntity<?> setUser(@RequestBody User user){
       User savedUser= userService.saveUser(user);
       return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }

    @GetMapping("user/{id}")
    public ResponseEntity<?> gerUserById(@PathVariable int id){
      User userObj=  userService.getUserById(id);
        return new ResponseEntity<>(userObj, HttpStatus.OK);
    }
}
